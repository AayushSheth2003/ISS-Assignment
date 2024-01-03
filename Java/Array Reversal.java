public class ReverseArray {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Display the original array
        System.out.println("Original Array:");
        displayArray(originalArray);

        // Reverse the array
        reverseArray(originalArray);

        // Display the reversed array
        System.out.println("\nReversed Array:");
        displayArray(originalArray);
    }

    // Function to reverse the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

    // Function to display the elements of the array
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
