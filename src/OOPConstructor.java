public class OOPConstructor {
    public static void main(String[] args) {

        // constructor = A special methods to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        OOPStudent student1 = new OOPStudent("lucifer" , 34 , 2.4);
        OOPStudent student2 = new OOPStudent("Emenediyıl" , 36 , 3.7);
        OOPStudent student3 = new OOPStudent("Azrail" , 22 , 4.0);

        student1.study();
        student2.study();
        student3.study();

        System.out.println();

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

    }
}
