package Sprint1.s01_06.lv3.ex1;

public class Generic {
    public static <T extends Telephone> void genericT(T telephone){
        telephone.call();
        // smartphone can't take Photos from genericT
    }
    public static <S extends Smartphone> void genericS(S smartphone){
        smartphone.call();
    }
}
