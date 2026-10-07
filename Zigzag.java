public class Zigzag {
    public static void main(String[] args) {
        
        String s = "PAYPALISHIRING";
        int numRows = 5;

        // Calculate the cycle length for the zigzag pattern
        int cycle = 2 * numRows - 2;

        // Create a 2D array to hold the zigzag pattern
        char[][] zigzag = new char[numRows][s.length()];

        // Fill the zigzag pattern in the 2D array
        for (int i = 0; i < s.length(); i++) {

            int position = i % cycle; // Position within the current cycle

            int row;
            int col = i / cycle * (numRows - 1); // Calculate the column based on the cycle

            // Determine the row based on the position within the cycle
            if (position < numRows) {

                // Going DOWN
                row = position;

            } else {

                // Going UP diagonally
                row = cycle - position;
                col += position - numRows + 1;
            }

            zigzag[row][col] = s.charAt(i);
        }
        
        // Print the zigzag pattern
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < s.length(); col++) {

                if (zigzag[row][col] == '\0') {
                    System.out.print(" ");
                } else {
                    System.out.print(zigzag[row][col]);
                }

                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
