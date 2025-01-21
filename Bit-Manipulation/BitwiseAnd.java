
public class BitwiseAnd {

    public static void main(String[] args) {

        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        int result = a & b;  // 0001 in binary, which is 1 in decimal
        System.out.println(result);  // Output: 1   
        
    }   
}

    // When to Use Bitwise AND*********************
        // 1. Checking Specific Bits (Bit Masking)
        // A bit mask is used for this purpose, where the desired bit is set to 1, and others are 0. 

        // 2. Clearing Specific Bits
        // Combine the AND operation with the bitwise NOT (~) operator to clear specific bits in a number

        // 3. Checking Even or Odd Numbers


    // Where to Use Bitwise AND************************

        // 1. Data Compression

        // 2 Network Programming