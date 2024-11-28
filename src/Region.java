import java.util.Scanner;
public class Region extends Ventas {
    String region;
    int unidades;

    public Region() {}
    public Region(String desarrollador, String genero, String nombre, double precio, String region, int unidades) {
        super(desarrollador, genero, nombre, precio);
        this.region = region;
        this.unidades = unidades;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    public void ingresoRegion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingreso la region");
        this.setRegion(sc.nextLine());
        System.out.println("Ingresa el numero de unidades vendidas");
        this.setUnidades(sc.nextInt());
    }
    public void mostrarRegion() {
        System.out.println("Region: "+getRegion() );
        System.out.println("Unidades vendidas: "+getUnidades() );
    }
}
