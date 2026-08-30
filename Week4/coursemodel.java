public class CourseEnrollment {

    public static void main(String[] args) {

        Course c1 = new Course("CS101", "Java", 3);

        System.out.println(c1);

        System.out.println("Enroll: " + c1.enroll());
        System.out.println(c1);

        System.out.println("Enroll: " + c1.enroll());
        System.out.println(c1);

        System.out.println("Enroll: " + c1.enroll());
        System.out.println(c1);

        System.out.println("Is full: " + c1.isFull());

        System.out.println("Over enrollment: " + c1.enroll());

        System.out.println(c1);

        System.out.println("Withdraw: " + c1.withdraw());
        System.out.println(c1);

        System.out.println("Withdraw: " + c1.withdraw());
        System.out.println("Withdraw: " + c1.withdraw());
        System.out.println(c1);

        System.out.println("Withdraw from empty course: "
                + c1.withdraw());

        System.out.println();

        Course c2 = new Course("CS102", "Arrays", 2);

        System.out.println(c2);

        System.out.println("Enroll: " + c2.enroll());

        System.out.println("Available seats: "
                + c2.getAvailableSeats());

        System.out.println("Is full: " + c2.isFull());

        System.out.println("Enroll: " + c2.enroll());

        System.out.println("Is full: " + c2.isFull());
    }
}
