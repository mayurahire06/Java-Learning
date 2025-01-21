
public class BitwiseUnsignedRightShift {
    public static void main(String[] args) {
        
        int a = -8;  // Binary: 11111111111111111111111111111000 (32-bit representation)
        int result = a >>> 2;
        System.out.println(result);  // Output: 1073741822 (Binary: 00111111111111111111111111111110)

    }
}