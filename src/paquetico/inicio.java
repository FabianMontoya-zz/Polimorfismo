
package paquetico;
import javax.swing.*;

public class inicio {  //Ejemplo polimorfismo 'Estatico'
    
    static String imprimir (String texto){
        JOptionPane.showMessageDialog(null,"La cadena es: << "+texto+" >>");
        return texto;
    }
    //
    static void imprimir (int a, int b){
        int c=0;
        c=a+b;
        JOptionPane.showMessageDialog(null, "El resultado es: << "+c+" >>");
    }
    //
    public static void main (String args []){
        String resp;
        resp=imprimir("Cadena de texto :D");
        imprimir (3,4);
        
    }
    
}
