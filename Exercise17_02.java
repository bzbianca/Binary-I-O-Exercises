import java.io.*;
import java.util.Date;

/**
 * Exercise 2: Write and read binary data
 * 
 * Requirements:
 * Part 1 - WRITE:
 * - Store an array of five int values: 1, 2, 3, 4, 5
 * - Store a Date object for the current time
 * - Store the double value 5.5
 * - Write all to file named Exercise17_02.dat
 * 
 * Part 2 - READ:
 * - In the same program, read the data back
 * - Display all values to verify they were stored correctly
 * 
 * @author Bianca Baccay
 */
public class Exercise17_02 {
    
    public static void main(String[] args) throws IOException {

        // Data to write
        int[] numbers = {1, 2, 3, 4, 5};
        Date currentTime = new Date();
        double value = 5.5;

        // PART 1: WRITE DATA
        // TODO: Create DataOutputStream for "Exercise17_02.dat"
        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream("Exercise17_02.dat"))) {


            // TODO: Write the array of integers
            // Hint: Loop through the array and use writeInt() for each element
            for (int num : numbers) {
                output.writeInt(num);
            }

            // TODO: Write the Date object
            // Hint: Use writeLong() to write currentTime.getTime()
            output.writeLong(currentTime.getTime());

            // TODO: Write the double value
            output.writeDouble(5.5);
        }
        // TODO: Close the output stream (or use try-with-resources)


        System.out.println("Data written to Exercise17_02.dat");


        // PART 2: READ DATA
        // TODO: Create DataInputStream for "Exercise17_02.dat"
        int[] readNums;
        Date newDate;
        double readDouble;
        try (DataInputStream input = new DataInputStream(
                new FileInputStream("Exercise17_02.dat"))) {

            // TODO: Read the array of integers
            // Hint: Create a new array and use readInt() five times
            readNums = new int[5];
            for (int i = 0; i < readNums.length; i++) {
                readNums[i] = input.readInt();
            }


            // TODO: Read the Date object
            // Hint: Use readLong() and create new Date with that value
            long numDate = input.readLong();
            newDate = new Date(numDate);

            // TODO: Read the double value
            readDouble = input.readDouble();
        }
        // TODO: Close the input stream (or use try-with-resources)


        // TODO: Display all the data you read
        System.out.println("\nData read from Exercise17_02.dat:");
        // Display array, date, and double value
        for (int num : readNums) {
            System.out.println(num);
        }
        System.out.println(newDate);
        System.out.println(readDouble);


    }
}