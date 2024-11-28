import java.util.Scanner;
public class Cliente extends Region {
    String nombre;
    String direccion;
    int telefono;

    public Cliente() {}
    public Cliente(String desarrollador, String genero, String nombre, double precio, String region, int unidades, String direccion, String nombre1, int telefono) {
        super(desarrollador, genero, nombre, precio, region, unidades);
        this.direccion = direccion;
        this.nombre = nombre1;
        this.telefono = telefono;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void ingresarCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Nombre del Cliente: ");
        this.setNombre(sc.nextLine());
        System.out.println("Ingrese Direccion del Cliente: ");
        this.setDireccion(sc.nextLine());
        System.out.println("Ingrese Telefono del Cliente: ");
        this.setTelefono(sc.nextInt());
    }
    public void mostrarCliente() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Telefono: " + this.getTelefono());
    }
}
