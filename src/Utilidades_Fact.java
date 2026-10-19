import java.util.Scanner;

public class Utilidades_Fact {
    public static void main(String[] args) {
        /* n! -> programar 2 ejecutables (FactorialRe (recursivo) & FactorialIt (iterativo (for))) q se le pase un parámetro (n) [sin comprobar parámetro] [comprobar <0{->No se calcula} || >= 0{-> factorial 0!=1 & 1!=1 & n!=n*(n-1)}]
                => System.exit(); -> Permite q devuelva un código de salida. Último comando.
                   => System.exit(0); => bien {>=0}
                   => System.exit(1); => no bien {<=0} */
        Scanner sc = new Scanner(System.in);
        int n;

        /* System.out.println("Inserte número");
        n = Integer.parseInt(sc.nextLine()); */

        n = Integer.parseInt(args[0]);

        /* if (n >= 0) {
            Utilidades_Fact.factorRe(n);
            Utilidades_Fact.factorIt(n);
        } */

        if (n >= 0) {
            System.out.println(Utilidades_Fact.factorRe(n));
        }

        sc.close();
    }

    public static int factorRe (int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return factorRe(n * (n-1));
    }

    public static int factorIt (int n) {
        int r = 1;

        for (int i = 2; i > n; i++) { // i=2 para evitar el 1*1
            r *= i;
        }
        return r;
    }
}
