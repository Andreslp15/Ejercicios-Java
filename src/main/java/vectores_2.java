
/**
 * Carga de vector de strings mas recorrido e impresion por pantalla
 * @author andres-lopez
 */


public class vectores_2 {
    public static void main( String[] args){
        // Tener un vector que guarde 8 nombres
        String vector [] = new String [8];
        
        // Asignacion manual de valores
        vector[0] = "Alejandra";
        vector[1] = "Andres";
        vector[2] = "Alejo";
        vector[3] = "Gabriel";
        vector[4] = "Lusmila";
        vector[5] = "Loki";
        vector[6] = "Rafa";
        vector[7] = "Lumel";
        
        for ( int i = 0; i < vector.length; i++) {
            System.out.println("Nombre en la posicio: " + i + " " + vector[i]);
        }
        
        
    }

}