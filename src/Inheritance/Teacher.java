package Inheritance;

public class Teacher extends Person {

    public void teach(){

        System.out.println(name + " is Teaching.....");
    }

    public void eat(){

        System.out.println("Teacher " + name + " is eating.....");
    }

    public static void laughing(){

        System.out.println("Teacher is Laughing.....");
    }

}
