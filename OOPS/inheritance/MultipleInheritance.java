package OOPS.inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eats();
    }
}
interface Herbivore{
      public void eats();
}
interface Carnivore {
      public void eats();
}
class Bear implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("beer is a herbivore and carnivore");
    }
}
