package com.yr.JavaCoreProject.patterns.part2Factory;

public class DeveloperFactory {
    public static void getDeveloper(int counter) {
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MediorDeveloper mediorDeveloper = new MediorDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        if (counter <= 3)
            juniorDeveloper.print();
        else if (counter >= 4 && counter <= 7)
            mediorDeveloper.print();
        else
            seniorDeveloper.print();
    }
}
