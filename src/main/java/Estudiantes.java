/**
 * Created by carlosalberto on 6/3/2017.
 */
public class Estudiantes {

    private String nombre;
    private String apellido;
    private String telefono;
    private int matricula;


    public Estudiantes(String nombre, String apellido, String telefono, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.matricula = matricula;
    }

    public Estudiantes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
