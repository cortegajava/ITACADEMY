package Sprint1.s01_02.lv1;

class emptySaleException extends Exception {
    private static final String msg = "Per fer una venda primer has d’afegir productes";

    public emptySaleException() {
        super(msg);
    }

    public String getMessage() {
        return msg;
    }
}
