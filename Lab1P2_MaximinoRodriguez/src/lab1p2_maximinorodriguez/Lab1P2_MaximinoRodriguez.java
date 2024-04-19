/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_maximinorodriguez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maxas
 */
public class Lab1P2_MaximinoRodriguez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Fila 2 Asiento 6

        System.out.println("");
        System.out.println("Ejercicio Practico Mediana de Medianas");
        System.out.println("");

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al ejercicio de Mediana de Medianas");
        System.out.println("Ingrese el tamano deseado para la matriz,que sea un numero impar y mayor que 4");
        int TamanoMatriz = entrada.nextInt();
        //Numero menor a 4
        if (TamanoMatriz <= 4) {
            System.out.println("El tamano de la matriz es menor a 4 o no es impar");
        } else {
            //Numero impar
            if (TamanoMatriz % 2 == 0) {
                System.out.println("El tamano que ingreso no es valido,ingrese otro numero");

            } else {
                int FilasMatriz = TamanoMatriz;
                int ColumnasMatriz = TamanoMatriz;

                int[][] MatrizRandom = new int[TamanoMatriz][TamanoMatriz];

                for (int ContadorI = 0; ContadorI < MatrizRandom.length; ContadorI++) {
                    for (int ContadorJ = 0; ContadorJ < MatrizRandom[ContadorI].length; ContadorJ++) {
                        int NumeroAleatorio = random.nextInt(0, 10);
                        MatrizRandom[ContadorI][ContadorJ] = NumeroAleatorio;
                    }
                }

                for (int ContadorI = 0; ContadorI < MatrizRandom.length; ContadorI++) {
                    for (int ContadorJ = 0; ContadorJ < MatrizRandom[ContadorI].length; ContadorJ++) {
                        System.out.print("[" + MatrizRandom[ContadorI][ContadorJ] + "]");
                    }
                    System.out.println("");
                }
                
                

            }
        }

    }
    
    
    public static int BubbleSort(int[][]MatrizRandom){
        
        
        return 0;
    }

}
