import java.util.Scanner;
public class Ventas extends Videojuegos{
    String nombre;
    double precio;

    public Ventas(){}
    public Ventas(String desarrollador, String genero, String nombre, double precio) {
        super(desarrollador, genero);
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void ingesarVentas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del videojuego");
        this.setNombre(sc.nextLine());
        System.out.println("Ingrese el precio del videojuego");
        this.setPrecio(sc.nextDouble());
    }

    public void mostrarVentas(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio() +"$");
    }
}
