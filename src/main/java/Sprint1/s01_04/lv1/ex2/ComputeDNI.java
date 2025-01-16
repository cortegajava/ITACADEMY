package Sprint1.s01_04.lv1.ex2;

public class ComputeDNI {

    private static final char[] LETTER = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();

    private ComputeDNI() { }

    public static char computeLetter(int dni) {
        return LETTER[dni % 23];
    }

}
