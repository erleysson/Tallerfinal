package clases.operaciones;




public class Nomina {
    private double hours;
    private double diurnal;
    private double night;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    private String nombres;
    private int day;
    private double month;
    private double diez;
    private double quince;

    private double anos;


    /*--------------------VALORES GET Y SET --------- */

    public double getAnos() { return anos; }

    public void setAnos(double anos) {
        this.anos = anos;
    }



    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(double month) {
        this.month = month;
    }


    public double getDiurnal() { return diurnal; }

    public void setDiurnal(double diurnal) { this.diurnal = diurnal; }

    public double getNight() { return night; }

    public void setNight(double night) { this.night = night; }




    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    /*Constructor con valores */

    public double getDiez() {
        return diez;
    }

    public void setDiez(double diez) {
        this.diez = diez;
    }

    public double getQuince() {
        return quince;
    }

    public void setQuince(double quince) {
        this.quince = quince;
    }

    public Nomina(){

        hours=0;
        diurnal=35000;
        night=50000;
        diez=0.10;
        quince=0.15;

    }
    /*Constructor */

    public Nomina(double hours, int day, double month) {
        this.hours = hours;
        this.day = day;
        this.month = month;
    }
}
