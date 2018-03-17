package com.yr.JavaCoreProject.patterns.part2Factory;

import com.yr.JavaCoreProject.patterns.Sources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class MainTask2 {

    /**
     * Part №2
     * Implement a main method that is functionally identical to Test #1. In
     * this case, use a IDeveloper that is able to produce 3 types of
     * developers that implement a "print" method. The Factory should have a
     * create method that takes the user's score as an argument.
     */

    public static void main(String[] args) {
        int counter = 0;

        InputStreamReader inputStreamReader = null;
        Sources sources = new Sources();
        BufferedReader br = null;

        try {
            for (Map.Entry<String, Character> question : sources.QUESTIONS.entrySet()) {

                inputStreamReader = new InputStreamReader(System.in);
                br = new BufferedReader(inputStreamReader);

                System.out.println(question.getKey());
                if (question.getValue().equals(br.readLine().charAt(0)))
                    counter++;
                else
                    System.out.println("Incorrect answer");
            }

            System.out.println("Correct: " + counter);
            DeveloperFactory.getDeveloper(counter);

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
