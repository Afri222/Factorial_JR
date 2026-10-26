import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LlamaFactorial {
    /*
    public static void main(String[] args) {
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
    /*
        List<String> comando = List.of(
                javaBin,
                "-cp",
                rutaBase,
                "Factorial", // nombrePaquete.nombreClase
                (String.valueOf(5)),
                "i");

        /* java -cp /home/alumno/.... factorial.Factorial 5 i */
        /*   1    2       3                   4           5 6  => Parámetros */
/*
        ProcessBuilder pB = new ProcessBuilder(comando);
        System.out.println("---------comando" + comando);
        // (Llamo y) ejecuto el factorial (~~~calcula)
        Process p;
        try {
            p = pB.start();

            // Se procesa la salida del sub-proceso (resultado y estado)
            int codigoSalida = p.waitFor(); // El waitFor espera hasta q el subproceso termine, y después es cuando sigue.
            System.out.println("Código de salida del proceso: " + codigoSalida);
            if (codigoSalida == 0) {
                // Se procesa el subproceso
                BufferedReader lectorSalidaEstandar = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String salida = lectorSalidaEstandar.readLine();
                System.out.println(salida);
            }
        switch (codigoSalida) {
            case 0:
                System.out.println("Todo ha ido bien");
                break;
            case 1:
                System.out.println("Número de parámetros incorrecto.");
                break;
            case 2:
                System.out.println("Primer parámetro no numérico: debe ser un número.");
                break;
            case 3:
                System.out.println("Número no puede ser negativo.");
                break;
            case 4:
                System.out.println("Método de cálculo desconocido: debe ser Iterativo o Recursivo (I/i R/r).");
                break;
            case 5:
                System.out.println("Has introducido algo rarísimo brou");
                break;
        }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
        throw new RuntimeException(e);
    }

    }

    private static String dondeEstaElClass() throws URISyntaxException {
        String rutaBase;
        // Cómo localizar el '.class' del subproceso q qro invocar
        Class<?> claseObjetivo = Factorial.class; // Si está en otro paquete: nombrePaquete.Factorial.class;
            /* No se puede referenciar a alo más arriba, sólo a tu nvl o más abajo en el árbol */
    /*
        URL urlClase = claseObjetivo.getProtectionDomain().getCodeSource().getLocation(); // Para invocar al .class

        rutaBase = new File(urlClase.toURI()).getAbsolutePath(); // Da la ruta hasta los paquetes.
        return rutaBase;
    }

    private static String dondeEstaJava() {
        String javaHome = System.getProperty("java.home");
        return javaHome + File.separator + "bin" + File.separator + "java";
    }
    */
}
// (Hecho) git remote add origin https://github.com/Afri222/Factorial_JR.git
// (Hecho) git branch -M main
// (Error) git push -u origin main