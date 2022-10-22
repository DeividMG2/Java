//SUB CLASE
import javax.swing.JOptionPane;

public class Empleado extends Persona{
    double sueldo;
    String telefono, direccion;
    public Empleado(String nombre, int edad, double sueldo, String direccion, String telefono){
        super(nombre, edad); //Así valores a los atributos heredados de la clase padre
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    @Override 
    public void verDatos(){
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+
                "\nEdad: "+edad+
                "\nSueldo: "+sueldo+
                "\nDireccion: "+direccion+
                "\nTelefono: "+telefono);
    }
}
