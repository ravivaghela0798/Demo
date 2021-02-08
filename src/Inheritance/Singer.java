package Inheritance;

public class Singer extends Person {

    public void sing(){

        System.out.println(name + " is Singing.....");
    }

    public void eat(){

        System.out.println("Singer " + name + " is eating.....");
    }

    public static void laughing(){

        System.out.println("Singer is Laughing.....");
    }
}
