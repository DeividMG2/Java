public class Calculos {
    
        int suma(int x, int y){
            return (x+y);
        }
        
        int resta(int x, int y){
            return (x-y);
        }
        
        double areaCirculo(int radio){
            return 3.1416 * (radio * radio);
        }
        
        boolean estado(int tequilas){ 
            return (tequilas>=5); // Aquí retorno si es true o false si la persona ha tomado más de 5 tequilas
            
        }
}
