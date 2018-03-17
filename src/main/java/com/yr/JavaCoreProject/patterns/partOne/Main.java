package com.yr.JavaCoreProject.patterns.partOne;

import com.yr.JavaCoreProject.patterns.Sources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int counter = 0;

        Sources sources = new Sources();
        InputStreamReader inputStreamReader = null;
        BufferedReader br = null;

        try {
            for (Map.Entry<String, Character> question : sources.QUESTIONS.entrySet()) {

                inputStreamReader = new InputStreamReader(System.in);
                br = new BufferedReader(inputStreamReader);

                System.out.println(question.getKey());
                if (question.getValue().equals(br.readLine().charAt(0))) {
                    counter++;
                } else {
                    System.out.println("Enter N or Y, please");
                }
            }

            System.out.println("Counter is: " + counter);

            if (counter <= 3) {
                System.out.println("You are a Junior java developer");
            } else if (counter >= 4 && counter <= 7) {
                System.out.println("You are a Middle java developer");
            } else {
                System.out.println("You are a Senior java developer");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
