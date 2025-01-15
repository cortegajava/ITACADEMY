package Sprint1.s01_08.lv3;

public class Student {
    private final String name;
    private final int age;
    private final String _class;
    private final float GPA;

    public Student(String name, int age, String _class, float GPA) {
        this.name = name;
        this.age = age;
        this._class = _class;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public String get_class() {
        return _class;
    }

    public float getGPA() {
        return GPA;
    }
}
