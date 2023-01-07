package exam01;

public class StudentTest {
    public static void main(String[] args) {
        /*exam01.Student studyStudent = new exam01.Student(); //기본 생성자
        studyStudent.name = "박나진";*/

        Student studyStudent = new Student("박나진");
        Student sleepStudent = new Student("나진");

        System.out.println(studyStudent.name);

    }
}
