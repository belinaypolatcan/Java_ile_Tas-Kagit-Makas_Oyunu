/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication53;

public class OzelKagit extends Kagit{
    
    
     
     public OzelKagit(double dayaniklilik, int seviyePuani,String isim,int nufuz,int kalinlik) {
        super(dayaniklilik,seviyePuani,isim,nufuz);
        this.kalinlik=kalinlik;
        
    }
     
     public OzelKagit(){
        
    }
     
     @Override
    int nesnePuaniGoster() {
        
        return 0;
        
    }

    @Override
    double etkiHesaplaguclu(int a) {
       
         return (nufuz*kalinlik)/(0.2*a);
       
    }
    
     @Override
    double etkiHesaplaguclu(int a,int b) {
       
         return (nufuz*kalinlik)/(0.2*a*b);
       
    }
    
    
    
    @Override
    double etkiHesaplazayif(int a) {
       
        return (nufuz*kalinlik)/(0.8*a);
       
    }
    
    
    @Override
    double etkiHesaplazayif(int a,int b) {
       
         return (nufuz*kalinlik)/(0.8*a*b);
       
    }
    
    

    @Override
    int durumGuncelle() {
       
        return 0;
       
    }

    
    
     
}
