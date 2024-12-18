package Sprint1.s01_06;

import Sprint1.s01_06.lv1.GenericMethods;
import Sprint1.s01_06.lv1.NoGenericMethods;
import Sprint1.s01_06.lv1.Person;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods no = new NoGenericMethods(9, "String", new Person("","",0));
        NoGenericMethods no2 = new NoGenericMethods(new Person("","",0), 9, "String");
        GenericMethods.printTriple(new Person("Charles", "Williams", 34), "This is a string", 2.000000002f);
    }
}
