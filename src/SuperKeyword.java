public class SuperKeyword {
    public static void main(String[] args) {
           // super : Alt sınıfıların üst sınıfın constructın ından bir parametreyi
           //          miras alması durumunda kendinde kullanması için super keywordüyle
           //          bunu parametre geçesi işlemine denir .

        Person person = new Person("Kendrick" , "Lamar");
        Student student = new Student("Tekashi" , "sixnine" ,2.3);
        Employee employee = new Employee("Mark" , "Zuckerberg" , 23000);

        person.showName();
        student.showGpa();
        employee.showSalary();





    }
}

