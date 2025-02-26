import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SortedLinkedList {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to hold the integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter integer numbers (type 'done' to finish):");

        // Read integers from the input and add them to the LinkedList
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                linkedList.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Please enter an integer or type 'done' to finish.");
                }
            }
        }

        // Sort the LinkedList
        Collections.sort(linkedList);

        // Print the sorted LinkedList
        System.out.println("Sorted LinkedList: " + linkedList);
    }
}
