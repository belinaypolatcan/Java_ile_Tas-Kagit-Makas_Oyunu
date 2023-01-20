/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication53;

public class Tas extends Nesne{
    
   
    
    public Tas(double dayaniklilik, int seviyePuani,String isim,int katilik) {
        super(dayaniklilik,seviyePuani,isim);
        this.katilik=katilik;
       
    }
    
    public Tas(){
        
    }

    @Override
    int nesnePuaniGoster() {
        
        return 0;
        
    }

    @Override
    double etkiHesaplaguclu(int a) {
        
        return (katilik)/(0.2*a);
        
    }
    
    @Override
    double etkiHesaplaguclu(int a,int b) {
        
        return (katilik)/(0.2*a*b);
        
    }
    
    @Override
    double etkiHesaplazayif(int a){
        
             return (katilik)/(0.8*a);
    }
    
        
    @Override
    double etkiHesaplazayif(int a,int b){
        
             return (katilik)/(0.8*a*b);
    }
    
   
   

    @Override
    int durumGuncelle() {
        
        
        
    
    
        
        
        return 0;
    }

    
}

   
