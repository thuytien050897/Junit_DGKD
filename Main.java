import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        
        System.out.println(classifyNumber(number));
        
        System.out.println("Các số từ 1 đến " + number + ":");
        System.out.println(getNumberSequence(number));
    }
    
    public static String classifyNumber(int number) {
        if (number > 0) {
            return "Số dương";
        } else if (number < 0) {
            return "Số âm";
        } else {
            return "Số không";
        }
    }
    
    public static String getNumberSequence(int number) {
        StringBuilder sequence = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            sequence.append(i).append(" ");
        }
        return sequence.toString();
    }
}
