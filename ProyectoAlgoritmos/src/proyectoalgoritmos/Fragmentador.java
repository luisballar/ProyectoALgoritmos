/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalgoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Fragmentador {
    
   //Método general para escribir en un archivo 
   public PrintStream getWriteFile(String nameFile) {
        PrintStream pS = null;
        File file = new File(nameFile);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            pS = new PrintStream(fos);
        }catch(FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null, "Problemas con el archivo" + fnfe);
        }
        return pS;
    }
   
   
    //Método general para leer un archivo 
public BufferedReader getReadFile(String nameFile) throws FileNotFoundException {
    File file = new File(nameFile);
    FileInputStream fis = new FileInputStream(file);
    InputStreamReader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);
    return br;
}
    


    public String[] contFragsTexto() throws IOException {
        BufferedReader br = null;
        String[] palabras = null;

        try {
            br = getReadFile("Original.txt");
            String linea;
            StringBuilder sb = new StringBuilder();

            while ((linea = br.readLine()) != null) {
                sb.append(linea).append(" ");
            }
            
            String textoCompleto = sb.toString().trim();
            palabras = textoCompleto.split("\\s+");
            
            JOptionPane.showMessageDialog(null, Arrays.toString(palabras));
            System.out.println("Número de palabras: " + palabras.length);
        } finally {
            if (br != null) {
                br.close();
            }
        }

        return palabras;
    }

    public void llenarPila(String[] array) {
        Pila buffer = new Pila(array.length);
        for (int i = 0; i < array.length; i++) {
            buffer.push(array[i]);
        }
        System.out.println("Tamaño de la pila: " + array.length);
    }
    
    public void ejecutar() throws IOException{
        llenarPila(contFragsTexto());
    }
   
}
