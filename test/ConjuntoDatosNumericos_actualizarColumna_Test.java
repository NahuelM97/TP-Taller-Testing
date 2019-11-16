package test;

import client.Parser;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.ConjuntoDatosNumericos;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConjuntoDatosNumericos_actualizarColumna_Test {
    private ConjuntoDatosNumericos conj;
    private String nombres[] = new String[3];
    private double filas[][] = new double[3][2];
    
    @Before
    public void setUp() throws Exception 
    {
        this.nombres[0] = "cero";
        this.nombres[1] = "uno";
        this.filas[0][0] = 0.0;
        this.filas[0][1] = 0.1;
        this.filas[1][0] = 1.0;
        this.filas[1][1] = 1.1;
        this.filas[2][0] = 2.0;
        this.filas[2][1] = 2.1;
        this.conj = new ConjuntoDatosNumericos("Prueba", this.nombres, this.filas);
    }

    @After
    public void tearDown() throws Exception 
    {
    }
    
    @Test
    public void actualizarColumna_Test_Clase1_1()
    {
        Integer arrayEntero[] = new Integer[3];
        arrayEntero[0]= 5;
        arrayEntero[1]= 6;
        arrayEntero[2]= 7;
        try{
            this.conj.actualizarColumna("cero", arrayEntero);
            Object aux[] = null;
            aux = this.conj.getColumna("cero");
            if(((Integer)aux[0]!=5)||((Integer)aux[1]!=6)||((Integer)aux[2]!=7))
            {
                Assert.fail("No actualizo correctamente la columna");
            }
        }       
        catch(Exception e)
        {
            Assert.fail("Crashea por motivos desconocidos, deberia haber actualizado bien");
        }
    }
    
    @Test
    public void actualizarColumna_Test_Clase1_2()
    {
        Double arrayDouble[] = new Double[3];
        arrayDouble[0]= 5.1;
        arrayDouble[1]= 6.2;
        arrayDouble[2]= 7.3;
        try{
            this.conj.actualizarColumna("cero", arrayDouble);
            Object aux[] = null;
            aux = this.conj.getColumna("cero");
            if(((Double)aux[0]!=5.1)||((Double)aux[1]!=6.2)||((Double)aux[2]!=7.3))
            {
                Assert.fail("No actualizo correctamente la columna");
            }
        }       
        catch(Exception e)
        {
            Assert.fail("Crashea por motivos desconocidos, deberia haber actualizado bien");
        }
    }
    
    @Test
    public void actualizarColumna_Test_Clase2_1()
    {
        Double arrayDouble[] = new Double[3];
        arrayDouble[0]= 5.1;
        arrayDouble[1]= 6.2;
        arrayDouble[2]= 7.3;
        try{
            this.conj.actualizarColumna(null, arrayDouble);
            Object aux[] = null;
            aux = this.conj.getColumna("cero");
            if(((Double)aux[0]!=5.1)||((Double)aux[1]!=6.2)||((Double)aux[2]!=7.3))
                {
                Assert.fail("No actualizo correctamente la columna");
            }
        }       
        catch(Exception e)
        {
            Assert.fail("Crashea por null, deberia manejar una excepcion");
        }
        Assert.fail("Deberia haber crasheado antes");
    }
    
    @Test
    public void actualizarColumna_Test_Clase2_2()
    {
        Double arrayDouble[] = new Double[3];
        arrayDouble[0]= 5.1;
        arrayDouble[1]= 6.2;
        arrayDouble[2]= 7.3;
        try{
            this.conj.actualizarColumna("cuatro", arrayDouble);
            Object aux[] = null;
            aux = this.conj.getColumna("cero");
            if(((Double)aux[0]!=5.1)||((Double)aux[1]!=6.2)||((Double)aux[2]!=7.3))
            {
                Assert.fail("No actualizo correctamente la columna");
            }
        }       
        catch(Exception e)
        {
            Assert.fail("Crashea por columna inexistente, deberia manejar una excepcion o poner precondicion");
        }
        Assert.fail("Deberia haber crasheado antes");
    }
    
    @Test
    public void actualizarColumna_Test_Clase2_3()
    {
        try{
            this.conj.actualizarColumna("cero", null);
            Object aux[] = null;
            aux = this.conj.getColumna("cero");
            if(((Double)aux[0]!=5.1)||((Double)aux[1]!=6.2)||((Double)aux[2]!=7.3))
            {
                Assert.fail("No deberia entrar aca");
            }
        }       
        catch(Exception e)
        {
            Assert.fail("Crashea por columna null, deberia manejar una excepcion o poner precondicion");
        }
        Assert.fail("Deberia haber crasheado antes");
    }
    
    @Test
    public void actualizarColumna_Test_Clase2_4()
    {
        String arrayString[] = new String[3];
        arrayString[0]= "hola";
        arrayString[1]= "chau";
        arrayString[2]= "probando";
        try{
            this.conj.actualizarColumna("cero",arrayString);
            Object aux[] = null;
            aux = this.conj.getColumna("cero");
            if((((String)aux[0]).equals("hola"))||(((String)aux[1]).equals("chau"))||((((Double)aux[2]).equals("probando"))))
            {
                Assert.fail("Actualizo con un string, no deberia pasar");
            }
        }       
        catch(Exception e)
        {
            Assert.fail("Crashea por columna String, deberia manejar una excepcion o poner precondicion");
        }
        Assert.fail("Deberia haber crasheado antes");
    }
    
    @Test
    public void actualizarColumna_Test_Clase1_1_Escenario2()
    {
        Integer arrayEntero[] = new Integer[3];
        arrayEntero[0]= 5;
        arrayEntero[1]= 6;
        arrayEntero[2]= 7;
        try{
            this.conj=new ConjuntoDatosNumericos("Prueba", null, this.filas);
            this.conj.actualizarColumna("cero", arrayEntero);
            Object aux[] = null;
            aux = this.conj.getColumna("cero");
            if(((Integer)aux[0]!=5)||((Integer)aux[1]!=6)||((Integer)aux[2]!=7))
            {
                Assert.fail("No actualizo correctamente la columna");
            }
        }       
        catch(Exception e)
        {
            Assert.fail("Crashea por tener la coleccion nula, deberia manejar una excepcion");
        }
        Assert.fail("Deberia haber crasheado antes");
    }
}
