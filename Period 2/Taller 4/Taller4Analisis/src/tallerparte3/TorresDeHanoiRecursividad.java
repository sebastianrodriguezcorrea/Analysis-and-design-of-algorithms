package tallerparte3;

/**
 *
 * @author Juan Sebastian
 */
public class TorresDeHanoiRecursividad {

    static int contador = 0;

    //Método principal (main)
    public static void main(String[] args) {
        torresHanoi(4, 1, 2, 3);//Llamado del método recursivo de las torres de Hanoi
        System.out.println("");
        System.out.println("Juego Completado\n" + "Cantidad de movimientos: " + contador);
    }

    //Método para realizar el proceso de las Torres de Hanoi de forma recursiva
    public static void torresHanoi(int discos, int origen, int auxiliar, int destino) {
        //Caso base para que el algoritmo finalice.
        if (discos == 1) {
            System.out.println("Mover disco " + discos + " de Torre " + origen + " a Torre " + destino);
        } else {
            //Llamado recursivo para continuar con el proceso del juego de las Torre de Hanoi
            torresHanoi(discos - 1, origen, destino, auxiliar);
            System.out.println("Mover disco " + discos + " de Torre " + origen + " a Torre " + destino);
            torresHanoi(discos - 1, auxiliar, origen, destino);
        }
        contador++;
    }
}
