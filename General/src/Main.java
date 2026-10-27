import java.time.LocalDate;
// import java.time.Month;
// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        LocalDate ayer = LocalDate.of(2026, 10, 25);
        System.out.println("Hoy: " + hoy);
        System.out.println("Ayer: " + ayer);

        // List<String> lista = new ArrayList<>();

        // Punto p1 = new Punto(3, -4);
        Punto p2 = Punto.of(3, -4) ;
        System.out.println(p2);
        Punto p3 = Punto.axis();
        System.out.println(p3);

/*      List<String> nombres = Arrays.asList("Ana", "Carlos", "Sofia", "David");
        long total = nombres.stream()
                .filter(n -> n.startsWith("S")) // Operación intermedia
                .count();                       // Operación terminal
        List<String> nombresEnOferta = productos.stream()
                .filter(p -> p.getPrecio() < 50)       // Filtra por precio menor a 50
                .map(Producto::getNombre)              // Transforma el objeto Producto a un String (su nombre)
                .collect(Collectors.toList());        // Guarda el resultado en una nueva lista
        Usuario usuario = usuarios.stream()
                .filter(u -> u.getId() == 45)
                .findFirst()                           // Busca el primero que coincida
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        double totalGastado = facturas.stream()
                .mapToDouble(Factura::getMonto)        // Convierte el stream a tipo numérico primitivo
                .sum();                                // Suma todos los valores
        List<String> busquedasLimpias = historial.stream()
                .distinct()                            // Elimina los elementos repetidos
                .sorted()                              // Ordena alfabéticamente
                .limit(5)                              // Se queda solo con los primeros 5 resultados
                .collect(Collectors.toList());  */
        /* Paralelismo opcional: Puedes usar .parallelStream() para aprovechar múltiples núcleos del procesador en grandes volúmenes de datos */

        List<Alumno> listaAlumnos = List.of(
                new Alumno("Moisés", LocalDate.of(2007, 5, 18),8),
                new Alumno("Liz", LocalDate.of(2004, 10, 27),6),
                new Alumno("Rebecca", LocalDate.of(2007, 6, 20),4));

        List<Alumno> listaActualizada = listaAlumnos.stream()
                .filter(a -> "Moisés".equalsIgnoreCase(a.getNombre()) && a.getFechaNacimiento().getYear() == 2007)
                // .collect(Collectors.toList()); // ~ Casi deprecated
                .map( a -> { if ("Moisés".equalsIgnoreCase(a.getNombre()) && a.getFechaNacimiento().getYear() == 2007) {
                            a.setNota(a.getNota() + 1);
                        }
                        return a;
                })
                .toList();

        System.out.println("Lista alumnos: " + listaAlumnos);
        System.out.println("Lista actualizada: " + listaActualizada);

        List<String> listaNombres = listaAlumnos.stream()
                .filter(a -> a.getFechaNacimiento().isBefore(LocalDate.of(2007, 6, 1)))
                .map(Alumno::getNombre)
                .sorted()
                .toList()
                .reversed();
        System.out.println("Listado de nombres: " + listaNombres);

        double media = listaAlumnos.stream()
                .collect(Collectors.averagingDouble(Alumno::getNota));
        System.out.println("Media de las notas: " + media);
    }
}
