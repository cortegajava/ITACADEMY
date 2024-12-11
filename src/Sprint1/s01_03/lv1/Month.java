package Sprint1.s01_03.lv1;

public class Month {
    private MONTH_NAME name;

    public enum MONTH_NAME {
        JANUARY, FEBRUARY, MARCH, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }
    private static final MONTH_NAME[] MONTH_NAME_ARR = MONTH_NAME.values();

    @Override
    public String toString() {
        return name.toString();
    }

    public void setValue(MONTH_NAME name) {
        this.name = name;
    }

    public Month(MONTH_NAME monthName) {
        name = monthName;
    }
}
