package model;

import model.Shotgun;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.ArchivoDAO;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ShotgunTest {

    Shotgun gun = new Shotgun();

    @Test
    public void pruebaLectura() throws IOException {
       // System.out.println();
    }

    @Test
    public void fragmentadorHacer(){

        try {
            gun.fragmentador(13, 12);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
