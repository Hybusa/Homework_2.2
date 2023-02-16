public class HufflepuffStudent extends Student {

    private int diligence;
    private int loyalty;
    private int honesty;

    HufflepuffStudent(String name, int age, int magicPower, int transgressionRange
            , int diligence, int loyalty, int honesty) {

        super(name, age, magicPower, transgressionRange, HogwartsFaculty.HUFFLEPUFF);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
        Hogwarts.addStudent(this);
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static HufflepuffStudent compareStudents(HufflepuffStudent first, HufflepuffStudent second) {
        int sumFirst = first.diligence + first.loyalty + first.honesty ;
        int sumSecond = second.diligence + second.loyalty + second.honesty;

        return sumFirst>=sumSecond ? first : second;
    }

    @Override
    public String toString() {
        return String.format("%s%n Diligence: %d%n Loyalty: %d%n Honesty: %d%n%n", super.toString()
                , this.diligence, this.loyalty, this.honesty);
    }
}

