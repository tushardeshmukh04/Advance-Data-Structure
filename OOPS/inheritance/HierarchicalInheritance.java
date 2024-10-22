package OOPS.inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
         System.out.println("--------Tesla-----");
         Tesla t1 = new Tesla();
         t1.autopilot();
         t1.run();
         System.out.println("--------Thar------");
         Thar t2 = new Thar();
         t2.offRoadCapability();
         t2.run();
         System.out.println("-------RollsRoyce------");
         RollsRoyce rr = new RollsRoyce();
         rr.Assist();
         rr.run();
    }
}
class Car {
    void run(){
        System.out.println("can Run");
    }
}
class Tesla extends Car {
    void autopilot(){
        System.out.println("AutoPilot");
    }
}
class Thar extends Car {
    void offRoadCapability() {
        System.out.println("Off-Road Capability");
    }
}
class RollsRoyce extends Car {
    void Assist() {
        System.out.println("A system that connects your car to an emergency services call center");
    }
}
