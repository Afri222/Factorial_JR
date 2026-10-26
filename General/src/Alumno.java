import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private int nota;
    private LocalDate fechaNacimiento;

    public Alumno(String nombre) {
        this.fechaNacimiento = fechaNacimiento;
        this.nota = nota;
        this.nombre = nombre;
    }

    public Alumno(String nombre, LocalDate fechaNacimiento, int nota) {
        this.fechaNacimiento = fechaNacimiento;
        this.nota = nota;
        this.nombre = nombre;
    }

    /* public static Alumno ññññ(String nombre, LocalDate fechaNacimiento, int nota) {
        return new Alumno(nombre, fechaNacimiento, nota);
    } */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}
