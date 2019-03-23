package com.forever.pattern.delegatePattern.simple;

public class SimpleTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("架构",new Leader());

    }
}
