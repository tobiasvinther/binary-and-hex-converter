package application;

import static application.BinaryConverter.toBinary;
import static application.HexConverter.toHex;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hexadecimal of 10 is: "+toHex(10));
        System.out.println("Hexadecimal of 15 is: "+toHex(15));
        System.out.println("Hexadecimal of 256 is: "+toHex(256));

        System.out.println("Binary of 10 is: "+toBinary(10));
        System.out.println("Binary of 15 is: "+toBinary(15));
        System.out.println("Binary of 3 is: "+toBinary(3));

    }
}
