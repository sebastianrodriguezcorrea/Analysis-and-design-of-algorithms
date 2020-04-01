/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.abd.coronavirus.model;

import java.util.*;
import java.io.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Sebastian
 */
public class TxtJava {

    //Zona de declaración de variables.
    private String nombrePais;
    private int numContagiados;
    private int numMuertos;
    File FicheroCoronaVirus = new File("CoronaVirus.txt");
    ArrayList<TxtJava> virus = new ArrayList<TxtJava>();
    TxtJava objeto = null;

    public TxtJava(String nombrePais, int numContagiados, int numMuertos) {
        this.nombrePais = nombrePais;
        this.numContagiados = numContagiados;
        this.numMuertos = numMuertos;
    }

    public TxtJava() {
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getNumContagiados() {
        return numContagiados;
    }

    public void setNumContagiados(int numContagiados) {
        this.numContagiados = numContagiados;
    }

    public int getNumMuertos() {
        return numMuertos;
    }

    public void setNumMuertos(int numMuertos) {
        this.numMuertos = numMuertos;
    }

    public File getFicheroCoronaVirus() {
        return FicheroCoronaVirus;
    }

    public void setFicheroCoronaVirus(File FicheroCoronaVirus) {
        this.FicheroCoronaVirus = FicheroCoronaVirus;
    }

    public ArrayList<TxtJava> getVirus() {
        return virus;
    }

    public void setVirus(ArrayList<TxtJava> virus) {
        this.virus = virus;
    }

    public TxtJava getObjeto() {
        return objeto;
    }

    public void setObjeto(TxtJava objeto) {
        this.objeto = objeto;
    }

    public void comprobarBd() {
        try {
            //Variable con la ruta donde está el archivo de texto de la base e datos del programa de Coronona Virus
            if (!FicheroCoronaVirus.exists()) {
                //Si el fichero no existe, se creará uno nuevo en el archivo del programa CoronaVirus.
                FicheroCoronaVirus.createNewFile();
                //Se le avisará al usuario que la base de datos basada en archivo .txt ya fue creada.
                System.out.println("La base de datos del programa Corona Virus ha sido creada");
            } else {
                //Si el archivo ya existe, se le avisrá al usuario que el .txt ya se encuentra en la carpeta del programa Corona Virus.
                System.out.println("La base de datos del programa Corona Virus ya existe");
            }
        } catch (Exception e) {
            //Si sucede algo anormal, se le avisará al usuario cuál fue el error realizado al ejecutar el programa del Corona Virus.
            System.out.println(e.getMessage());
        }
    }

    public void insertarDato(String nombrePais, int numContagiados, int numMuertos) {
        try {
            setNombrePais(nombrePais);
            setNumContagiados(numContagiados);
            setNumMuertos(numMuertos);

            /**
             * Se abre el flujo de escritura, sobre el fichero con codificación
             * UTF8 con la clase correspondiente a BufferedWriter
             */
            //Variable de tipo BufferedWriter para sobreescribir en un archivo.
            BufferedWriter escribirFichero = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FicheroCoronaVirus, true), "utf-8"));
            /**
             * Escribir en el fichero la cadena que recibe el método. El String
             * "\r\n" significa salto de línea y el "\t" significa tabulación de
             * los datos
             */
            escribirFichero.write(getNombrePais() + "\t" + getNumContagiados() + "\t" + getNumMuertos() + "\r\n");//"\r retorno de carri"
            System.out.println("El dato a sido insertado de forma correcta en la base de datos .txt");
            escribirFichero.close();//Cierra el flujo de escritura del fichero, es importante siempre cerrarlo.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void transformarTxtAObjeto() {
        try {
            String linea = null;//Variable para leer las líneas del fichero de texto.
            BufferedReader leerFichero = new BufferedReader(new FileReader(FicheroCoronaVirus));

            while ((linea = leerFichero.readLine()) != null) {

                StringTokenizer misTokens = new StringTokenizer(linea, "\t");//Según el "\t" va leyendo los datos.
                String nombrePais = misTokens.nextToken().trim();//Todos los datos trnaformados a String, el trim() es para quitar los espacios.
                String numContagiados = misTokens.nextToken().trim();
                String numMuertos = misTokens.nextToken().trim();

                //transformar los tipos de String a los tipos que hacen falta en int o double
                int numContagiosOperar = Integer.parseInt(numContagiados);
                int numMuertosOperar = Integer.parseInt(numMuertos);

                //lo pasamos al contructor para que se cree los objetos
                objeto = new TxtJava(nombrePais, numContagiosOperar, numMuertosOperar);
                //lo añadimos al vector para interactuar con él.
                virus.add(objeto);
            }
            leerFichero.close();
        } catch (Exception e) {
            //Capturar un posible error al guardar los datos, e imprimir dicho error en pantalla.
            System.out.println(e.getMessage());
        }
    }

    public void ActualizarArrayList() {
        //Se usa el ArrayList previamente declarado al comienzo del código

        /**
         * Tiene el objetivos de actualizar los datos ingresados al .txt y en
         * consecuencia actualiza el vector que almacena los datos.
         */
        virus.clear();
        transformarTxtAObjeto();
    }

    public void MostrarObjetos() {//Mostrar la información sobre el Corona Virus que se encuentra en el fichero .txt cargado en memoria.
        if (virus.size() == 0) {
            transformarTxtAObjeto();
        }
        System.out.println("************************** Casos del Corona Virus ***************************************");

        for (TxtJava n : virus) {
            System.out.println("El nombre del País es: " + n.getNombrePais() + "\t" + "El número de Contagiados es:" + n.getNumContagiados() + "\t" + "El número de Muertos es:" + n.getNumMuertos());
        }
        System.out.println("************************************************* FIN ************************************************");
    }

    public void modificarFichero(String nombrePais, int numContagiados, int numMuertos) {
        try {
            if (virus.size() == 0) {
                transformarTxtAObjeto();
            }

            boolean verificador = false;

            for (TxtJava n : virus) {
                if (n.getNombrePais().equalsIgnoreCase(nombrePais)) {
                    n.setNumContagiados(numContagiados);
                    n.setNumMuertos(numMuertos);
                    verificador = true;
                }
            }

            if (verificador) {
                System.out.println("El dato ha sido modificado");
            } else {
                System.out.println("El País no se ha encontrado");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void eliminarFicheroPorNombrePais(String nombrePais) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FicheroCoronaVirus));
            for (TxtJava n : virus) {
                if (!n.getNombrePais().equalsIgnoreCase(nombrePais)) {
                    bw.write(n.getNombrePais()+ "\t"+n.getNumContagiados()+ "\t"+n.getNumMuertos()+"\r\n");
                }else{
                    System.out.println("El producto ha sido eliminado");
                }
            }
            
            bw.close();
            virus.clear();
            transformarTxtAObjeto();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void guardarFichero(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(FicheroCoronaVirus));
            
            for (TxtJava n : virus) {
                bw.write(n.getNombrePais()+"\t"+n.getNumContagiados()+"\t"+n.getNumMuertos()+"\r\n");
            }
            
            bw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ordenarFicheroPorNumeroContagios(){
        try{
            if(virus.size()==0){
                transformarTxtAObjeto();
            }
            
            if(virus.size()>0){
                for (int i = 0; i < virus.size()-1; i++) {
                    for (int j = i+1; j < virus.size(); j++) {
                        if(virus.get(i).getNumContagiados()<virus.get(j).getNumContagiados()){
                            TxtJava aux = virus.get(i);
                            virus.set(i, virus.get(j));
                            virus.set(j, aux);
                        }
                    }
                }
                System.out.println("Se ha ordenado de manera exitosa");
            }else{
                System.out.println("No hay datos guardados para ordenar");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ordenarFicheroPorNumeroMuertes(){
        try{
            if(virus.size()==0){
                transformarTxtAObjeto();
            }
            
            if(virus.size()>0){
                for (int i = 0; i < virus.size()-1; i++) {
                    for (int j = i+1; j < virus.size(); j++) {
                        if(virus.get(i).getNumMuertos()<virus.get(j).getNumMuertos()){
                            TxtJava aux = virus.get(i);
                            virus.set(i, virus.get(j));
                            virus.set(j, aux);
                        }
                    }
                }
                System.out.println("Se ha ordenado de manera exitosa");
            }else{
                System.out.println("No hay datos guardados para ordenar");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
