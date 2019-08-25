package clases.operaciones;
import static clases.constantes.ConversionEnteros.*;



public class Conversion {

    private double numero1;
    private double numdolar;
    private double numeuro;
    private double numyen;
    private double dolar;

/*---------------CONSTRUCTOR SIN PARAMETROS----------*/
    public Conversion() {
        this.numero1 = CERO.getValor();
        this.numdolar = TRESMILPESOS.getValor();
        this.numeuro = TRESMILQUINIENTOS.getValor();
        this.numyen = MILQUINIENTOS.getValor();
        this.dolar=UNO.getValor();
    }



    /*-------------------CONSTRUCTOR-------------------*/
    public Conversion(double numero1, double numdolar, double numeuro, double numyen,double dolar) {
        this.numero1 = numero1;
        this.numdolar = numdolar;
        this.numeuro = numeuro;
        this.numyen = numyen;
        this.dolar=dolar;
    }

    /*-------------------METODOS GET Y SETT -------------------*/
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumdolar() {
        return numdolar;
    }

    public double getDolar() {
        return dolar;
    }

    public void setNumdolar(double numdolar) {
        this.numdolar = numdolar;
    }

    public double getNumeuro() {
        return numeuro;
    }

    public void setNumeuro(double numeuro) {
        this.numeuro = numeuro;
    }

    public double getNumyen() {
        return numyen;
    }

    public void setNumyen(double numyen) {
        this.numyen = numyen;
    }


    public void setDolar(double dolar) {
        this.dolar = dolar;
    }
}
