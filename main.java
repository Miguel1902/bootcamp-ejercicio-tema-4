
package open.bootcamp;

class SmartDevice{
    
    
}
class SmartPhone extends SmartDevice{
    String camara="ahsldfkjñ";
    String color;
    String procesador;
    int precio;

public SmartPhone(){
    
}


}
class SmartWatch extends SmartDevice {
    String correa="cuero";
    String color;
    int precio;

    public SmartWatch() {
       
    }
    
    
}



public class main {
    //atributos 

    public static void main(String[] args) {
      SmartPhone clase1 = new SmartPhone();
      String camara = clase1.camara;
        System.out.println(camara);
      String color = clase1.color;
        System.out.println(color);
       String  procesador= clase1.procesador;
        System.out.println(procesador);
      
    }
    
}
