public class Task10 {

    class Student {
        private String firstName;
        private String lastName;

        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void printFullName() {
            System.out.println(firstName + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Task10 outer = new Task10();

        Student[] students = new Student[] {
            outer.new Student("Morgan", "Freeman"),
            outer.new Student("Brad", "Pitt"),
            outer.new Student("Kevin", "Spacey"),
        };

        for (Student s : students) {
            s.printFullName();
        }
    }
}
