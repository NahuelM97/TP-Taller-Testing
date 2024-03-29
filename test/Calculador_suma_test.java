package test;

import java.util.Arrays;

import modelo.Calculador;

import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Calculador_suma_test
{
    public Calculador_suma_test()
    {
    }

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    /**
     * @author Nahuel
     * @see modelo.Calculador#suma(java.lang.Double[],java.lang.Double[])
     */
    @Test
    public void testSuma()
    {
        Double[] sumando1 = new Double[]{9.0,8.0,7.0};
        Double[] sumando2 = new Double[]{7.0,5.0,3.0};
        Double[] resultado = Calculador.suma(sumando1,sumando2);
        Double[] esperado = new Double[]{16.0,13.0,10.0};
        Assert.assertArrayEquals("La suma no se realiz� correctamente", esperado, resultado);
    }


}
