package sortingmethods;

/**
 *
 * @author Juan Sebastian
 */
public class SortingMethods {

    public static void main(String[] args) {

    }
    /***********************************************
     * ORDENAMIENTO BURBUJADIRECCIONAL
     * @param arrayN
     * El ordenamiento de burbuja bidireccional (también llamado "método de la sacudida" o "coctail sort" o "shaker sort")
     * es un algoritmo de ordenamiento que surge como una mejora del algoritmo ordenamiento de burbuja.
     * 
     * Si ya habéis visto como funciona el algoritmo de ordenación por burbuja habréis observado que los números grandes
     * se están moviendo rápidamente hasta al final de la lista (estas son las "liebres"), pero que los números pequeños
     * (las "tortugas") se mueven sólo muy lentamente al inicio de la lista.
     * 
     * Una solución es de ordenar con el método de burbuja y cuando llegamos al final de la primera iteración,
     * no volver a realizar el cálculo desde el principio sino que empezaremos desde el final hasta al inicio.
     * De esta manera siempre se consigue que tanto los números pequeños como los números grandes se desplacen
     * a los extremos de la lista lo más rápido posible.
     */
    static void burbujaDireccional(int arrayN[]) {
        int izq = 0;
        int der = arrayN.length - 1;
        int aux;
        int ultimo = arrayN.length - 1;

        do {
            //recorrido a la derecha
            for (int i = izq; i < der; i++) {
                if (arrayN[i] > arrayN[i + 1]) {
                    aux = arrayN[i];
                    arrayN[i] = arrayN[i + 1];
                    arrayN[i + 1] = aux;
                    ultimo = i;
                }
            }
            der = ultimo;

            // recorrido a la izquierda
            for (int j = der; j > izq; j--) {
                if (arrayN[j - 1] > arrayN[j]) {
                    aux = arrayN[j];
                    arrayN[j] = arrayN[j - 1];
                    arrayN[j - 1] = aux;
                    ultimo = j;
                }
            }
            izq = ultimo;
        } while (izq < der);
        /* Llama el método mostrarN, si ordenamos por hecho que lo quiere mostrar */
        mostrarN(arrayN);
    }

    /**
     * **********************************
     * ORDENAMIENTO BURBUJA
     *
     * @param arrayN
     *
     * La Ordenación de burbuja funciona revisando cada elemento de la lista que
     * va a ser ordenada con el siguiente, intercambiándolos de posición si
     * están en el orden equivocado. Es necesario revisar varias veces toda la
     * lista hasta que no se necesiten más intercambios, lo cual significa que
     * la lista está ordenada.
     */
    static void burbuja(int arrayN[]) {
        /* Bucle desde 0 hasta la longitud del array -1 */
        for (int i = 0; i < arrayN.length - 1; i++) {
            /* Bucle anidado desde 0 hasta la longitud del array -1 */
            for (int j = i + 1; j < arrayN.length; j++) {
                /*
                *Si el numero almacenado en la posición j es mayor que el de
                *La posición j+1 (el siguiente del array)
                 */
                if (arrayN[i] > arrayN[j]) {
                    /**
                     * Guardamos el número de la posición j+1 en una variable
                     * (el menor)
                     */
                    int aux = arrayN[i];
                    /*Lo intercambiamos de posición */
                    arrayN[i] = arrayN[j];
                    arrayN[j] = aux;
                    /**
                     * y volvemos al inicio para comparar los siguientes hasta
                     * que todos se hayan comparado
                     *
                     * De esta forma vamos dejando los números mayores al final
                     * del array en orden
                     */
                }
            }
        }
        /**
         * Llama al método mostrarN, si ordena damos por hecho que lo quiere mostrar
         */
        mostrarN(arrayN);
    }

