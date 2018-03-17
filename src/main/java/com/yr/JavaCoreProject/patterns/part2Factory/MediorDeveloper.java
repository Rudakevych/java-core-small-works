package com.yr.JavaCoreProject.patterns.part2Factory;

public class MediorDeveloper extends Developer implements IDeveloper {

    public MediorDeveloper(int score) {
        super(score);
    }

    public MediorDeveloper() {
        super();
    }

    @Override
    public void print() {
        System.out.println("You are a medior Java developer");
    }
}
