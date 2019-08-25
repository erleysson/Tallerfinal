package clases.operaciones;


import javax.swing.*;

public class NominaLogica extends Nomina {
    public NominaLogica() {
        super();
        this.getDay();
        this.getMonth();
    }
/*---------------OPERACIONES PARA CALCULAR LAS HORAS, MOSTRAR NOMBRE Y SALARIOS CON EL 10% Y 15% AUTMENTO-------------*/
    public double calcularhorasdia(){return (this.getHours()*this.getDiurnal());}
    public double calsularhorasnoche(){return (this.getHours()*this.getNight());}
    public String mostrarnombre(){return (this.getNombres());}
    public double salariodiez(){return (((this.getHours()*this.getDiurnal())*this.getDiez())+calcularhorasdia());}
    public double salarioquince(){return (((this.getHours()*this.getNight())*this.getQuince())+calsularhorasnoche());}


    /*----------------------------CONDICIONES PARA SABER SI ES FESTIVO ----------------------------------*/

    public boolean fiesta(){return (this.getDay()==1)&&(this.getMonth()==1);}


    public boolean festivouno(){return (this.getDay()==1)&&(this.getMonth()==5);}
    public boolean festivodos(){return (this.getDay()==20)&&(this.getMonth()==7);}
    public boolean festivotres(){return (this.getDay()==7)&&(this.getMonth()==8);}
    public boolean festivocuatro(){return (this.getDay()==8)&&(this.getMonth()==12);}
    public boolean festivocinco(){return (this.getDay()==25)&&(this.getMonth()==12);}

    public boolean festivoseis(){return (this.getDay()==6)&&(this.getMonth()==1);}
    public boolean festivosiete(){return (this.getDay()==19)&&(this.getMonth()==2);}
    public boolean festivoocho(){return (this.getDay()==15)&&(this.getMonth()==8);}
    public boolean festivonueve(){return (this.getDay()==1)&&(this.getMonth()==11);}
    public boolean festivodiez(){return (this.getDay()==10)&&(this.getMonth()==11);}











}



