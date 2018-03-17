package com.yr.javaCoreProject.nio;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.yr.JavaCoreProject.nio.User;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NIOTest {
    private final static String RESOURCES_TEST_PATH = "/home/vuhlyk/IdeaProjects/javacoresmallworks/src/main/resources";
    private static final String USERS_CSV_FILE = "/Users.csv";

    User user;

    @Test
    public void readAndCopyFile() throws IOException {
        // creating new file
        Path fileWithData = Paths.get(RESOURCES_TEST_PATH + USERS_CSV_FILE);

        if (!Files.exists(fileWithData)) {
            Files.createFile(fileWithData);
        } else {
            System.out.println("src/test/resources/User.txPatht file - IS ALREADY CREATED!");
        }

        // fill csv using Apache Commons CSV
        // https://www.callicoder.com/java-read-write-csv-file-apache-commons-csv/
        try (
                BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(RESOURCES_TEST_PATH + USERS_CSV_FILE));
                CSVPrinter csvPrinter = new CSVPrinter(bufferedWriter, CSVFormat.DEFAULT
                        .withHeader("ID", "Name", "Age"));
        ) {
            csvPrinter.printRecord("1", "Sundar Pichai", 21);
            csvPrinter.printRecord("2", "Satya Nadella", 34);
            csvPrinter.printRecord("3", "Tim cook", 67);
            csvPrinter.printRecord("4", "Nick Zuckerberg", 78);
            csvPrinter.printRecord("5", "Alisa Zuckerberg", 90);
            csvPrinter.printRecord("6", "Her Morzhovyj", 34);
            csvPrinter.printRecord("7", "Gerold Druzhban", 41);
            csvPrinter.printRecord("8", "Iryna Satykevych ", 51);
            csvPrinter.printRecord("9", "Petrofan Brezhnev", 94);
            csvPrinter.printRecord("10", "Vladimir Illich", 28);

            csvPrinter.flush();
        }

        // read file and convert stream to collection
        List<User> listOfUsers = new ArrayList<User>();

        try {
            File csvFile = new File(RESOURCES_TEST_PATH + USERS_CSV_FILE);
            InputStream inputFS = new FileInputStream(csvFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

            listOfUsers = br.lines().skip(1) // we are skip header of .csv file
                    .map(x -> {
                        String[] p = x.split(",");// a CSV has comma separated lines
                        user = new User();
                        user.setId(p[0]); //this is the first column in the csv file
                        user.setName(p[1]); //this is the second column in the csv file
                        user.setAge(p[2]); //this is the third column in the csv file
                        return user;
                    }).collect(Collectors.toList());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("CAN NOT FIND FILE .svg FOR READING!");
        }

        // print result
        listOfUsers.forEach(System.out::println);

//        // -= For example =-
//        // The same, but using solution from Internet
//        // https://www.callicoder.com/java-read-write-csv-file-opencsv
//
//            ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
//            strategy.setType(User.class);// removing CSV file after test
//            String[] memberFieldsToBindTo = {"id", "name", "age"};
//            strategy.setColumnMapping(memberFieldsToBindTo);
//
//            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
//                    .withMappingStrategy(strategy)
//                    .withSkipLines(1)
//                    .withIgnoreLeadingWhiteSpace(true)
//                    .build();
//
//            // create new Users with the same valuess like in collection
//            List<User> users = csvToBean.parse();
//
//            for (User myUser : users) {
//                System.out.println("ID : " + myUser.getId());
//                System.out.println("Name : " + myUser.getName());
//                System.out.println("Age : " + myUser.getAge());
//                System.out.println("---------------------------");
//            }
    }
}
