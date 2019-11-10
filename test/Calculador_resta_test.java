package test;

import java.util.Arrays;

import modelo.Calculador;

import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Calculador_resta_test
{
    public Calculador_resta_test()
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
     * @see modelo.Calculador#resta(java.lang.Double[],java.lang.Double[])
     */
    @Test
    public void testResta()
    {
        Double[] sustraendo = new Double[]{9.0,8.0,7.0};
        Double[] minuendo = new Double[]{7.0,5.0,3.0};
        Double[] resultado = Calculador.resta(sustraendo,minuendo);
        Double[] esperado = new Double[]{2.0,3.0,4.0};
        Assert.assertArrayEquals("La resta no se realizó correctamente", esperado, resultado);
    }
}
