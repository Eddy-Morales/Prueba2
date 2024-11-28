
public class Videojuegos {
    String desarrollador;
    String genero;

    public Videojuegos() {}
    public Videojuegos(String desarrollador, String genero) {
        this.desarrollador = desarrollador;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
    public void mostrarVideojuego() {
        System.out.println("Desarrollador: " + desarrollador);
        System.out.println("Genero: " + genero);
    }
}
