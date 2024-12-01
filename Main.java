package nested_loops;
import java.util.Scanner;

public class Main {

    public static boolean isPerfectNumber(Object number) {
        int sum = 0;
        if (number instanceof Integer) { // Check if number is an Integer
            int num = (Integer) number; // Cast Object to Integer
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            return sum == num;
        } else if (number instanceof Long) { // Check if number is a Long
            long num = (Long) number; // Cast Object to Long
            long longSum = 0; // Use a long for summing
            for (long j = 1; j < num; j++) {
                if (num % j == 0) {
                    longSum += j;
                }
            }
            return longSum == num;
        } else {
            System.err.println(number + "is not a perfect number");
            return false;
        }
    }
    
    public static long userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long number = scanner.nextLong();
        scanner.close();
        return number;
    }

    public static void main(String[] args){
        Object number = userInput();
        boolean isPerfect = isPerfectNumber(number);
        if(isPerfect){
            System.out.println("The number " + number + " is a perfect number");
        }else{
            System.out.println("The number " + number + " is a not perfect number");
        }
    }
}



