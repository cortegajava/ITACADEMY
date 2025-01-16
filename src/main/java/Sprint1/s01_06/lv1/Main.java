package Sprint1.s01_06.lv1;

import Sprint1.s01_06.lv1.ex1.NoGenericMethods;
import Sprint1.s01_06.lv1.ex2.GenericMethods;
import Sprint1.s01_06.lv1.ex2.Person;

public class Main {
    public static void main(String[] args) {
        // TODO: revise ex1, separate lv into exercises
        // TODO: use Main separate from drivers
        NoGenericMethods no = new NoGenericMethods(9, "String", new Person("","",0));
        NoGenericMethods no2 = new NoGenericMethods(new Person("","",0), 9, "String");
        GenericMethods.printTriple(new Person("Charles", "Williams", 34), "This is a string", 2.000000002f);
    }
}
