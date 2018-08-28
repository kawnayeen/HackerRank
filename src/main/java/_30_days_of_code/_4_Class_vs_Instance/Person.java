package _30_days_of_code._4_Class_vs_Instance;

public class Person {
    public static String INVALID_AGE = "Age is not valid, setting age to 0.";
    public static String YOUNG_AGE = "You are young.";
    public static String TEENAGE = "You are a teenager.";
    public static String OLD_AGE = "You are old.";

    private int age;

    public Person(int age) {
        if (age < 0) {
            System.out.println(INVALID_AGE);
            this.age = 0;
        } else
            this.age = age;
    }

    public void amIOld() {
        if (age < 13)
            System.out.println(YOUNG_AGE);
        else if (age < 18)
            System.out.println(TEENAGE);
        else
            System.out.println(OLD_AGE);
    }

    public void yearPasses() {
        age++;
    }
}
