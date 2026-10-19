import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LlamaFactorial {
    static void main() {
            // Podría ser desde 2 apps distintas o desde otro programa tmb al ser un proceso.
        // Configuramos el sub-proceso a ejecutar (la pasamos número y metodo)
        // dnd está java
        String javaBin = dondeEstaJava();

        String rutaBase = "";
        try {
            rutaBase = dondeEstaElClass();
            System.out.println(rutaBase);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        // Connstruyo la llamada al subproceso
        /* javaBin
        * -cp /home/alumno/IdeaProjects/FactorialIt/out/production/FactorialIt
        * factorial.Factorial
        * 5 i
         */
        List<String> comando = List.of(
                javaBin,
                "-cp",
                rutaBase,
                "factorial.Factorial", // nombrePaquete.nombreClase
                (String.valueOf(5)),
                "i");
        /* java -cp /home/alumno/.... factorial.Factorial 5 i */
        /*   1    2       3                   4           5 6  => Parámetros*/



        //ProcessBuilder pB = ;

        // (Llamo y) ejecuto el factorial (~~~calcula)
        //Process p = pB.start();

        // Se procesa la salida del sub-proceso (resultado y estado)
    }

    private static String dondeEstaElClass() throws URISyntaxException {
        String rutaBase;
        // Cómo localizar el '.class' del subproceso q qro invocar
        Class<?> claseObjetivo = Factorial.class; // Si está en otro paquete: nombrePaquete.Factorial.class;
            /* No se puede referenciar a alo más arriba, sólo a tu nvl o más abajo en el árbol */
        URL urlClase = claseObjetivo.getProtectionDomain().getCodeSource().getLocation(); // Para invocar al .class

        rutaBase = new File(urlClase.toURI()).getAbsolutePath(); // Da la ruta hasta los paquetes.
        return rutaBase;
    }

    private static String dondeEstaJava() {
        String javaHome = System.getProperty("java.home");
        return javaHome + File.separator + "bin" + File.separator + "java";
    }
}
