package com.company.oo.challenge3;

public class TestAnimals {
    public static void test() {
        Fish f = new Fish();
        f.walk();
        f.eat();
        Animal a = new Fish();
        a.walk();
        a.eat();
        Cat cat = new Cat("Fluffy");
        cat.walk();
        Animal c = new Cat("Fluffier");
        Animal e = new Spider();
        System.out.println(e.legs);
        e.eat();
        ((Animal) e).eat();
        ((Animal) c).eat();
        Pet p = new Cat();
        System.out.println(p.getName());
        p.setName("Furry");
        System.out.println(p.getName());
        ((Animal) c).walk();
        c = e;
        System.out.println(c.legs);
        e = f;
        System.out.println(e.legs);
        e.walk();
    }

}
