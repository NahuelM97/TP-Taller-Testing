package test;

import modelo.Calculador;

import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Calculador_frecuenciaPorcentual_test
{
    Calculador calculador;
    public Calculador_frecuenciaPorcentual_test()
    {
    }

    @Before
    public void setUp()
        throws Exception
    {
    }

    @After
    public void tearDown()
        throws Exception
    {
    }

    /**
     * @see modelo.Calculador#promedio(java.lang.Double[])
     */
    @Test
    public void testFrecuenciaPorcentual1_3_7()
    {
        Double[] columna = new Double[]{2.0, 4.5, 10.5, -14.5}; 
        Double valor = new Double(2.0);
        double resultado = calculador.frecuenciaPorcentual(columna,valor);
        Assert.assertEquals("El promedio no se calculo correctamente",25.0,resultado,0.1);
    }
    
    @Test
    public void testFrecuenciaPorcentual1_3_5()
    {
        Double[] columna = new Double[0];
        Double valor = new Double(1.0);
        double resultado = calculador.frecuenciaPorcentual(columna,valor);
        Assert.assertEquals("La frecuencia porcentual no se calculo correctamente",0.0,resultado,0.1);
    }
}
