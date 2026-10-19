public class Factorial {
    static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        String caracter = String.valueOf(args[1]);

        if (num >= 0) {
            if ("i".equalsIgnoreCase(caracter)) {
                System.out.println( Utilidades_Fact.factorIt(num) );
            } else if ("r".equalsIgnoreCase(caracter)) {
                System.out.println( Utilidades_Fact.factorRe(num) );
            } else {
                System.out.println("Método de cálculo desconocido: debe ser Iterativo o Recursivo (I/i R/r)");
                System.exit(3);
            }
        } else if (num < 0) {
            System.out.println("Número incorrecto: debe ser >= 0");
            System.exit(1);
        } else if (String.valueOf(num).matches("\\d+")) { // \\d+ = Uno o más dígitos
            System.out.println("Primer parámetro no numérico: debe ser un número >= 0");
            System.exit(2);
        } else {
            System.out.println("Has introducido algo rarísimo brou");
            System.exit(4);
        }
    }
}
