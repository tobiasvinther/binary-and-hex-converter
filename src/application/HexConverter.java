package application;

public class HexConverter {

    public static String toHex(int decimal){
        int remaining; //what of our number remains to be "hexified"
        String hex = ""; //our result
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(decimal > 0)
        {
            remaining = decimal % 16; //get the remaining number of we divide by 16
            hex = hexChars[remaining] + hex; //add the hex character from the array at the index equal to the remaining number
            decimal = decimal / 16; //then we divide the decimal by 16 and continue the loop if decimal is still greater than 0
        }
        return hex;
    }
}
