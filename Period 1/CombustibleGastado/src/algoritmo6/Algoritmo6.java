/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo6;

/**
 *
 * @author Juan Sebastian
 */
public class Algoritmo6 {
    public static void main(String[] args) {
               //Inicializar scanner
        Scanner lector = new Scanner(System.in);
        //Variables
        int hora, velocidad_media;
        float resultadof;
        //Constantes
        final int CANTIDAD_LITRO = 12;
        //Proceso
        //Lectores
        hora = lector.nextInt();
        velocidad_media = lector.nextInt();
        //Procedimiento para resolver el problema
        resultadof = (float) (hora * velocidad_media) / CANTIDAD_LITRO;
	//Uso de herramienta para cambiar el formato de coma decimal a punto decimal
        DecimalFormatSymbols seperadorPersonalizados = new DecimalFormatSymbols();
        seperadorPersonalizados.setDecimalSeparator('.');
	//Utilizando la herramienta de DecimalFormat para imprimir solo 3 números después del punto decimal.
        DecimalFormat formato1 = new DecimalFormat(".000", seperadorPersonalizados);
	//Primera forma para imprimir resultado
        System.out.println(formato1.format(resultadof));
//        System.out.printf("%.3f%n", resultadof); Segunda forma para imprimir resultado

    }
    
}
