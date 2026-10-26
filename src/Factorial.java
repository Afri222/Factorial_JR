// import CodigoSalida.values;
public class Factorial {
    static void main(String[] args) {
        System.out.println("Ciao");

        if (args.length != 2) {
            System.out.println("Número de parámetros incorrecto.");
            System.exit(CodigoSalida.NUMERO_PARAMETROS_INCORRECTOS.getCodigo());
        }

        try {
            // if (String.valueOf(args[0]).matches("\\d+")) { // \\d+ = Uno o más dígitos
            int num = Integer.parseInt(args[0]);
            if (String.valueOf(args[0]).matches("\\d+")) { // \\d+ = Uno o más dígitos
                System.out.println("Primer parámetro no numérico: debe ser un número");
                System.exit(CodigoSalida.NUMERO_PARAMETROS_INCORRECTOS.getCodigo());
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        int num = Integer.parseInt(args[0]);

        if (num < 0) {
            System.out.println("EL número no puede ser negativo.");
            System.exit(CodigoSalida.NUMERO_NEGATIVO.getCodigo());
        }

        String caracter = String.valueOf(args[1]);

        /* try {
            Thread.sleep(10000); // Retardo de 10 seg
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } */

            if ("i".equalsIgnoreCase(caracter)) {
                System.out.println( Utilidades_Fact.factorIt(num) );
            } else if ("r".equalsIgnoreCase(caracter)) {
                System.out.println( Utilidades_Fact.factorRe(num) );
            } else {
                System.out.println("Método de cálculo desconocido: debe ser Iterativo o Recursivo (I/i R/r)");
                System.exit(CodigoSalida.METODO_CALCULO_INCORRECTO.getCodigo());
            }


    }
}
