public class SchoolApp {
    public static void main(String[] args) {
        Student s1 = new Student("Javier", "Garcia", "BaeVAJ@naver.com", "Iguala", 123123, "Informatica", 9.1);
        Teacher t1 = new Teacher("Luis", "Morales", "LuisM@gmail.com", "Iguala", 123123, "si",4);


        //sobre carga de metodos
        System.out.println("Metodos toString() de student: " );
        System.out.println(s1.toString());
        System.out.println("--------------------------------");
        System.out.println("Metodos toString() de teacher: ");
        System.out.println(t1.toString());
        System.out.println("________________________________________________________________");
        System.out.println(s1.soy());
        System.out.println(t1.soy());
    }
}
