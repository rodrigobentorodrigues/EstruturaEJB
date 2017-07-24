package Implementacao;

import interfaces.Calculadora;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(Calculadora.class)
public class CalculadoraImpl implements Calculadora {

    @Override
    public int somar(int n1, int n2) {
        return n1 + n2;
    }    
    
    
}
