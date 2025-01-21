
public class BitwiseOr {
    public static void main(String[] args) {
        
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        int result = a | b;  // 0111 in binary, which is 7 in decimal
        System.out.println(result);  // Output: 7


        // Where Is Bitwise OR Used?*************
        
        // System Programming:
        // Used in low-level programming tasks like setting bits in device registers.

        // Permissions Systems:
        // Widely used in permission models (e.g., file systems, user access rights) where each bit represents a specific permission.

        // Graphics Programming:
        // Used in operations like combining color channels or blending pixels.

        // Data Compression and Encryption:
        // Useful in encoding and decoding data efficiently.

        // Control Flags:
        // Used to enable or combine multiple control flags in application logic.



        // Key Properties of Bitwise OR******************

        // Commutative: a | b == b | a
        // Associative: (a | b) | c == a | (b | c)
        // Identity Element: a | 0 == a (OR with 0 keeps the number unchanged)
        // Dominance: a | -1 == -1 (OR with all 1s results in all 1s)

    }
}
