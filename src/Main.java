public class Main {
    public static void main(String[] args) {

        Student stu1 = new Student("Bea");
        Student stu2 = new Student("Anthony");
        Student stu3 = new Student("Ethan");
        Student stu4 = new Student("Cardel");
        Student stu5 = new Student("Deshawn");

        HandsOnArrayList hands = new HandsOnArrayList();

        hands.addStudent(stu1);
        hands.addStudent(stu2);
        hands.addStudent(stu3);
        hands.addStudent(stu4);
        hands.addStudent(stu5);
        hands.displayStudent();

        hands.removeStudent(stu1);

        hands.displayStudent();
        hands.sortStudent();

    }

}