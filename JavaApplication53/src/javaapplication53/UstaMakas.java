/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication53;

public class UstaMakas extends Makas{
    
    
    
    public UstaMakas(double dayaniklilik, int seviyePuani,String isim,int keskinlik,int direnc){
      super(dayaniklilik,seviyePuani,isim,keskinlik);
      this.direnc=direnc;
    
    
    
}
   public UstaMakas(){
    
}
   @Override
    int nesnePuaniGoster() {
        
        return 0;
        
    }

    @Override
    double etkiHesaplazayif(int a) {
       
       return  (keskinlik*direnc)/(0.8*a);
       
    }
    
    @Override
    double etkiHesaplazayif(int a,int b) {
       
       return  (keskinlik*direnc)/(0.8*a*b);
       
    }
    
    @Override
    double etkiHesaplaguclu(int a) {
       
       return (keskinlik*direnc)/(0.2*a);
       
    }
    
    @Override
    double etkiHesaplaguclu(int a,int b) {
       
       return (keskinlik*direnc)/(0.2*a*b);
       
    }
    
    
    
    @Override
   


    
    int durumGuncelle() {
       
        return 0;
       
    }

    
}