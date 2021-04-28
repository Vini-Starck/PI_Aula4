package exercício_pi_aula4;

import java.util.Scanner;

public class Lendo_Matriz {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        double [][]m = new double [3][3];
        ler(m);
        exibir(m);
    }
        
        public static void ler(double[][] m){
            Scanner leitor = new Scanner(System.in);
            for(int i=0; i<m.length; i++){
                for(int j=0; j<m[i].length; j++){
                    System.out.print("m["+i+"]["+j+"]=");
                    m[i][j]= leitor.nextDouble();
                }
            }
        }
        
        public static void exibir(double[][] m){
            
            for(int i=0; i<m.length; i++){
                for(int j=0; j<m[i].length; j++){
                    System.out.print(m[i][j]+" ");
                }
                System.out.print("\n");
            }
        }
}