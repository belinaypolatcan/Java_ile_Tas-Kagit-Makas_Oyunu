/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication53;

import java.util.ArrayList;

public abstract class Oyuncu {
    
    int oyuncuID;
    String oyuncuAdi;
    int skor;
    ArrayList <Nesne> nesneListesi = new ArrayList<>();
    
    
    public Oyuncu(int oyuncuID,String oyuncuAdi,int skor){
      this.oyuncuID=oyuncuID;
      this.oyuncuAdi=oyuncuAdi;
      this.skor=skor;
      
    
    
}
   public Oyuncu(){
    
}
   
   abstract void nesneSec();
   
   public void SkorGoster(){
       
   }

   
 
   
 
}
