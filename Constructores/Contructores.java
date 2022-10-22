public class Contructores {

    
    public static void main(String[] args) {
        
            
            //Haciendo las cosas sin el constructor
            
            /*
            Alumno a1 = new Alumno();
            a1.carne = "2022180126";
            a1.nombre = "Deivid";
            a1.apellidos = "Matute Guerrero";
            */
            
            
            //Pasando los atributos por el constructor
            Alumno a1 = new Alumno("2022180126","Deivid","Matute Guerrero");
            a1.verDatos();
            
    }
    
}
