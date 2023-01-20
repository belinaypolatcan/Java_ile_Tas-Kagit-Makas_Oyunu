/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication53;

public abstract class Nesne {
     double dayaniklilik;
     int seviyePuani;
     String isim;
     int keskinlik;
     int katilik;
     int nufuz;
     int kalinlik;
     int direnc;
     int sicaklik;
    
   
   public Nesne(double dayaniklilik, int seviyePuani,String isim){
    this.dayaniklilik=dayaniklilik;
    this.seviyePuani=seviyePuani;
    this.isim=isim;
    
}
   public Nesne(){
    
}
  
  
  abstract int nesnePuaniGoster();
  abstract double etkiHesaplazayif(int a);
  abstract double etkiHesaplazayif(int a,int b);
  abstract double etkiHesaplaguclu(int a);
  abstract double etkiHesaplaguclu(int a,int b);
  abstract int durumGuncelle();
    public double getDayaniklilik() {
        return dayaniklilik;
    }

    public int getSeviyePuani() {
        return seviyePuani;
    }

    public void setDayaniklilik(double dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }

    public void setSeviyePuani(int seviyePuani) {
        this.seviyePuani = seviyePuani;
    }
  
  
  
}
