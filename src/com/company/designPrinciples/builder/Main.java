package com.company.designPrinciples.builder;


public class Main {
    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder("Intel I9");
        builder.setBluetooth(true);
        builder.setRam(200);
        builder.setVideo("Nvidia");
        builder.setMemory(100);
        builder.build();
        Computer myComputer = builder.build();
        System.out.println(myComputer);
    }
}
