public class Main {
    public static void main(String[] args) {

        //Можно было сделать с помощью фабрики со switch по valueOfFaculty,
        // но так было бы непонятно какие поля зполнять какими параметрами

        //Gryffindor
        GryffindorStudent hermione = new GryffindorStudent("Hermione Granger", 13, 88, 54
                , 89, 88, 71);
        GryffindorStudent ron = new GryffindorStudent("Ron Weasley", 12, 40, 45
                , 90, 71, 90);
        GryffindorStudent harry = new GryffindorStudent("Harry Potter", 11, 99, 89
                , 90, 98, 84);

        //Slytherin
        SlytherinStudent draco = new SlytherinStudent("Draco Malfoy", 12, 79, 64
                , 89, 12, 54,49,89);
        SlytherinStudent graham = new SlytherinStudent("Graham Montague", 14, 66, 68
                , 45, 55, 58, 74, 59);
        SlytherinStudent gregory = new SlytherinStudent("Gregory Goyle", 15, 34, 31
                , 35, 24, 21,45,18);

        //Hufflepuff
        HufflepuffStudent zacharias = new HufflepuffStudent("Zacharias Smith", 11, 63, 54
                , 88, 78, 86);
        HufflepuffStudent cedric = new HufflepuffStudent("Cedric Diggory", 15, 89, 88
                , 90, 89, 95);
        GryffindorStudent justin = new GryffindorStudent("Justin Finch-Fletchley", 14, 60, 38
                , 85, 64, 89);

        //Ravenclaw
        RavenclawStudent cho = new RavenclawStudent("Cho Chang", 15, 75, 51
                , 89, 87, 79,73);
        RavenclawStudent padma = new RavenclawStudent("Padma Patil", 14, 71, 59
                , 78, 81, 85,71);
        RavenclawStudent marcus = new RavenclawStudent("Marcus Belby", 13, 62, 41
                , 79, 78, 65,56);


        System.out.println(cho);
        System.out.println(GryffindorStudent.compareStudents(ron, harry).getName());
        System.out.println(SlytherinStudent.compareStudents(gregory, draco).getName());
        System.out.println(RavenclawStudent.compareStudents(cho,padma).getName());
        System.out.println(HufflepuffStudent.compareStudents(zacharias,cedric).getName());

        System.out.println(Student.compareMagicPower(harry, draco).getName());
        System.out.println(Student.compareTransgressionRange(hermione, justin).getName());

        System.out.println(Student.compareTotalMagicAbilities(graham, marcus).getName());

        System.out.println(Hogwarts.getStudents());

    }
}