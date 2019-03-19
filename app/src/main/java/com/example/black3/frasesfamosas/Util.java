package com.example.black3.frasesfamosas;

import java.util.Random;

public class Util {

    public static int generarNumeroAleatorio (int max){

        Random random = new  Random ();
        random.setSeed(System.currentTimeMillis());

        int numeroRandom = random.nextInt(max);

        return numeroRandom;

    }
}
