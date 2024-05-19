import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static int min, max;
    private static long sum, mult;

    public static void main(String[] args) {
        readNumbers("numbers.txt");
        System.out.println("Min: " + _min());
        System.out.println("Max: " + _max());
        System.out.println("Sum: " + _sum());
        System.out.println("Mult: " + _mult());
    }

    private static void readNumbers(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            String[] numbers = line.split("\\s+");
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                addNumber(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNumber(int num) {
        if (num < min) min = num;
        if (num > max) max = num;
        sum += num;
        mult *= num;
    }

    public static int _min() {
        return min;
    }

    public static int _max() {
        return max;
    }

    public static long _sum() {
        return sum;
    }

    public static long _mult() {
        return mult;
    }
}
