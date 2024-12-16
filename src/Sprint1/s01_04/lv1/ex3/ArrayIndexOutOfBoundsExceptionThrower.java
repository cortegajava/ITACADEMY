package Sprint1.s01_04.lv1.ex3;

public class ArrayIndexOutOfBoundsExceptionThrower {
    static public void thrower(boolean throwIt) throws ArrayIndexOutOfBoundsException {
        if(throwIt) throw new ArrayIndexOutOfBoundsException();
    }
}
