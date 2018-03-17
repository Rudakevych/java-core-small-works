package com.yr.JavaCoreProject.patterns.part3Singelton;


import com.yr.JavaCoreProject.patterns.part2Factory.DeveloperFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class MainTask3 {

    /**
     * Part№3
     * Implement a main method that is functionally identical to Test #2. In
     * this case, use a Singleton that poses the questions and gathers the answers.
     */

    public static void main(String[] args) {
        int counter = 0;

        InputStreamReader inputStreamReader = null;
        TaskSIngelton task;
        BufferedReader br = null;

        try {
            for (Map.Entry<String, Character> question : TaskSIngelton.getTaskSIngelton().QUESTIONS.entrySet()) {

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
