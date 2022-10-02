package com.venvo.demo.generic;

import java.util.Random;

public class RobotFactory implements GenericFactory<String,Integer>{
    private String[] stringRobot = new String[]{"Hello","Hi"};
    private Integer[] integerRobot = new Integer[]{111,000};

    public String nextObject() {

        Random random = new Random();
        return stringRobot[random.nextInt(2)];//[0,2]
    }

    public Integer nextNumber() {
       Random random = new Random();
       return integerRobot[random.nextInt(2)];
    }

    public static void main(String[] args) {
        GenericFactory<String,Integer> factory=new RobotFactory();
        System.out.println(factory.nextObject());
        System.out.println(factory.nextNumber());

    }
}
