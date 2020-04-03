package dominacionbacteriana;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Rodriguez Correa
 */
public class DominacionBacteriana {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in); //Se inicializa un scanner para la lectura del dato que se ingrese.
        int bacteriasExpuestas = e.nextInt(); //Se almacenan el numero de casos de areas.
        for (int i = 0; i < bacteriasExpuestas; i++) { //Se piden las dimensiones.
            int area = e.nextInt(); //Se almacenan las dimensiones que corresponden al area.
            int[][] matriz = new int[area][area];//Se crea la cuadricula con las dimensiones del area.

            //Proceso para realizar la cuadricula
            for (int j = 0; j < matriz.length; j++) { //Para un entero "j" inicia desde 0 hasta el tamaño de la matriz.
                for (int k = 0; k < matriz.length; k++) { //Para un entero "k" inicia desde 0 hasta el tamaño de la matriz.
                    matriz[j][k] = e.nextInt(); //Se leen los valores y se llena la matriz.
                }
            }

            //Dibujar la cuadrícula (opcional)
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    System.out.print("[" + matriz[j][k] + "]");
                }
                System.out.println("");
            }
            
            //Proceso para sumar los "unos" que se encuentren en la cuadricula
            int contador1 = 0;//Contador que inicia desde cero para despues almacenar los numeros.
            for (int j = 0; j < matriz.length; j++) { //Ciclo para recorrer la matriz.
                for (int k = 0; k < matriz.length; k++) { //Ciclo para recorrer la matriz.
                    if (matriz[j][k] == 1) { //Si la matriz es igual a 1
                        contador1 += 1; //Tonces el contador va sumando de a uno
                    }
                }
            }
            
            //Proceso para contar los "ceros" que estan encerrados por "unos" en la matriz
            int contador2 = 0; //Contador que almacena los "ceros" que cumplen con las condiciones.
            for (int j = 0; j < matriz.length; j++) { //Aca se manejan las filas de la matriz.
                for (int k = 0; k < matriz.length; k++) { //Aca se manejan las columnas de la matriz.
                    if (matriz[j][k] == 1) {//Proceso de si hay un "uno(1)" mire si el de al lado derecho es un "cero".
                        if (k + 1 < matriz.length) { /*Si el valor de la siguiente posicion es menor al tamaño 
                                                     de la matriz (es para que no se desborde la matriz).*/
                            if (matriz[j][k + 1] == 0) { //Se mantiene la fila y se evalua la si la siguiente columna tiene un cero. 
                                if (validarCeros(matriz, j, k + 1)) { //validar si el cero en cuestión cumple la condición de estar rodeado de unos "1"
                                    k = k + 1;//Se aumenta una posición de las columnas hacia la derecha
                                    if (k < matriz.length) {//Se valida si la columna no sobrepasa el límite de la matriz
                                        contador2 = contador2 + sumarCeros(matriz, j, k); //dependiendo del resultado del metodo sumarCeros (si da "1" ó "0") el contador2 aumneta 1 ó 0.
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("");
            System.out.printf("%.2f%n", (double) (contador1 + contador2) / 2);// Se suman y dividen los dos contadores, el de cero y el de uno.
        }
    }

    /**
     * 
     * @param matriz
     * @param posicion1 Representación de filas
     * @param posicion2 Representación de columnas
     * @return 
     * 1 1 0 1 1
     * 1 0 0 0 1
     * 1 1 1 1 1
     */
    
     //Metodo para sumar los ceros
    static int sumarCeros(int matriz[][], int posicion1, int posicion2) {
        int contador = 0; //Se crea un contador para contar los ceros
        for (int i = posicion2; i < matriz.length; i++) { //Recorre la posicion de la columna hacia la derecha
            if (matriz[posicion1][i] == 0) { //Validar si el de derecha es un "0"
                if (validarCeros(matriz, posicion1, i)) { //Validar si el cero esta rodeado de "1" la matriz, posicion de la fila y elemnto de la columna
                    contador += 1;//El contador aumenta en "1"
                } else { 
                    contador = 0; //Si no cumple el contador entonces es igual es cero
                    i = matriz.length;//Salir del ciclo for
                }
            } else { //Si no se cumple la primera condicion se sale del bucle con la instruccion que se puede visualizar abajo.
                i = matriz.length; 
            }
        }
        return contador; //Retorna el resultado del contador.
    }
    
    /**
     * @param matriz
     * @param posicion1 Representación de filas
     * @param posicion2 Representación de columnas
     * @return 
     */
    
    //Metodo para validar si un "cero" esta rodeado de "uno"
    static boolean validarCeros(int matriz[][], int posicion1, int posicion2){
        boolean verificador = false;
        for (int i = posicion2; i < matriz.length; i++) { //Se recorre la posicion de la columna
            if (matriz[posicion1][i] == 1) { //Se valida si en la siguiente columna hacia la derecha hay un "1"
                i = matriz.length; //Ahora "i" tiene asignado el tamaño de la matriz.
                for (int j = posicion1 - 1; j >= 0; j--) {// Para una posicion arriba de la fila (j), es mayor o igual a "0" evalua al reves (--j) 
                    if (matriz[j][posicion2] == 1) { //Se valida si en las posiciones de arriba hay "1"
                        j = -1; //Ahora "j" tiene asignado -1 para salir de ciclo
                        for (int k = posicion1 + 1; k < matriz.length; k++) { //Recorrer la posicion de las filas hacia abajo.
                            if (matriz[k][posicion2] == 1) { //Se valida si en las posiciones hacia abajo hay un "1" 
                                k = matriz.length + 1; //Se sale de la condicion
                                verificador = true;//El cero si esta rodeado de "1", es decir, cumple la condicion
                            }
                        }
                    }
                }
            }
        }
        return verificador; //Se retorna el valor del verificador
    }
}
