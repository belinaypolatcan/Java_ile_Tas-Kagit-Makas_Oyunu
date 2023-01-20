/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication53;

public class AgirTas extends Tas{
     
     
     
     public AgirTas(double dayaniklilik, int seviyePuani,String isim,int katilik,int sicaklik) {
        super(dayaniklilik,seviyePuani,isim,katilik);
        this.sicaklik=sicaklik;
    }
     
     public AgirTas(){
        
    }
     
     @Override
    int nesnePuaniGoster() {
        
         return 0;
        
    }

     @Override
    double etkiHesaplazayif(int a) {
        
         return (katilik*sicaklik)/(0.8*a);
        
    }
    
     @Override
    double etkiHesaplazayif(int a,int b) {
        
         return (katilik*sicaklik)/(0.8*a*b);
        
    }
    
     @Override
     double etkiHesaplaguclu(int a) {
        
         return (sicaklik*katilik)/(0.2*a);
        
    }
     
     @Override
     double etkiHesaplaguclu(int a,int b) {
        
         return (sicaklik*katilik)/(0.2*a*b);
        
    }
    

    @Override
    int durumGuncelle() {
        
         return 0;
        
    }

    
    
    
}
