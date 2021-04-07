package test;

import test.Dog;

import java.util.Random;

public class SmartDogWithEducation implements Dog {

    public void barkNumber() {
        Random random = new Random();
        System.out.println(random.nextInt(10));
    }
}
