package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
private double pocetnaTacka;
private double krajnjaTacka;
private boolean pocetnaPripada;
private boolean krajnjaPripada;
public Interval(double pocetnaTacka, double krajnjaTacka, boolean pocetnaPripada, boolean krajnjaPripada) throws Exception{
    if(pocetnaTacka>krajnjaTacka) throw new IllegalArgumentException("Neispravni parametri.");
    this.pocetnaTacka=pocetnaTacka;
    this.krajnjaTacka=krajnjaTacka;
    this.pocetnaPripada=pocetnaPripada;
    this.krajnjaPripada=krajnjaPripada;
}

public Interval(){
    pocetnaTacka=0;
    krajnjaTacka=0;
    pocetnaPripada=false;
    krajnjaPripada=false;
}
public boolean isNull(){
    if(this.pocetnaTacka==0 && this.krajnjaTacka==0 && this.pocetnaPripada==false && this.krajnjaPripada==false) return false;
    else return true;
}

}
