package literalsanddatatypes;
import java.util.Scanner;

public class SizeOfDataType {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the datatype for which you want to find the size (e.g., int, byte, short, long, etc.):");
        String stringval = s.next();
        
        System.out.println("Enter the number of bits for the " + stringval + ":");
        int bytevalue = s.nextInt();
        
        int size = sizeMethod(bytevalue);
        int value1 = size / 2;
        int value2 = (size / 2) - 1;

        System.out.println("Size of " + stringval + " in bits: " + size);
        System.out.println("Range of " + stringval + " values: " + (-value1) + " to " + value2);
    }

    public static int sizeMethod(int bits) {
        // The number of values representable by a certain number of bits is 2^bits.
        return (int) Math.pow(2, bits);
    }
}