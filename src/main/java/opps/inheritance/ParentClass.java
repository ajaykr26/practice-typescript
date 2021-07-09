package opps.inheritance;

public class ParentClass {
    int num = 100;

    ParentClass() {
        System.out.println("Constructor of parent class");
    }

    void display() {
        System.out.println("Hello! parent");
    }
}

class ChildClass extends ParentClass {
    int num = 110;

    ChildClass() {
        System.out.println("Constructor of child class");
    }

    ChildClass(int num) {
        System.out.println("arg constructor of child class");
    }

    void display() {
        System.out.println("Hello!");
    }

    void printMsg(){
        display();
        super.display();
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.printMsg();
    }
}
