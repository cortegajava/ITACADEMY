package helper;
import java.util.Iterator;

public class Printer {
    public static <T extends Printable> void printIterable(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();

        while(it.hasNext()) {
            T object = it.next();
            if(it.hasNext())
                System.out.print(object.getValue() + ", ");
            else
                System.out.print(object.getValue()+". ");
        }
        System.out.println();
    }
}
