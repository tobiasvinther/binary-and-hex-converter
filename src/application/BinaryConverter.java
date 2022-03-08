package application;

import java.util.ArrayList;
import java.util.List;

public class BinaryConverter {

    public static String toBinary(int decimal){
        int remaining; //what of our number remains
        String binary = ""; //our result
        char[] binaryChars = {'0', '1'};

        while(decimal > 0)
        {
            remaining = decimal % 2;
            binary = binaryChars[remaining] + binary; //add the binary character from the array at the index equal to the remaining number
            decimal = decimal / 2; //then we divide the decimal by 16 and continue the loop if decimal is still greater than 0
        }
        return binary;
    }

    /*
    public static int toDecimal(String binaryString) {
        List<Integer> decimalList = new ArrayList<>();
        int placement = binaryString.length();

        binaryString.toCharArray();
        binaryString.


        for(int i = 0;i<binaryString.length();i++){

            decimalList.add(binaryString.charAt(i))
            placement
        }
    }
     */
}
