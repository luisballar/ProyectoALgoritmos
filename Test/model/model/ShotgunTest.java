package model;

import model.Shotgun;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ShotgunTest {

    Shotgun gun = new Shotgun();

    @Test
    public void prueba_sgotGun_Random(){

        System.out.println(gun.randomText(100));

    }
    @Test
    public void pruebaLectura() throws IOException {
       // System.out.println();
    }

    @Test
    public void pruebaFragmentador() throws IOException {
        gun.fragmentador(12,10);
    }

}
