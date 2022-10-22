public class Principal {

    public static void main(String[] args) {

        /*
        
        SuperClase: La que le hereda sus atributos y metodos a otra clase
        SubClase - Clase Hija: La que tiene atributos y metodos de una SuperClase
        Clase Nieta: Tiene lo que heredó de la anterior y lo que la anterior heredó de la anterior.
        
        */
        
        ClaseHija ch1 = new ClaseHija();
        
        ch1.hagoGalletas(); //Me sale este metodo porque ClaseHija lo heredo de ClasePadre (aunque está sobreescrito)
    
    }
    
}
