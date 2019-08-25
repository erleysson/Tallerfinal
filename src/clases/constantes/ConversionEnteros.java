package clases.constantes;

public enum ConversionEnteros {

    TRESMILPESOS(3.000),
    TRESMILQUINIENTOS(3500),
    MILQUINIENTOS( 1.500),
    CERO( 0),
    UNO(1),
    QUINIENTOS(500),
    SEISCIENTOS(600);

    private int valor;


    ConversionEnteros(double valor) {

        this.valor = (int) valor;
    }

    public int getValor() {
        return valor;
    }

}
