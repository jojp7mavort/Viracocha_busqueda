
public class Estudiante {
    private String nombreCompleto;
    private String cedula;
    private int edad;
    private String genero;

    public Estudiante(String nombreCompleto, String cedula, int edad, String genero) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
}
