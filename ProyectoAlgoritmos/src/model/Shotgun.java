package model;

import service.ArchivoDAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class Shotgun {
    private int totalChars;
    private int fragmentos;
    private int longitud;


    String path = "text.txt";
    ArchivoDAO archivo = new ArchivoDAO();

    // genera un texto con caracteres aletorios
    public String randomText(int totalChars) {
        Random random = new Random();
        StringBuilder textoFinal = new StringBuilder();

        for (int i = 0; i <= totalChars; i++) {

            char randomChar = (char) (random.nextInt((122 - 97) + 1) + 97); // random de 97 a 122
            textoFinal.append(randomChar);

        }
        archivo.nuevoTexto(path, textoFinal.toString());
        return textoFinal.toString();
    }

    public String leector() throws IOException {
        BufferedReader texto = null;
        String lineaTexto = null;
        try {
            texto = archivo.getReadFile(path);
            lineaTexto = texto.readLine();
        } catch (IOException ioe) {
            System.out.println("Problemas con el archivo");
        }
        return lineaTexto;
    }

    public void fragmentador(int longitud, int cantFragmentos) throws IOException {
        boolean primero = false;
        int traslape = longitud / 2; // 6
        int indiceActual = 0;

        for (int i = 0; i < cantFragmentos; i++) {
            if (!primero) {
                System.out.println(leector().substring(0, longitud));
                indiceActual = longitud;
                primero = true;
            } else {
                    System.out.println(leector().substring(indiceActual - traslape, indiceActual + traslape));
                    indiceActual += traslape;
                }


        }


    }
}
