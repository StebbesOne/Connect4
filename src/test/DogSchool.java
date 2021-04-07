package test;

public class DogSchool {
    public DogSchool() {
        float commaNumber = 5.9f;
        while(commaNumber > 1) {
            System.out.println(commaNumber);
            commaNumber = commaNumber - 1;
        }
        for(int i = 0; i < 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println(commaNumber);

        DumbDog bruno = new DumbDog();
        DumbDog fido = new DumbDog();

        bruno.easyNumber = 2;

        Dog pierre = new SmartDogWithEducation();
        pierre.barkNumber();

        Dog mike = new EducatedMagicDog();
        Dog brutus = new EducatedMagicDog();

        EducatedMagicDog.magicEasyNumber = 5;
        mike.barkNumber();
        brutus.barkNumber();

        Dog[] dogArmy = new Dog[5];
        dogArmy[0] = new DumbDog();
        dogArmy[1] = new DumbDog();
        dogArmy[2] = new SmartDogWithEducation();
        dogArmy[3] = new SmartDogWithEducation();
        dogArmy[4] = new EducatedMagicDog();

        for(int i = 0; i < dogArmy.length; i++) {
            dogArmy[i].barkNumber();
        }
    }
}
