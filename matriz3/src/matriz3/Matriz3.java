package matriz3;

import java.util.Scanner;

public class Matriz3 {
public static void main(String[] args) {
    int n,m;
    Scanner teclado = new Scanner (System.in);
    System.out.print("Numero de filas\n");
    n=teclado.nextInt();
    System.out.print("Numero de columnas\n");
    m=teclado.nextInt();
      char matriz[][]= new char [n][m];
        
        for (int i=0; i<matriz.length; i++){
         for(int j=0;j<matriz.length; j++) {
             
             if (i==j || i+j==matriz.length-1){
                 
                 matriz[i][j] = 'x'; 
             }
             else{
                 
                 matriz[i][j] = ' ';          
             }
             
             System.out.print(matriz[i][j]+" ");
        }   
                 System.out.println("");
            }
         
   }
    
}
