/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Shotgun;
import service.ArchivoDAO;

import java.io.IOException;

public class ProyectoAlgoritmos {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here        
        Shotgun gun = new Shotgun();

        gun.fragmentador(133,  165);

    }
}
