package EasyClassesAndObjects;

import java.util.Random;
import java.util.Scanner;

public class Student {


    Scanner scanner = new Scanner(System.in);

    private String surnameAndAbbreviated;
    private int groupsNumber;
    private int[] perfomance;
    private Object[] objects;


    Student(String surnameAndAbbreviated, int groupsNumber, int orderOfStudent) {
        this.surnameAndAbbreviated = surnameAndAbbreviated;
        this.groupsNumber = groupsNumber;
        System.out.println("Surname and abbreviated of student: " + surnameAndAbbreviated);
        System.out.println("Groups number: " + groupsNumber);
        addMarks();
        addStudent(orderOfStudent);

    }



    private void addStudent(int orderNumber) {
        objects[orderNumber] = new Student(surnameAndAbbreviated, groupsNumber, orderNumber);
        System.out.println("Student: " + objects[orderNumber]);

    }

    private void addMarks() {
        Random random = new Random();
        perfomance = new int[5];
        System.out.print("[");
        for (int i = 0; i < perfomance.length; i++) {
            perfomance[i] = 10;
            //perfomance[i] = random.nextInt(11);
            System.out.print(perfomance[i] + ", ");
        }
        System.out.print("]");

    }


    private void checkPerfomance(int[] perfomance) {
        for (int i = 0; i < perfomance.length; i++) {
            if (perfomance[i] > 8) {
                System.out.println("Input your surname and abbreviated: ");
                surnameAndAbbreviated = scanner.next();
                System.out.println("Input your group's number: ");
                groupsNumber = scanner.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Bohan A.V.", 5673, 1);
        Student student1 = new Student("Hrin P.K.", 5673, 2);
        Student student2 = new Student("Lalc U.I.", 5673, 3);
        Student student3 = new Student("Poty P.N.", 5673, 4);
        Student student4 = new Student("Tyu P.M.", 5673, 5);
        Student student5 = new Student("Lila O.N.", 5673, 6);
        Student student6 = new Student("Gaga L.U.", 5673, 7);
        Student student7 = new Student("Kyt P.B.", 5673, 8);
        Student student8 = new Student("Pyr P.K.", 5673, 9);
        Student student9 = new Student("Ziz I.U.", 5673, 10);


        student.checkPerfomance(student.perfomance);
        student1.checkPerfomance(student1.perfomance);
        student2.checkPerfomance(student2.perfomance);
        student3.checkPerfomance(student3.perfomance);
        student4.checkPerfomance(student4.perfomance);
        student5.checkPerfomance(student5.perfomance);
        student6.checkPerfomance(student6.perfomance);
        student7.checkPerfomance(student7.perfomance);
        student8.checkPerfomance(student8.perfomance);
        student9.checkPerfomance(student9.perfomance);
//TODO
    }
}
