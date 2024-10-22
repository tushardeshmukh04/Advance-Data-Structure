package OOPS.inheritance;
//combination of single and hierarchical inheritance
public class HybridInheritance {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.showd();
        d.showm();
        d.showg();
        Son s = new Son();
        s.shows();
        s.showm();
        s.showg();
    }
}
class Grandmother {
    void showg(){
        System.out.println("is a grandMother");
    }
}
class Mother extends Grandmother {
    void showm() {
        System.out.println("is a mother");
    }
}
class Son extends Mother {
    void shows() {
        System.out.println("ia a son");
    }
}
class Daughter extends Mother {
    void showd() {
        System.out.println("ia a Daugther");
    }
}