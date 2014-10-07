/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T
 */
public class Vehiculo {
   private String marca;
   private int year;
   private float precio;
//regla2 Agregar gets   
   public String getMarca(){
       return marca;
   }
   public int getYear(){
       return year;
   }
           
public float getPrecio(){
    return precio;
}
//Crear por cada atributo un metodo mutador
public void setMarca(String marca){
    this.marca=marca;
}
public void setYear(int year){
    this.year=year;
}
public void setPrecio(float precio){
    this.precio=precio;
}

}  

