import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

/**
 * This class demonstrates the use of Stack to store and sort a list of integers.
 */
public class SortedStack {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Create a List to temporarily hold the integers
        List<Integer> tempList = new ArrayList<>();

        // Prompt the user to enter integers
        System.out.println("Enter integer numbers (type 'done' to finish):");

        // Read integers from the input and add them to the List
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                tempList.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    // Prompt the user to enter a valid integer or 'done' to finish
                    System.out.println("Please enter an integer or type 'done' to finish.");
                }
            }
        }

        // Sort the List in ascending order
        Collections.sort(tempList);

        // Create a Stack to hold the sorted integers
        Stack<Integer> stack = new Stack<>();

        // Push the sorted integers onto the Stack
        for (int number : tempList) {
            stack.push(number);
        }

        // Print the sorted Stack
        System.out.println("Sorted Stack: " + stack);
    }
}
