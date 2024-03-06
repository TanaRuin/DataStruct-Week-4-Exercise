import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCompare {
    public static void main(String[] args) {
        // Creating ArrayList with some elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        // Accessing elements using Iterator
        long startTimeIterator = System.nanoTime();
        accessWithIterator(arrayList);
        long endTimeIterator = System.nanoTime();
        long durationIterator = (endTimeIterator - startTimeIterator) / 1000000; // Converting to milliseconds

        // Accessing elements using for loop
        long startTimeForLoop = System.nanoTime();
        accessWithForLoop(arrayList);
        long endTimeForLoop = System.nanoTime();
        long durationForLoop = (endTimeForLoop - startTimeForLoop) / 1000000; // Converting to milliseconds

        // Printing results
        System.out.println("Time taken to access elements using Iterator: " + durationIterator + " milliseconds");
        System.out.println("Time taken to access elements using for loop: " + durationForLoop + " milliseconds");
    }

    public static void accessWithIterator(ArrayList<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            // Accessing the element, here you can perform any operation with the element
        }
    }

    public static void accessWithForLoop(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Integer element = arrayList.get(i);
            // Accessing the element, here you can perform any operation with the element
        }
    }
}
