
import javax.swing.JOptionPane;

public class ClaseHija extends ClasePadre//La palabra extends es como decirle que herede (palabra ESCENCIAL)
{
    @Override //Se usa @Override para sobreescribir un metodo repetido y cambiarle algunas cosas.
    public void hagoGalletas()     
    {
        JOptionPane.showMessageDialog(null, "Hola, soy la SubClase y también hago galletas.");
    }
}
