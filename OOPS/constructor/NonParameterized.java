package OOPS.constructor;

public class NonParameterized {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("tushar","computer");
        System.out.println(t1.name);
        System.out.println(t1.dept);

    }
}

class Teacher {
    String name;
    String dept;
    Teacher(String newName, String NewDept){
        this.name = newName;
        this.dept = NewDept;
    }
}