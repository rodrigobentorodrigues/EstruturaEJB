
package main;

import interfaces.Calculadora;
import locater.ServiceLocater;

public class Main {
    
    public static void main(String[] args) {
        
        Calculadora c = new ServiceLocater().lookup("java:global/core/CalculadoraImpl");
        System.out.println(c.somar(10, 20));
        
    }
    
}
