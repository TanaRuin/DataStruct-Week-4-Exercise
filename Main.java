import java.util.*;

public class Main {

    public static void main(String[] args) {
        int numTests = 10;
        int[] inputS = {100, 1000, 10000, 100000};

        for (int inputSize : inputS) {
            long startTime, endTime;

            // Test ArrayList
            startTime = System.currentTimeMillis();
            testArrayList(inputSize);
            endTime = System.currentTimeMillis();
            System.out.println("ArrayList time for input size " + inputSize + ": " + (endTime - startTime) + " ms");

            // Test LinkedList
            startTime = System.currentTimeMillis();
            testLinkedList(inputSize);
            endTime = System.currentTimeMillis();
            System.out.println("LinkedList time for input size " + inputSize + ": " + (endTime - startTime) + " ms");
            System.out.println();
        }
    }

    public static void testArrayList(int inputSize) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < inputSize; i++) {
            list.add(random.nextInt(inputSize));
        }

        int sum = 0;
        for (int i = 0; i < inputSize; i++) {
            sum += list.get(i);
        }
    }

    public static void testLinkedList(int inputSize) {
        List<Integer> list = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < inputSize; i++) {
            list.add(random.nextInt(inputSize));
        }

        int sum = 0;
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
    }
}