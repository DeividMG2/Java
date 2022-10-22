import javax.swing.JOptionPane;

public class main {

    /* Una clase abstracta contiene al menos 1 metodo que no ha sido especificado,
    es decir, este será heredado para sobreescribirse.*/


    public static void main(String[] args) {

        Empleado e1 = new Empleado("Hector",42,550000,"Tijuana","+528239402");
        e1.verDatos();
        
    }
    
}