public enum HogwartsFaculty {
    GRIFFINDOR("Griffindor"),
    HUFFLEPUFF("Hufflepuff"),
    RAVENCLAW("Ravenclaw"),
    SLYTHERIN("Slytherin");

    private final String faculty;
    HogwartsFaculty(String faculty)
    {
        this.faculty = faculty;
    }

    public static HogwartsFaculty valueOfFaculty(String faculty)  {
        for (HogwartsFaculty fac : values()) {
            if (fac.faculty.equals(faculty)) {
                return fac;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.faculty;
    }
}
