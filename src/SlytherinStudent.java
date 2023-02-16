public class SlytherinStudent extends Student {
    private int trickery;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerThirst;

    SlytherinStudent(String name, int age, int magicPower, int transgressionRange
            , int trickery, int determination, int ambition, int resourcefulness, int powerThirst) {

        super(name, age, magicPower, transgressionRange, HogwartsFaculty.SLYTHERIN);
        this.trickery = trickery;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerThirst = powerThirst;
        Hogwarts.addStudent(this);
    }

    public int getTrickery() {
        return trickery;
    }

    public void setTrickery(int trickery) {
        this.trickery = trickery;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPowerThirst() {
        return powerThirst;
    }

    public void setPowerThirst(int powerThirst) {
        this.powerThirst = powerThirst;
    }

    public static SlytherinStudent compareStudents(SlytherinStudent first, SlytherinStudent second) {
        int sumFirst = first.trickery + first.determination + first.ambition
                + first.resourcefulness + first.powerThirst;
        int sumSecond = second.trickery + second.determination + second.ambition
                + second.resourcefulness + second.powerThirst;

        return sumFirst >= sumSecond ? first : second;
    }

    @Override
    public String toString() {
        return String.format("%s%n Trickery: %d%n Determination: %d%n Ambition: %d%n Resourcefulness:%d%n " +
                        "Thirst for power: %s%n%n", super.toString()
                , this.trickery, this.determination, this.ambition, this.resourcefulness, this.powerThirst);
    }
}
