package exercício_pi_aula4;

import java.util.Scanner;

public class Matriz_Bidimensional {
    public static void main(String[] args) {
        int m[][] = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        
        int soma=0;
        
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                soma += m[i][j];
            }
        }
        
        System.out.println("Soma: "+soma);
    }
}