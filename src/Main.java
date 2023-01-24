public class Main {
    public static void main(String[] args) {
        Persona jhon = new Persona();
        jhon.setEdad(25);
        jhon.setNombre("Jhon Davis");
        jhon.setTelefono("33389881111");
        System.out.println(jhon.getNombre()+"\n"+jhon.getEdad()+"\n"+jhon.getTelefono());
    }
}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;
    public int getEdad(){
      return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

}