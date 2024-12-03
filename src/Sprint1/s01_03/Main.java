package Sprint1.s01_03;

import helper.Printer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Exercise 1

        ArrayList<Month> months = new ArrayList<Month>();
        for(Month.MONTH_NAME name : Month.MONTH_NAME.values()){
            if(name == Month.MONTH_NAME.AUGUST)
                continue; // Spaniards don't work in August
            months.add(new Month(name));
        }

        Printer.printIterable(months);
        months.add(6, new Month(Month.MONTH_NAME.AUGUST));
        Printer.printIterable(months);

        System.out.println("Converted ArrayList to HashSet. ");
        HashSet<Month> hs = new HashSet<>(months);
        hs.add(new Month(Month.MONTH_NAME.JANUARY)); // No duplicates test

        Printer.printIterable(hs);

        System.out.println("Printing with for loop: ");
        for(Month m : hs){
            System.out.print(m.getValue() + ", ");
        }

        // Exercise 2

        List<Integer> myList = new ArrayList<>();



    }
}