    /**
     * *******************************
     * ORDENAMIENTO GNOME
     *
     * @param arrayN
     *
     * El algoritmo de ordenación conocido como Gnome_sort fue inventada por
     * Hamid Sarbazi-Azad, (profesor de la universidad de Sharif, una de las
     * mayores universidades de Irán) quien lo desarrolló en el año 2000 y al
     * que llamó Stupid sort (Ordenamiento estúpido).
     *
     * Cuando Dick Grune lo reinventó y documentó, no halló evidencias de que
     * existiera y en palabras suyas, dijo de él "the simplest sort algorithm"
     * (es el algoritmo más simple) y quizás tenga razón, pues lo describió en
     * sólo cuatro líneas de código. Dick Grune se basó en los gnomos de jardín
     * holandés, en como se colocan en los maceteros y de ahí también el nombre
     * que le dio.
     *
     * El algoritmo es similar a la ordenación por inserción , excepto que , en
     * lugar de insertar directamente el elemento a su lugar apropiado , el
     * algoritmo realiza una serie de permutaciones , como en el ordenamiento de
     * burbuja.
     */
    static void gnome(int[] arrayN) {
        int i = 1;//Inicia en la posición 1.
        int temp;//Variable temporal o auxiliar para intercambiar valores.
        while (i < arrayN.length) {//Mientras "i" sea menor que el tamaño del arreglo.
            if (arrayN[i] >= arrayN[i - 1]) {//Si el arreglo es mayor o igual al arreglo menos una posición.
                i = i + 1;//Se suma una posición.
            } else {//Sino, intercambia los valores
                temp = arrayN[i - 1];
                arrayN[i - 1] = arrayN[i];
                arrayN[i] = temp;
                if (i > 1) {//Si "i" es mayor que 1.
                    i = i - 1;//se resta una posición.
                }
            }
        }
        mostrarN(arrayN);//Se muestra el arreglo
    }

    /**
     * ******************************************
     * ORDENAMIENTO POR INSERCIÓN
     *
     * @param arrayN El ordenamiento por inserción es una manera muy natural de
     * ordenar para un ser humano, y puede usarse fácilmente para ordenar un
     * mazo de cartas numeradas en forma arbitraria.
     *
     * La idea de este algoritmo de ordenación consiste en ir insertando un
     * elemento de la lista ó un arreglo en la parte ordenada de la misma,
     * asumiendo que el primer elemento es la parte ordenada, el algoritmo ira
     * comparando un elemento de la parte desordenada de la lista con los
     * elementos de la parte ordenada, insertando el elemento en la posición
     * correcta dentro de la parte ordenada, y así sucesivamente hasta obtener
     * la lista ordenada.
     */
    static void insercionDirecta(int arrayN[]) {
        int p, j;
        int aux;
        for (p = 1; p < arrayN.length; p++) {//Desde el segundo elemento hasta 
            aux = arrayN[p];//El final, guardando el elemento y
            j = p - 1;//Empezamos a comprobar con el anterior 
            while ((j >= 0) && (aux < arrayN[j])) {//Mientras queden posciones y el 

                // valor de aux sea menor que los
                arrayN[j + 1] = arrayN[j];// de la izquierda, se desplaza a
                j--;//la derecha
            }
            arrayN[j + 1] = aux;// colocamos aux en su sitio.
        }
        mostrarN(arrayN);
    }

    /**
     * ********************************************************
     * Ordenación del peine o de Dobosiewicz
     *
     * @param gap
     * @param arrayN
     *
     * En 1980, Wlodzimierz Dobosiewicz propuso este algoritmo en su breve
     * artículo "An Efficient Variation of Bubble Sort", Information Processing
     * Letters, vol. 11, num. 1, 1980. En él escribió literalmente: "Bubble sort
     * can be improved in yet another way, which is similar to Shell’s version
     * of the insertion sort." ("La ordenación por burbuja se puede mejorar de
     * otra manera adicional, que es similar a la versión de Shell de la
     * ordenación por inserción"). Posteriormente fue redescubierto y
     * popularizado por Stephen Lacey y Richard Box en un artículo publicado por
     * la revista Byte en abril de 1991. En el ordenamiento de burbuja, cuando
     * dos elementos cualquiera se comparan, siempren tienen un espacio
     * (distancia entre ellos) de 1. La idea básica del algoritmo CombSort es
     * que el espacio pueda ser mucho mayor de uno. El ordenamiento Shell
     * también se basa en esta idea, pero es una modificación del algoritmo de
     * ordenamiento por inserción más que del algoritmo de ordenamiento de
     * burbuja.
     */
    private static int siGap(int gap) {
        gap = (gap * 10) / 13;
        if (gap < 1) {
            return 1;
        }
        return gap;
    }

