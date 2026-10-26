public class NumerosCombinatorios {
    public static void main(String[] args) {
        System.out.println( NumerosCombinatorios.combinatorio(Integer.parseInt(args[0]), Integer.parseInt(args[0]), String.valueOf(args[2])) );

        /* ???¿
        [Pto 2...]
        La clase debe invocar a los métodos creados en la clase Factorial. Para ello, no se usará el metodo de cálculo (que sí se necesita para el siguiente punto).
        [Pto 3:]
        La clase NumerosCombinatorios, en lugar de usar los métodos creados en la clase Factorial, va a asumir que es un comando del sistema y lo va a invocar como proceso,
        usando ProcessBuilder y Process. En cada invocación, le pasará como parámetro el número del cual se quiere calcular el factorial y el metodo de calculo.
        Se deben minimizar las invocaciones.        */
    }

    public static int combinatorio (int m, int n, String metodo) {
        // = m! / (n! * (m - n)!)
        int resultado = 1;

        if ("i".equalsIgnoreCase(metodo)) {
                resultado = Utilidades_Fact.factorIt(m) / (Utilidades_Fact.factorIt(n) * Utilidades_Fact.factorIt(m-n));
        } else if ("r".equalsIgnoreCase(metodo)) {
                resultado = Utilidades_Fact.factorRe(m) / (Utilidades_Fact.factorRe(n) * Utilidades_Fact.factorRe(m - n));
        }
        return resultado;
    }

}
