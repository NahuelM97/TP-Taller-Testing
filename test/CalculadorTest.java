package test;

import java.util.Arrays;

import modelo.Calculador;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculadorTest
{
    public CalculadorTest()
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
     * @see modelo.Calculador#suma(java.lang.Double[],java.lang.Double[])
     */
    @Test
    public void testSuma()
    {
        Double[] sumando1 = new Double[]{9.0,8.0,7.0};
        Double[] sumando2 = new Double[]{7.0,5.0,3.0};
        Double[] resultado = Calculador.suma(sumando1,sumando2);
        Double[] esperado = new Double[]{16.0,13.0,10.0};
        if(!Arrays.equals(resultado,esperado))
            fail("La suma no se realizó correctamente");
    }

    /**
     * @see modelo.Calculador#resta(java.lang.Double[],java.lang.Double[])
     */
    @Test
    public void testResta()
    {
        Double[] sustraendo = new Double[]{9.0,8.0,7.0};
        Double[] minuendo = new Double[]{7.0,5.0,3.0};
        Double[] resultado = Calculador.resta(sustraendo,minuendo);
        Double[] esperado = new Double[]{2.0,3.0,4.0};
        if(!Arrays.equals(resultado,esperado))
            fail("La resta no se realizó correctamente");
    }
}
