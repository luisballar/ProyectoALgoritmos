package model;

import service.ArchivoDAO;

import java.util.Random;

public class Shotgun {
    private int totalChars;
    private int fragmentos;
    private int longitud;

    String path = "text.txt";
    ArchivoDAO archivo = new ArchivoDAO();

    // genera un texto con caracteres aletorios
    public String randomText(int longitud){
        Random random = new Random();
        StringBuilder textoFinal = new StringBuilder();

        for(int i = 0; i <= longitud; i++){

            char randomChar = (char) (random.nextInt((122-97) + 1) + 97); // random de 97 a 122
            textoFinal.append(randomChar) ;

        }
        archivo.nuevoTexto(path, textoFinal.toString());

        return textoFinal.toString();
    }
}
