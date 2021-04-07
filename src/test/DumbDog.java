package test;

import test.Dog;

public class DumbDog implements Dog {

    int easyNumber;

    void piss() {
        System.out.println("Der test.Dog pisst... Oh mann er hat meinen Fuß");
    }

    public void barkNumber() {
        System.out.println("Woof " + easyNumber);
    }

}
