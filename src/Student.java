public abstract class Student {
    private final String name;
    private int age;
    private int magicPower;
    private int transgressionRange;
    private final HogwartsFaculty faculty;

    public Student(String name, int age, int magicPower, int transgressionRange, HogwartsFaculty faculty) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.magicPower = magicPower;
        this.transgressionRange = transgressionRange;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }

    public HogwartsFaculty getFaculty() {
        return faculty;
    }

    public static Student compareTransgressionRange(Student first, Student second) {
        return first.transgressionRange >= second.transgressionRange ? first : second;
    }

    public static Student compareMagicPower(Student first, Student second) {
        return first.magicPower >= second.magicPower ? first : second;
    }

    public static Student compareTotalMagicAbilities(Student first, Student second) {
        int firstTotal = first.magicPower + first.transgressionRange;
        int secondTotal = second.magicPower + second.transgressionRange;
        return firstTotal>=secondTotal ? first : second;
    }

    @Override
    public String toString() {
        return String.format(" Name: %s%n Age: %d%n Faculty: %s%n Magic power: %d%n Range of Transgression: %d",
                this.name, this.age, this.faculty, this.magicPower, this.transgressionRange);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        return this.name.equals(((Student) obj).name);
    }
}
