public class StudentRecord {
    public static void main(String[] args) {

        Student s1 = new Student("Prateek", "S101", 49);
        Student s2 = new Student("Dev", "S102", 53);
        Student s3 = new Student("Rahul", "S103", 78);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1.setMark(80);
        System.out.println(s1);

        s1.setMark(120);
        System.out.println(s1);
    }
}
