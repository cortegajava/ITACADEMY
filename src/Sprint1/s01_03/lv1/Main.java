package Sprint1.s01_03.lv1;

import java.io.FileWriter;
import java.util.*;
import java.io.File;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        // Exercise 1

        ArrayList<Month> months = new ArrayList<Month>();
        for(Month.MONTH_NAME name : Month.MONTH_NAME.values()){
            if(name == Month.MONTH_NAME.AUGUST)
                continue; // Spaniards don't work in August
            months.add(new Month(name));
        }

        System.out.println(months);
        months.add(6, new Month(Month.MONTH_NAME.AUGUST));
        System.out.println(months);

        System.out.println("Converted ArrayList to HashSet. ");
        HashSet<Month> hs = new HashSet<>(months);
        hs.add(new Month(Month.MONTH_NAME.JANUARY)); // No duplicates test

        System.out.println("\nPrinting with iterable: ");
        System.out.println(hs);

        System.out.println("\nPrinting with for loop: ");
        for(Month m : hs){
            System.out.print(m.toString() + ", ");
        }
        System.out.println();

        // Exercise 2

        List<Integer> myList = new ArrayList<>();
        for(int i = 0; i<10; i++){
            myList.add(i);
        }
        System.out.println(myList);

        List<Integer> myListReversed = new ArrayList<>();
        ListIterator<Integer> iter = myList.listIterator(myList.size());
        while(iter.hasPrevious()) {
            myListReversed.add(iter.previous());
        }

        System.out.println(myListReversed);
        System.out.println();

        // Exercise 3

        HashMap<String, String> cc = new HashMap<>();

        try {
            File countries = new File("resources/countries.txt");
            Scanner myScanner = new Scanner(countries);

            while(myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                if(line.isEmpty()) continue;
                String[] countryAndCapital = line.split(" ");
                cc.put(countryAndCapital[0], countryAndCapital[1]);
            }

            Object[] cities = cc.keySet().toArray();

            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            System.out.println("Enter username: ");
            String userName = input.nextLine();
            int score = 0;

            for(int i = 0; i < 10; i++) {
                String randomCity = (String) cities[rand.nextInt(cities.length)];
                System.out.println("Enter the capital for " + randomCity + ":");
                String attempt = input.nextLine();
                if(cc.get(randomCity).replaceAll("[\\s_]+","").equalsIgnoreCase(attempt.replaceAll("[\\s_]+",""))) {
                    System.out.println("Correct capital!");
                    score++;
                }
                else {
                    System.out.println("Wrong capital. ");
                }
            }

            File f = new File("output/classification.txt");
            f.createNewFile();
            FileWriter myWriter = new FileWriter(f);
            myWriter.write("User: " + userName + "\n");
            myWriter.write("Score: " + score + "\n");
            myWriter.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}





