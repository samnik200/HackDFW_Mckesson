public class Main {
    public static void main(String[] args) {
        int intArrs[] = {2, 0, 1, 9};



        int numberConverted = 0;
        for (int number : intArrs) {
            numberConverted = 10*numberConverted + number;
        }

        System.out.print(" -> converted: ");
        System.out.println(numberConverted);
    }
}