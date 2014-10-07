/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T
 */
public class usuario {
   private int id;
   private String nombre;
   private String email;
//regla2 Agregar gets   
   public int getId(){
       return id;
   }
   public String getNombre(){
       return nombre;
   }
           
public String getEmail(){
    return email;
}
//Crear por cada atributo un metodo mutador
public void setId(int id){
    this.id=id;
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public void setEmail(String email){
    this.email=email;
}

}

