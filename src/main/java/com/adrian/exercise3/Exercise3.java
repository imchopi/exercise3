package com.adrian.exercise3;

import java.io.IOException;

public class Exercise3 {
    public static void main(String[] args) {

        try {
            ProcessBuilder command = new ProcessBuilder("/home/adrian/development/Process/Exercises/exercise3/target/bucle.sh");
            Process commandProcess = command.start();

            while (commandProcess.isAlive()) {
                System.out.println("Ejecutándose");
                Thread.sleep(3000);
            }

            System.out.println("Fin de la ejecución");

        } catch (IOException e) {
            System.out.println("Command error: " + e.getMessage());

        } catch (InterruptedException e) {
            System.out.println("Thread.sleep error: " + e.getMessage());
        }

    }
}
