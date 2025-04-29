public class OOPInheritance {
    public static void main(String[] args) {

        // Inheritance = Bir sınıfın metotlarını ve nitelikleriniz başka bir alt sınıfa
        //               miras bırakma işlemidir . alt sınıfa subclass , üst sınıfa superclass da denir.


        Dog dog  = new Dog();
        Cat cat =  new Cat();
        Plant plant = new Plant();

        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);
        System.out.println(plant.isAlive);

        cat.eat();
        dog.eat();
        plant.fotosentez();

        System.out.println(cat.lives);
        System.out.println(dog.lives);

        cat.speak();
        dog.speak();

    }
}
