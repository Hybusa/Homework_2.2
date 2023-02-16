public class GryffindorStudent extends Student {
    private int nobility;
    private int bravery;
    private int honesty;

    GryffindorStudent(String name, int age, int magicPower, int transgressionRange
            , int nobility, int bravery, int honesty) {

        super(name, age, magicPower, transgressionRange, HogwartsFaculty.GRIFFINDOR);
        this.nobility = nobility;
        this.bravery = bravery;
        this.honesty = honesty;
        Hogwarts.addStudent(this);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static GryffindorStudent compareStudents(GryffindorStudent first, GryffindorStudent second) {
        int sumFirst = first.bravery + first.honesty + first.nobility;
        int sumSecond = second.bravery + second.honesty + second.nobility;

        return sumFirst>=sumSecond ? first : second;
    }

    @Override
    public String toString() {
        return String.format("%s%n Nobility: %d%n Bravery: %d%n Honesty: %d%n%n", super.toString()
                , this.nobility, this.bravery, this.honesty);
    }
}
