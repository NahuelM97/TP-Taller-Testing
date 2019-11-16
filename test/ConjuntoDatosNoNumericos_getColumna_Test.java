package test;

import modelo.ConjuntoDatosNoNumericos;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConjuntoDatosNoNumericos_getColumna_Test {
    private ConjuntoDatosNoNumericos conj;
    private String nombres[] = new String[3];
    private String filas[][] = new String[3][2];
    @Before
    public void setUp() throws Exception 
    {
        this.nombres[0] = "cero";
        this.nombres[1] = "uno";
        this.filas[0][0] = "String00";
        this.filas[0][1] = "String01";
        this.filas[1][0] = "String10";
        this.filas[1][1] = "String11";
        this.filas[2][0] = "String20";
        this.filas[2][1] = "String21";
        this.conj = new ConjuntoDatosNoNumericos("Prueba", this.nombres, this.filas);
    }

    @After
    public void tearDown() throws Exception 
    {
    }
    
    @Test
    public void getColumna_Test_1_1_Esc1()
    {
        try{
            Object[] aux = this.conj.getColumna("cero");
            if(!((aux[0]).equals("String00"))||!((aux[1]).equals("String10"))||!(((aux[2]).equals("String20"))))
            {
                Assert.fail("No obtuvo bien la columna");
            }
        }
        catch(Exception e)
        {
            Assert.fail("Crashea por motivos desconocidos");
        }
    }
    
    @Test
    public void getColumna_Test_1_2_Esc1()
    {
        try{
            Object[] aux = this.conj.getColumna("");
            if(aux!=null)
            {
                Assert.fail("Encontro una columna y no deberia haber encontrado");
            }
        }
        catch(Exception e)
        {
            Assert.fail("Crashea por motivos desconocidos");
        }
    }
    
    @Test
    public void getColumna_Test_1_1_Esc2()
    {
        this.conj=null;
        this.nombres[0] = "tres";
        this.nombres[1] = "cuatro";
        this.filas[0][0] = "String00";
        this.filas[0][1] = "String01";
        this.filas[1][0] = "String10";
        this.filas[1][1] = "String11";
        this.filas[2][0] = "String20";
        this.filas[2][1] = "String21";
        this.conj = new ConjuntoDatosNoNumericos("Prueba", this.nombres, this.filas);
        
        try{
            
            Object[] aux = this.conj.getColumna("cero");
            if(aux!=null)
            {
                Assert.fail("Encontro una columna y no deberia haber encontrado");
            }
        }
        catch(Exception e)
        {
            Assert.fail("Crashea por motivos desconocidos");
        }
    }
}
