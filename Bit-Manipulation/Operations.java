public class Operations {
    public static void main(String[] args) {
        
        int number = 29; // Binary: 00011101
        int position = 3; // Bit position to manipulate (0-based, from right)

        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");

        // 1. Check if the bit at the position is 1 or 0
        boolean isBitSet = (number & (1 << position)) != 0;
        System.out.println("Is bit at position " + position + " set? " + isBitSet);

        // 2. Set the bit at the position to 1
        int setBit = number | (1 << position);
        
        // CHANGED: Added Integer.toBinaryString() to print the binary representation of setBit
        System.out.println("After setting bit at position " + position + ": " + setBit + " (Binary: " + Integer.toBinaryString(setBit) + ")");

        // 3. Clear the bit at the position (set it to 0)
        int clearBit = number & ~(1 << position);
        // CHANGED: Added Integer.toBinaryString() to print the binary representation of clearBit
        System.out.println("After clearing bit at position " + position + ": " + clearBit + " (Binary: " + Integer.toBinaryString(clearBit) + ")");

        // 4. Toggle the bit at the position
        int toggleBit = number ^ (1 << position);
        // CHANGED: Added Integer.toBinaryString() to print the binary representation of toggleBit
        System.out.println("After toggling bit at position " + position + ": " + toggleBit + " (Binary: " + Integer.toBinaryString(toggleBit) + ")");

        // 5. Update the bit at the position to a specific value (0 or 1)
        int value = 0; // Change to 1 to set the bit (value can be either 0 or 1)
        int updateBit = (number & ~(1 << position)) | (value << position);
        // CHANGED: Added Integer.toBinaryString() to print the binary representation of updateBit
        System.out.println("After updating bit at position " + position + " to " + value + ": " + updateBit + " (Binary: " + Integer.toBinaryString(updateBit) + ")");
    }
}


// Bit manipulation is a technique in programming that involves directly working with the binary representation of data using bitwise operators. It is frequently used in Java for performance optimization, compact data representation, and solving algorithmic problems efficiently.

// Why Use Bit Manipulation in Java?******************

// Efficiency and Speed:  Bitwise operations (&, |, ^, ~, <<, >>) are low-level operations and are executed very quickly by the CPU.
                        //  They are faster than arithmetic or conditional operations.

// Memory Optimization:
// Algorithmic Solutions:
// Compact Representation:
// Simplifying Complex Problems:
