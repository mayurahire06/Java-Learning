public class BitwiseXor {
    public static void main(String[] args) {
        // XOR operation on 5 and 3
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        int result = a ^ b;  // 0110 in binary, which is 6 in decimal
        System.out.println(result);  // Output: 6


        // 1. Swapping Two Numbers Without a Temporary Variable************************
        // a = 5; // 0101 in binary
        // b = 3; // 0011 in binary
        
        // Swapping using XOR
        // a = a ^ b; // a becomes 6 (0110)
        // b = a ^ b; // b becomes 5 (0101)
        // a = a ^ b; // a becomes 3 (0011)
        
        // System.out.println("a = " + a); // Output: a = 3
        // System.out.println("b = " + b); // Output: b = 5
        

        // 2. Checking if Two Numbers are Different*********************************
        // x = 10; 
        // y = 10;
        // if ((x ^ y) == 0) {
        //     System.out.println("x and y are equal");
        // } else {
        //     System.out.println("x and y are different");
        // }


        // 3. Finding the Single Non-Repeating Element******************
        // int[] nums = {2, 3, 5, 3, 2};
        // int resultNum = 0;
        // for (int num : nums) {
        //     resultNum ^= num;
        // }
        // System.out.println("Single number: " + resultNum); // Output: Single number: 5


        // 4. Toggling Bits************************
        // num = 5; // 0101 in binary
        // int mask = 1; // 0001 in binary (toggle the least significant bit)
        // num = num ^ mask; // num becomes 0100 (4 in decimal)
        // System.out.println("Toggled number: " + num); // Output: 4
    }
}
