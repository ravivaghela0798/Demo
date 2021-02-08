package Encapsulation;

public class StaticKeyword {

    static {
        System.out.println("Block 1 : ");
    }
    static {
        System.out.println("Block 2 : ");
    }

    public static void main(String[] args) {

        System.out.println("Inside Main : ");

        A obA = new A();
        A.B obB = obA.new B();

        A.C obC = new A.C();

    }
    static {
        System.out.println("Block 1 : ");
    }
    static {
        System.out.println("Block 2 : ");
    }
}
