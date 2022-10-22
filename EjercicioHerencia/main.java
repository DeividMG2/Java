
import javax.swing.JOptionPane;


public class main {

    public static void main(String[] args) {
        
        //Creo variables para almacenar datos del empleado
        String nom, dir, tel;
        int ed;
        double suel;
        
        //Pido los datos con JOptionPane
        
        nom = JOptionPane.showInputDialog(null, "Nombre: ", "Datos Empleado", 2); //El 2 al final representa INPUT
        ed = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad de " +nom+": ", "Datos Empleado", 2)); 
        suel = Double.parseDouble(JOptionPane.showInputDialog(null, "Sueldo de " +nom+": ", "Datos Empleado", 2));
        dir = JOptionPane.showInputDialog(null, "Direccion de " +nom+": ", "Datos Empleado", 2); 
        tel = JOptionPane.showInputDialog(null, "Telefono de " +nom+": ", "Datos Empleado", 2); 
        
        
        Empleado e1 = new Empleado(nom,ed,suel,dir,tel);
        
        
        //Pido los datos al segundo empleado
        nom = JOptionPane.showInputDialog(null, "Nombre: ", "Datos Empleado", 2); //El 2 al final representa INPUT
        ed = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad de " +nom+": ", "Datos Empleado", 2)); 
        suel = Double.parseDouble(JOptionPane.showInputDialog(null, "Sueldo de " +nom+": ", "Datos Empleado", 2));
        dir = JOptionPane.showInputDialog(null, "Direccion de " +nom+": ", "Datos Empleado", 2); 
        tel = JOptionPane.showInputDialog(null, "Telefono de " +nom+": ", "Datos Empleado", 2); 
        
        Empleado e2 = new Empleado(nom,ed,suel,dir,tel);
        
        //Muestro los datos de ambos
        
        e1.verDatos();
        e2.verDatos();
    }
    
}
