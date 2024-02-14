import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        InputUser inputuser = new InputUser();

        Object[] detailsStudent = new Object[3];

        System.out.println("Enter Number of Records: ");
        int n = scan.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            detailsStudent = inputuser.inputStudent();
            students[i] = new Student((Integer) detailsStudent[1], (String) detailsStudent[0], (String) detailsStudent[2]);
        }

        display(students);
    }

    public static void display(Student[] students) {
        int count = 1;
        System.out.println("___________RECORDS___________");
        for (Student student : students) {
            System.out.println("_________" + count + " RECORD____________");
            System.out.println("Name of Student: " + student.getName());
            System.out.println("\n PRN of student:" + student.getPRN());
            System.out.println("\n PRN of student:" + student.getDOB());
            count++;
        }
    }
}
