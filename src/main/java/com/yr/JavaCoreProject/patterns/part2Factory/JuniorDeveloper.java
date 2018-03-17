package com.yr.JavaCoreProject.patterns.part2Factory;

public class JuniorDeveloper extends Developer implements IDeveloper {

    public JuniorDeveloper(int score) {
        super(score);
    }

    public JuniorDeveloper() {
        super();
    }

    @Override
    public void print() {
        System.out.println("You are a junior Java developer");
    }
}
