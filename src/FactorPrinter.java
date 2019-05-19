public class FactorPrinter {

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");

        } else {

            int target = 1;
            while (target <= number) {
                if (number % target == 0){
                    System.out.println(target);
                }
                target++;
            }
        }
    }
}