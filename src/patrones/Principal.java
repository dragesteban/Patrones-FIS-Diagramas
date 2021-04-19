/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.Scanner;
import patrones.creacionales.factorymethod.EjemploFactoryMethod;
import patrones.creacionales.singleton.EjemploSingleton;
/**
 *
 * @author chamo
 */
public class Principal {

    public static void main(String[] args) {
        Ejemplo ejemplo = null;
        int opcion = 0;
        int maxOpc = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero entre 0 y " + maxOpc
                    + " para ver un ejemplo de patrones");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > maxOpc);
        String patron = "";

        switch (opcion) {
            //Creacionales
            case 0:
                patron = "Singleton";
                ejemplo = new EjemploSingleton();
                break;
            case 1:
                patron = "FactoryMethod";
                ejemplo = new EjemploFactoryMethod();
                break;
        }

        System.out.println("Patron: '" + patron + "'");
        ejemplo.operacion();

    }
}
