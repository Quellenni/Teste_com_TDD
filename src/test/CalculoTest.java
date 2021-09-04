package test;


import Calculo.Divisao;
import Calculo.Multiplicacao;
import Calculo.Soma;
import Calculo.Subtracao;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculoTest {
    public CalculoTest() {

    }

    @Test
    public void somaTest () {

        int a = 20;
        int b = 30;
        int expResult = 50;
        int result = Soma.Soma(a,b);
        System.out.println(result);
        assertEquals(expResult,result);


    }

    @Test
    public void subtracaotest() {

        int a = 15;
        int b = 10;
        int expResult = 5;
        int result = Subtracao.Subtracao(a,b);
        System.out.println(result);
        assertEquals(expResult,result);

    }
    @Test
    public void multiplicacaotest() {

        int a = 9;
        int b = 10;
        int expResult = 90;
        int result = Multiplicacao.Multiplicacao(a,b);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    @Test
    public void divisao () {

        int a = 25;
        int b = 5;
        int expResult = 5;
        int result = Divisao.Divisao(a,b);
        System.out.println(result);
        assertEquals(expResult, result);
    }

}



