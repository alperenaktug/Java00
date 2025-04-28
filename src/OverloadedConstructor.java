public class OverloadedConstructor {
    public static void main(String[] args) {

        // overloaded constructors = Allow a class to have multiple constructors
        //                             with different parameter lists.
        //                            Enable objects to be initialized in various ways.

        User user1 = new User();
        User user2 = new User("Kendrick");
        User user3 = new User("2pack" , "2pack@gmail.com");
        User user4 = new User("Biggi" , "Biggi@gmail.com" , 35);

        System.out.println(user1.name);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println();

        System.out.println(user2.name);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println();

        System.out.println(user3.name);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println();

        System.out.println(user4.name);
        System.out.println(user4.email);
        System.out.println(user4.age);



    }
}
