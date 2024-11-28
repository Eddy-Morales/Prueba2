import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Videojuegos videojuego1 = new Videojuegos("Nintendo","Accción");
        Ventas ventas1 = new Ventas();
        Region region1= new Region();
        Cliente cliente1 = new Cliente();

        System.out.println("--------------- NINTENDO ------------");
        System.out.println("---- SISTEMA DE INGRESO DE DATOS ----");
        ventas1.ingesarVentas();
        region1.ingresoRegion();
        cliente1.ingresarCliente();

        System.out.println("----------INFORMACION COMPLETA----------");
        videojuego1.mostrarVideojuego();
        ventas1.mostrarVentas();
        region1.mostrarRegion();
        cliente1.mostrarCliente();
    }
}