package Sprint1.s01_06.lv1;

public class GenericMethods {
    public static <T> void printTriple(T... params) {
        System.out.println(params[0]);
        System.out.println(params[1]);
        System.out.println(params[2]);
    }
}
