public class Operaciones {

    public static void main(String[] args) {
        
        int resultado;
        Calculos calculo1 = new Calculos();
    
        //Aqui llamo a la funcion suma en Calculos y establezco valores a las variables que luego se sumarán
        
        resultado = calculo1.suma(5, 7);
        
        System.out.println("El resultado de la suma es: "+resultado);
        
        System.out.println("El resultado de la resta es: "+ calculo1.resta(5,7));   
        
        System.out.println("El area del circulo de radio 5 es: "+ calculo1.areaCirculo(5));

        if(calculo1.estado(5)){
            System.out.println("La persona esta ebria");
        }else{
            System.out.println("La persona no esta ebria");
        }
    }
    
}
