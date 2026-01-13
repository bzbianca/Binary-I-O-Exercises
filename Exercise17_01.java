import java.io.*;

/**
 * Exercise 1: Write 100 random integers to a text file
 * 
 * Requirements:
 * - Create a file named Exercise17_01.txt if it does not exist
 * - If the file already exists, APPEND new data (don't overwrite)
 * - Write 100 integers created randomly (use Math.random())
 * - Integers should be separated by a space
 * - Use text I/O (PrintWriter)
 * 
 * @author Bianca Baccay
 */
public class Exercise17_01 {
    
    public static void main(String[] args) throws IOException {
        // TODO: Create a File object for "Exercise17_01.txt"
        File exercise = new File("Exercise17_01.txt");

        // TODO: Create PrintWriter in APPEND mode
        // Hint: Use FileWriter with append parameter set to true
        try (PrintWriter output = new PrintWriter(new FileWriter("Exercise17_01.txt", true))) {


        // TODO: Generate and write 100 random integers
        // Hint: Use Math.random() to generate random integers
        // Hint: Separate integers with a space
            for (int i = 0; i < 101; i++) {
                output.print((int) (Math.random() * 101) + " ");
            }

        }
        
        // TODO: Close the file (or use try-with-resources)

        
        System.out.println("100 random integers written to Exercise17_01.txt");
    }
}
