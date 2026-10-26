public enum CodigoSalida {
    CORRECTO(0),
    NUMERO_PARAMETROS_INCORRECTOS(1),
    PRIMER_PARAMETRO_NO_NUMERICO(2),
    NUMERO_NEGATIVO(3),
    METODO_CALCULO_INCORRECTO(4);

    private final int codigo;

    CodigoSalida(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
}