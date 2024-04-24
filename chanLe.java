public class chanLe {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " là số chẵn");
            } else {
                System.out.println(number + " là số lẻ");
            }
        }
    }
}
