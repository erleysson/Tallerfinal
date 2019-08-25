package clases.operaciones;

public class ConversionLogica extends Conversion{


    /*-------------------OPERACIONES PARA CALCULAR CONVERSION DE MONEDAS--------------------------*/
    public double calculareurosapesos(){return(this.getNumero1()*getNumeuro());}
    public double calcularyenapesos(){return(this.getNumero1()*getNumyen());}
    public double calculardolaresapesos(){return(this.getNumero1()*getNumdolar());}

}
