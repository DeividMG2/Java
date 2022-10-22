package instanciacion;
public class Instanciacion {
    String marca = "Ford", modelo = "2014", color = "Azul";
    double precio;
    public static void main(String[] args) {
        //Sintaxis crear instancia: NombreClase nombreObjeto = new NombreClase()
        Instanciacion primerAuto = new Instanciacion();
        Instanciacion segundoAuto = new Instanciacion();
        Instanciacion tercerAuto = new Instanciacion();
        
        // Asignando atributos a los autos
        
        //primer auto
        primerAuto.marca="Ford";
        primerAuto.color="Amarillo";
        primerAuto.modelo="2014";
        primerAuto.precio=129000.82;
        //segundo auto
        segundoAuto.marca="Ferrari";
        segundoAuto.color="Rojo";
        segundoAuto.modelo="2012";
        segundoAuto.precio=429000;
        //tercer auto
        tercerAuto.marca="Camaro";
        tercerAuto.color="Negro";
        tercerAuto.modelo="2019";
        tercerAuto.precio=270000.15;
        
        //Mostrando los datos
        System.out.println("Datos del Primer Auto");
        System.out.println("Marca: "+primerAuto.marca);
        System.out.println("Modelo: "+primerAuto.modelo);
        System.out.println("Color: "+primerAuto.color);
        System.out.println("Precio: "+primerAuto.precio);
                
        System.out.println("\nDatos del Segundo Auto");
        System.out.println("Marca: "+segundoAuto.marca);
        System.out.println("Modelo: "+segundoAuto.modelo);
        System.out.println("Color: "+segundoAuto.color);
        System.out.println("Precio: "+segundoAuto.precio);
        
        
        System.out.println("\nDatos del Tercer Auto");
        System.out.println("Marca: "+tercerAuto.marca);
        System.out.println("Modelo: "+tercerAuto.modelo);
        System.out.println("Color: "+tercerAuto.color);
        System.out.println("Precio: "+tercerAuto.precio);
    }   
}
