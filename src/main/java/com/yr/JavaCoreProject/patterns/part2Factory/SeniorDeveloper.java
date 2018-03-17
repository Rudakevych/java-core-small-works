package com.yr.JavaCoreProject.patterns.part2Factory;

public class SeniorDeveloper extends Developer implements IDeveloper {

    public SeniorDeveloper(int score) {
        super(score);
    }

    public SeniorDeveloper() {
        super();
    }

    @Override
    public void print() {
        System.out.println("You are a senior Java developer");
    }
}
