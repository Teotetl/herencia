public class Teacher extends Person {
    private int biocard;
    private String adscription;
    private int asignatedHours;

    public Teacher() {
    }

    public Teacher(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }

    public Teacher(String name, String lastName, String email, String address, int biocard, String adscription, int asignatedHours) {
        super(name, lastName, email, address);
        this.biocard = biocard;
        this.adscription = adscription;
        this.asignatedHours = asignatedHours;
    }

    public int getBiocard() {
        return biocard;
    }

    public void setBiocard(int biocard) {
        this.biocard = biocard;
    }

    public String getAdscription() {
        return adscription;
    }

    public void setAdscription(String materia) {
        this.adscription = adscription;
    }

    public int getAsignatedHours() {
        return asignatedHours;
    }

    public void setAsignatedHours(int asignatedHours) {
        this.asignatedHours = asignatedHours;
    }

    public String toString() {
        System.out.println("El maestro : " + getName());
        System.out.println("Con biocard: " + getBiocard());
        System.out.println("Correo electronico: " + getEmail());
        System.out.println("Y direccion: " + getAddress());
        System.out.println("adscripcion: " + getAdscription());
        System.out.println("Tiene un total de: " + getAsignatedHours() + " horas asignadas");
        return "";
    }
    public String soy (){
        return "Soy una persona maestro";
    }
}
