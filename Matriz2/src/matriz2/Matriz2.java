package matriz2;

import java.util.Scanner;

public class Matriz2 {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
         int n,m;
         char x;
         System.out.print("Inserta numero filas\n");
         n=teclado.nextInt();
         System.out.print("Inserta numero columnas\n");
         m=teclado.nextInt();
 char matriz[][]= new char [n][m];
        
        for (int i=0; i<matriz.length; i++){
         for(int j=0;j<matriz.length; j++) {
             
             if ((i+j<matriz.length-1) || (i+j>matriz.length-1)){
                 
                 matriz[i][j] = 'x'; 
             }
             else {
                 
                 matriz[i][j] = ' ';          
             }
             
             System.out.print(matriz[i][j]+" ");
        }   
                 System.out.println("");
            }
}
}
