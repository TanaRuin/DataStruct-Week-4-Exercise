import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class KWLinkedList{
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Dick");
        names.add("Harry");
        names.add("Sam");

        // Insert "Bill" before "Tom"
        ListIterator<String> iterator = names.listIterator();
        if (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("Tom")) {
                iterator.previous();
                iterator.add("Bill");
            } else {
                names.addFirst("Bill");
            }
        } else {
            names.addFirst("Bill");
        }

        // Insert "Sue" before "Sam"
        iterator = names.listIterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("Sam")) {
                iterator.previous();
                iterator.add("Sue");
                break;
            }
        }

        // Remove "Bill"
        iterator = names.listIterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("Bill")) {
                iterator.remove();
                break;
            }
        }

        // Remove "Sam"
        iterator = names.listIterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("Sam")) {
                iterator.remove();
                break;
            }
        }

        System.out.println(names);
    }
}