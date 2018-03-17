package com.yr.JavaCoreProject.patterns.part2Factory;

public class Developer {
    private int score;

    public Developer(int score) {
        this.score = score;
    }

    public Developer() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Developer's score=" + score;
    }
}
