package Assignment_3_Arrays;

import java.util.Scanner;

public class P_21_Von_Neuman_Loves_Binary {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of binary numbers

        // Process each binary number
        for (int i = 0; i < n; i++) {
            String binary = scanner.next(); // Binary representation as string
            int decimal = binaryToDecimal(binary); // Convert binary to decimal
            System.out.println(decimal); // Output decimal representation
        }
    }

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        // Iterate over each character of binary string (right to left)
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = Character.getNumericValue(binary.charAt(i)); // Get binary bit at position i
            decimal += bit * Math.pow(2, power); // Add bit * 2^power to decimal representation
            power++; // Increment power
        }

        return decimal;
    }

}
