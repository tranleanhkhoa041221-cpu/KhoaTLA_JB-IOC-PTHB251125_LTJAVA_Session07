package BaiTapGioi1;

public class Cat extends Animal {
    String breed;

    public Cat() {
    }

    public Cat(String breed) {
        this.breed = breed;
    }

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Cat is barking (the requirement says bark)");
    }
}

