
package paquete1;

import paquete2.Hija;


public class PaqueteModificadoresdeAcceso {


public static void main(String[] args) {
       Ejemplo  ej=new Ejemplo();
       ej.atributo2=50;
       ej.atributo3=45.26;
       ej.metodo();
       
       Hija h1=new Hija();
       
       h1.atributo3=58.69;
       h1.atributo4='J';
       
 try
   {
   
   
   } catch (Exception e)
   {
          // System.out.println("Ha ocurrido un error");       
            System.out.println(e.toString()); 
   }
        
          }

}
