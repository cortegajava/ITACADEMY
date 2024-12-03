package Sprint1.s01_03;


import helper.Printable;

public class Month implements Printable {
    private MONTH_NAME name;

    public enum MONTH_NAME {
        JANUARY, FEBRUARY, MARCH, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }
    private static final MONTH_NAME[] MONTH_NAME_ARR = MONTH_NAME.values();

    @Override
    public MONTH_NAME getValue() {
        return name;
    }

    public void setValue(MONTH_NAME name) {
        this.name = name;
    }

    public Month(MONTH_NAME monthName) {
        name = monthName;
    }
}
