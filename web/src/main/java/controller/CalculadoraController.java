
package controller;

import interfaces.Calculadora;
import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;

@ManagedBean(eager = true)
public class CalculadoraController{
    
    @EJB
    private Calculadora calc;
    private int numero1;
    private int numero2;
    private int resultado;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public String soma(){
        resultado = calc.somar((numero1), (numero2));
        numero1 = 0;
        numero2 = 0;
        return null;
    }
    
}
