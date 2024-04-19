/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_maximinorodriguez;

import java.util.ArrayList;
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
        ArrayList Mediana = new ArrayList();

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
                System.out.println("");
                System.out.println("Matriz Randomizada");
                System.out.println("");

                for (int ContadorI = 0; ContadorI < MatrizRandom.length; ContadorI++) {
                    for (int ContadorJ = 0; ContadorJ < MatrizRandom[ContadorI].length; ContadorJ++) {
                        System.out.print("[" + MatrizRandom[ContadorI][ContadorJ] + "]");
                    }
                    System.out.println("");
                }

                System.out.println("");

                int[] Arreglo = new int[TamanoMatriz];

                for (int i = 0; i < TamanoMatriz; i++) {
                    Arreglo[i] = MatrizRandom[0][i];
                }

                for (int i = 0; i < Arreglo.length; i++) {
                    System.out.print("[" + Arreglo[i] + "]");
                }

                for (int ContadorJ = 0; ContadorJ < 3; ContadorJ++) {
                    for (int i = 0; i < Arreglo.length - 1; i++) {
                        if (Arreglo[i] > Arreglo[i + 1]) {
                            int CambiadorX = Arreglo[i];
                            int CambiadorY = Arreglo[i + 1];
                            Arreglo[i] = CambiadorY;
                            Arreglo[i + 1] = CambiadorX;
                        }
                    }
                }

                System.out.println("");

                for (int i = 0; i < Arreglo.length; i++) {
                    System.out.print("[" + Arreglo[i] + "]");
                }

                System.out.println("");
                System.out.println("");

                System.out.println("Matriz Ordenada");
                for (int i = 0; i < 3; i++) {
                    for (int ContadorFilas = 0; ContadorFilas < MatrizRandom.length; ContadorFilas++) {
                        for (int ContadorColumnas = 0; ContadorColumnas < MatrizRandom[ContadorFilas].length - 1; ContadorColumnas++) {
                            if (MatrizRandom[ContadorFilas][ContadorColumnas] > MatrizRandom[ContadorFilas][ContadorColumnas + 1]) {
                                int CambiadorX = MatrizRandom[ContadorFilas][ContadorColumnas];
                                int CambiadorY = MatrizRandom[ContadorFilas][ContadorColumnas + 1];
                                MatrizRandom[ContadorFilas][ContadorColumnas] = CambiadorY;
                                MatrizRandom[ContadorFilas][ContadorColumnas + 1] = CambiadorX;
                            }

                        }
                    }

                }

                for (int ContadorI = 0; ContadorI < MatrizRandom.length; ContadorI++) {
                    for (int ContadorJ = 0; ContadorJ < MatrizRandom[ContadorI].length; ContadorJ++) {
                        System.out.print("[" + MatrizRandom[ContadorI][ContadorJ] + "]");
                    }
                    System.out.println("");
                }

                System.out.println("");

                int NumeroDiv = TamanoMatriz / 2;
                System.out.println("");
                System.out.println(NumeroDiv);

                

                for (int ContadorMedianaI = 0; ContadorMedianaI < MatrizRandom.length; ContadorMedianaI++) {
                    //for (int ContadorMedianaJ = 0; ContadorMedianaJ < MatrizRandom[ContadorMedianaI].length; ContadorMedianaJ++) {
                        int MedianaDeMediana = MatrizRandom[ContadorMedianaI][NumeroDiv];
                        Mediana.add(MedianaDeMediana);

                    //}

                }

                System.out.println("");

                for (int i = 0; i < Mediana.size(); i++) {
                    System.out.println(Mediana.get(i));
                }

            }
        }

    }

}
