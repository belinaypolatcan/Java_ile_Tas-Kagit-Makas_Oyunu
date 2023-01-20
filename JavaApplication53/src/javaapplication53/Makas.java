/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication53;

public class Makas extends Nesne {
    
    
    
    
    public Makas(double dayaniklilik, int seviyePuani,String isim,int keskinlik){
    super(dayaniklilik,seviyePuani,isim);
    this.keskinlik=keskinlik;
   
    
    
}
   public Makas(){
    
}
    
    
    @Override
    int nesnePuaniGoster() {
        
        return 0;
        
    }

    @Override
    double etkiHesaplazayif(int a) {
        
       return (keskinlik)/(0.8*a);
        
        
    }
    
    
     @Override
    double etkiHesaplazayif(int a,int b) {
        
       return (keskinlik)/(0.8*a*b);
        
        
    }
    
    
    @Override
    double etkiHesaplaguclu(int a) {
        
       return (keskinlik)/(0.2*a);
       
        
    }
    
    @Override
    double etkiHesaplaguclu(int a,int b) {
        
       return (keskinlik)/(0.2*a*b);
       
        
    }
    
    
    
   
    @Override
    int durumGuncelle() {
           
        return 0;
           
}
}