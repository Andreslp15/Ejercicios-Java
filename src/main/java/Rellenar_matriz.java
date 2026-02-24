



public class Rellenar_matriz {
    public static void main ( String [] args){
        // Llevar a cabo un programa que permita cargar completamente con numero 5
        // Una matriz de 4X5
        
        int matriz [][] = new int [4][5];
        
        // Carga e impresion por pantalla
        for ( int i = 0; i < 4; i++){
            for( int j = 0; j < 5; j++){
                matriz[i][j] = 5;
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("\n");
        }
        
    }
}