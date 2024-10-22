package OOPS.inheritance;

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.swim();
        f1.eat();
        f1.breathe();
    }
}
class Animal {
    void eat() {
        System.out.println("Eating");
    }
    void breathe() {
        System.out.println("Breathe");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("Swim in water");
    }
}