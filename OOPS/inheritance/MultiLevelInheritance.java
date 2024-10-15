package OOPS.inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.eat();
        tommy.legs = 4;
        System.out.println(tommy.legs);
        tommy.breed = "rottweiler";
        System.out.println(tommy.breed);
    }
}
class Animals {
    String color;
    void eat(){
        System.out.println("Eating");
    }

}
class Mammal extends Animal {
    int legs;
}
class Dog extends Mammal {
    String breed;
}