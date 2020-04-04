package matriz;
import java.util.*;
import javax.swing.JOptionPane;
public class Matriz {
    public static void main(String[] args) {
   Scanner teclado = new Scanner (System.in);
    

         char x;
      
     
    
     x=JOptionPane.showInputDialog("Digite que ejercicio quiere ver: \n a: equis de unos \n b: cuadrado de unos \n c: piramides de unos").charAt(0);
    
     switch(x){
         case 'a': 
         int matriz[][]= new int [5][5];
        for (int i=0; i<5; i++){
         for(int j=0;j<5; j++) {
             
             if (i+j==4){
                 
                 matriz[i][j] = 1; 
             }
             else if ((j==i)){
                 
                 matriz[i][j] = 1;          
             }
             
             System.out.print(matriz[i][j]+" ");
        }   
                 System.out.println("");
            }
         
         
         break;
         
         case 'b':
          int matriz_2[][]= new int [5][5];
        
        for (int i=0; i<5; i++){
         for(int j=0;j<5; j++) {
             
             if ((i==0)||(i==4)){
                 
                 matriz_2[i][j] = 1; 
             }
             else if ((j==0)||(j==4)){
                 
                 matriz_2[i][j] = 1;          
             }
             
             System.out.print(matriz_2[i][j]+" ");
        }   
                 System.out.println("");
            }
             
             
             break; 
             
         case 'c':
            
             
 int matriz_3[][]= new int [4][4];
        
        for (int i=0; i<4; i++){
         for(int j=0;j<4; j++) {
             
             if ((j+i>3)){
                 
                 matriz_3[i][j] = 1; 
             }
             else if ((j+i<3)){
                 
                 matriz_3[i][j] = 1;          
             }
             
             System.out.print(matriz_3[i][j]+" ");
        }   
                 System.out.println("");
            }
        
        break;
}
    }
}