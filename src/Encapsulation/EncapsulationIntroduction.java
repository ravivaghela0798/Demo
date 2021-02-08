package Encapsulation;

public class EncapsulationIntroduction {

    public static void main(String[] args) {

        Student ob = new Student();
//        ob.roll_no = 39;
//        ob.name = "Ravi Vaghela";


        ob.setRoll_no(99);
        System.out.println(ob.getRoll_no());

    }
}
