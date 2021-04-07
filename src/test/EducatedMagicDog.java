package test;

import test.Dog;

public class EducatedMagicDog implements Dog {
    static int magicEasyNumber;

    @Override
    public void barkNumber() {
        System.out.println(magicEasyNumber);
    }
}
