/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication53;

public class Kagit extends Nesne{
   
    
     public Kagit(double dayaniklilik, int seviyePuani,String isim,int nufuz) {
        super(dayaniklilik,seviyePuani,isim);
        this.nufuz=nufuz;
       
    }
     
     public Kagit(){
        
    }
    
    

    @Override
    int nesnePuaniGoster() {
        
        return 0;
        
    }

    @Override
    double etkiHesaplaguclu(int a) {
       
        
        return (nufuz)/(0.2*a);
         
    }
    @Override
    double etkiHesaplaguclu(int a,int b) {
       
        
        return (nufuz)/(0.2*a*b);
         
    }
    
     @Override
    double etkiHesaplazayif(int a) {
       
        return (nufuz)/(0.8*a);
       
    }
    
     @Override
    double etkiHesaplazayif(int a,int b) {
       
        return (nufuz)/(0.8*a*b);
       
    }
    
   
    @Override
    int durumGuncelle() {
       
        return 0;
       
    }
    
}