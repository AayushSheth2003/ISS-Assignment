public class LoopAndIfExample {

    public static void main(String[] args) {
        // Example of a for loop
        System.out.println("Example of a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // Example of a while loop with an if-then statement
        System.out.println("\nExample of a while loop with an if-then statement:");
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);

            // If-then statement
            if (count % 2 == 0) {
                System.out.println("Even number!");
            } else {
                System.out.println("Odd number!");
            }

            count++;
        }

        // Example of a do-while loop
        System.out.println("\nExample of a do-while loop:");
        int num = 1;
        do {
            System.out.println("Number: " + num);

            // If-then statement
            if (num > 3) {
                System.out.println("Number is greater than 3!");
            } else {
                System.out.println("Number is not greater than 3!");
            }

            num++;
        } while (num <= 5);
    }
}
