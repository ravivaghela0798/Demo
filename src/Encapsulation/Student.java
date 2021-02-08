package Encapsulation;

public class Student {

    private int roll_no;
    private String name;

    public int getRoll_no(){

        return roll_no;
    }

    public void setRoll_no(int roll_no){

        if (roll_no>100) {
            System.out.println("You are Not Selected...");
        }else {
            this.roll_no = roll_no;
            System.out.println("You are Roll Number is :- ");
        }

    }
}