    static void peine(int[] arrayN) {
        int n = arrayN.length;
        int gap = n;
        boolean flag = true;
        while (gap != 1 || flag == true) {
            gap = siGap(gap);
            flag = false;
            for (int i = 0; i < n - gap; i++) {
                if (arrayN[i] > arrayN[i + gap]) {
                    int aux = arrayN[i];
                    arrayN[i] = arrayN[i + gap];
                    arrayN[i + gap] = aux;

                    flag = true;
                }
            }
        }
        mostrarN(arrayN);
    }

    /**
     * ************************************************************
     * ORDENAMIENTO QUICKSORT
     *
     * @param arrayN
     * @param primero
     * @param ultimo
     *
     * El ordenamiento rápido (tambien llamado ordonamiento de Hoare o quicksort
     * en inglés) es un algoritmo creado por el científico británico en
     * computación Tony Hoare y basado en la técnica de divide y vencerás. Esta
     * es la técnica quizás la más eficiente y en ella que en la mayoría de los
     * casos da mejores resultados
     *
     * El algoritmo fundamental es el siguiente: 1. Elegir un elemento de la
     * lista de elementos a ordenar, al que llamaremos pivote. 2. Resituar los
     * demás elementos de la lista a cada lado del pivote, de manera que a un
     * lado queden todos los menores que él, y al otro los mayores. En este
     * momento, el pivote ocupa exactamente el lugar que le corresponderá en la
     * lista ordenada. 3. La lista queda separada en dos sublistas, una formada
     * por los elementos a la izquierda del pivote, y otra por los elementos a
     * su derecha. 4. Repetir este proceso de forma recursiva para cada sublista
     * mientras éstas contengan más de un elemento. Una vez terminado este
     * proceso todos los elementos estarán ordenados. Como se puede suponer, la
     * eficiencia del algoritmo depende de la posición en la que termine el
     * pivote elegido.
     */
    static void quicksort(int[] arrayN, int primero, int ultimo) {// Parámetros de entrada necesarios para el método, 
        int i, j, aux;// Declaración de variables necesarias para implementar el método Quick.
        int pivote;// El privote representa un número de referencia para realizar los ordenamientos.
        i = primero;// primer posicion del arreglo
        j = ultimo;// ultima posicion del arreglo
        pivote = arrayN[(i + j) / 2];// Tomar la mitad del arreglo o dividir el arreglo en 2. Esto se realiza en el caso
        // de que exista una mitad exacta, sino pasa esto, se toma un número diferente de la mitad.
        do {
            while (arrayN[i] < pivote) {// se colocan los nùmeros menores al pivote a la izquierda del arreglo.
                i++; //De esta forma si la condición se cumple, se recorre el arreglo en sentido de derecha a izquierda.
            }
            while (arrayN[j] > pivote) {// se recorre los ultimos elementos del arreglo hasta pivote
                j--; //De esta forma si la condición se cumple, se recorre el arreglo en sentido de izquierda a derecha.
            }
            // Aqui hacemos el intercambio de elementos
            if (i <= j) {
                aux = arrayN[i];
                arrayN[i] = arrayN[j]; // Corresponde a la mecánica de ordenación relacionada al método de la burbuja y a otros métodos de ordenamiento.
                arrayN[j] = aux;
                i++; // Incrementando al contador i.
                j--; // Decrementando al contador j.
            }

        } while (i <= j);// Mientras el valor guardado en la primera posición correpondiente a i sea menor o igual al valor correspondiente en la posicion j que es la última del arreglo.
        if (primero < j) { //Realizando recursividad del algoritmo para volver a repetir pasos sin necesidad de interponer un ciclo nuevo.
            quicksort(arrayN, primero, j);// En este caso el nuevo número que se encuentra en la posición final del arreglo, sería el almacenado en j.
        }
        if (i < ultimo) {// En este caso se define que la variable i, será la primera posición del arreglo, de esa forma se toma una pequeña población,
            // Que represente el conjunto nuevo a ordenar, de esa forma se divide el arreglo entre partes para ser nuevamente ordenado.
            quicksort(arrayN, i, ultimo);// De igual forma se realiza recursividad para evitar el proceso de algunos pasos nuevamente.
        }
    }

