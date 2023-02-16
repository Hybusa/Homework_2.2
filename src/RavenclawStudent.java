public class RavenclawStudent extends Student{
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    RavenclawStudent(String name, int age, int magicPower, int transgressionRange
            , int cleverness, int wisdom, int wit, int creativity) {

        super(name, age, magicPower, transgressionRange, HogwartsFaculty.RAVENCLAW);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
        Hogwarts.addStudent(this);
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public static RavenclawStudent compareStudents(RavenclawStudent first, RavenclawStudent second) {
        int sumFirst = first.cleverness + first.wisdom + first.wit+ first.creativity ;
        int sumSecond = second.cleverness + second.wisdom + second.wit + second.creativity;

        return sumFirst>=sumSecond ? first : second;
    }

    @Override
    public String toString() {
        return String.format("%s%n Cleverness: %d%n Wisdom: %d%n Wit: %d%n Creativity:%d%n%n", super.toString()
                , this.cleverness, this.wisdom, this.wit, this.creativity);
    }
}
