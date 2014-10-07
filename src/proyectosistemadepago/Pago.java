package proyectosistemadepago;
public class Pago {
    public Pago(){
        System.out.println("A ver si es cierto que apareces");
    }
    
     public float hacerPago(int horasTrabajadas, float sueldo){
        float pago=horasTrabajadas*sueldo;
        return pago;
    }
  }