    /**
     * **************************************
     * ORDENAMIENTO SELECCION
     *
     * @param arrayN Consiste en encontrar el menor de todos los elementos del
     * vector e intercambiarlo con el que está en la primera posición. Luego el
     * segundo mas pequeño, y así sucesivamente hasta ordenarlo todo.
     */
    static void seleccion(int[] arrayN) {
        int i, j, menor, pos, temp;
        for (i = 0; i < arrayN.length; i++) {// tomamos el elemento menor como el primero
            menor = arrayN[i];//El menor lo guardo y el resto falta por ordenar
            pos = i;//guardo posición

            for (j = i + 1; j < arrayN.length; j++) {//Busqueda en el resto del vecto (TAO)
                if (arrayN[j] < menor) {
                    menor = arrayN[j];//menor que el actual
                    pos = j;
                }
            }

            //Si hay algún número menor lo intercambia
            if (pos != i) {
                temp = arrayN[i];
                arrayN[i] = arrayN[pos];
                arrayN[pos] = temp;
            }
        }

        /**
         * Llama al método mostrarN, si ordena damos por hecho que lo quiere
         * mostrar
         */
        mostrarN(arrayN);
    }

    /**
     * ***********************************
     * ORDENAMIENTO SHELL
     *
     * @param arrayN La ordenación de Shell pertenece a los métodos de
     * clasificación avanzados, nombrado así en honor del ingeniero y matemático
     * estadounidense Donald Shell que la propuso en 1959.
     *
     * Este método utiliza una segmentación entre los datos. Funciona comparando
     * elementos que estén distantes; la distancia entre comparaciones decrece
     * conforme el algoritmo se ejecuta hasta la ultima fase, en la cual se
     * comparan los elementos adyacentes, por esta razón se le llama ordenación
     * por disminución de incrementos.
     *
     * La ordenación de Shell usa una secuencia, h1, h2, . . ., ht, conocida
     * como la secuencia de incrementos. Al principio de todo proceso, se fija
     * una secuencia decreciente de incrementos. Cualquier secuencia funcionará
     * en tanto que empiece con un incremento grande, pero menor al tamaño del
     * arreglo de los datos a ordenar, y que el último valor de dicha secuencia
     * sea 1.
     *
     * Una elección muy común (pero no tan eficiente) para la secuencia de
     * incrementos es adoptar la secuencia sugerida por Shell: h1 = 1, hn+1 =
     * 3hn+1 . En la siguiente animación - debido al pequeño tamaño del vector -
     * elegí h1=1, h2=2, h3=3, h4=4, h5=6. Esta es la secuencia de Vaughan Pratt
     * en 1971.
     */
    static void shellSort(int[] arrayN) {
        int salto, aux, i;
        boolean cambios;
        for (salto = arrayN.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {// Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < arrayN.length; i++) {// se da una pasada 
                    if (arrayN[i - salto] > arrayN[i]) { // y si están desordenados
                        aux = arrayN[i];//se reordenan
                        arrayN[i] = arrayN[i - salto];
                        arrayN[i - salto] = aux;
                        cambios = true;//y se marca como cambio.
                    }
                }
            }
            mostrarN(arrayN);
        }
    }

    private static void mostrarN(int[] arrayN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
