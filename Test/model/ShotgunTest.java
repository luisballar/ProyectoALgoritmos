package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShotgunTest {

    Shotgun gun = new Shotgun();

    @Test
    public void prueba_sgotGun_Random(){

        System.out.println(gun.randomText(100));

    }

}