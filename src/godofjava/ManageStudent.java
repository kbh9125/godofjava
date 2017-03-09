package godofjava;

/**
 * Create file : ${FILE_NAME}
 * Creator : KimBangHyun
 * Create time : 2017. 3. 2. 오전 8:47
 */
public class ManageStudent {
    public static void main(String [] args) {
        ManageStudent mgt = new ManageStudent();
        Student [] student = null;

        System.out.println("Method addStduent & printStudents call...");
        student = mgt.addStudent();
        mgt.printStudents(student);

        System.out.println("Method checkEquals call...");
        mgt.checkEquals();

    }

    public Student[] addStudent() {
        Student [] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook","Seoul","01012345678","aaa@hyundaicard.com");
        return student;
    }

    public void printStudents(Student ... student) {
        for (int loop=0 ; loop<=2 ; loop++) {
            System.out.println(student[loop].toString());
        }
    }

    public void checkEquals() {
        Student a = new Student("Min","Seoul","01012345678","ask@godofjava.com");
        Student b = new Student("Min","Seoul","01012345678","ask@godofjava.com");

        if ( a.equals(b) ) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
