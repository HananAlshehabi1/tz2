import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static int _mult(int[] numbers) {
        int mult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            mult *= numbers[i];
        }
        return mult;
    }

    public static int _min(int[] numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }

    public static int _sum(int[] numbers) {
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int _max(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }

    public static void main(String[] args) {
        try {
            String fileName = "numbers.txt";
            FileReader reading = new FileReader(fileName);
            BufferedReader buff = new BufferedReader(reading);
            String order = buff.readLine();
            String[] numberStr = order.split(" ");
            int[] numbers = new int[numberStr.length];
            for (int i = 0; i < numberStr.length; i++) {
                try {
                    numbers[i] = Integer.parseInt(numberStr[i]);
                } catch (NumberFormatException err) {
                    System.out.println("Error: " + err.getMessage());
                    System.exit(0);
                }
            }
            System.out.println("Min: " + _min(numbers));
            System.out.println("Max: " + _max(numbers));
            System.out.println("Sum: " + _sum(numbers));
            System.out.println("Mult: " + _mult(numbers));

        } catch (IOException err) {
            System.out.println(err.getMessage());
            System.exit(0);
        }
    }
}
