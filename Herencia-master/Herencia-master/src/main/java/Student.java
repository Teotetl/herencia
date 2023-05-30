public class Student extends Person {
    private int controlNumber;
    private String career;
    private double generalAverage;

    public Student() {
    }

    public Student(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }

    public Student(String name, String lastName, String email, String address, int controlNumber, String career, double generalAverage) {
        super(name, lastName, email, address);
        this.controlNumber = controlNumber;
        this.career = career;
        this.generalAverage = generalAverage;
    }

    public int getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public double getGeneralAverage() {
        return generalAverage;
    }

    public void setGeneralAverage(double generalAverage) {
        this.generalAverage = generalAverage;
    }
    public String toString(){
        System.out.println("El alumno : " + getName());
        System.out.println("Con el numero de control: " +getControlNumber());
        System.out.println("Correo electronico: " + getEmail());
        System.out.println("Y direccion: " + getAddress());
        System.out.println("De la carrera: " + getCareer());
        System.out.println("Tiene un promedio general de: " + getGeneralAverage());
        return "";
    }
    public String soy(){
        return "Soy una persona estudiante";

    }
}
