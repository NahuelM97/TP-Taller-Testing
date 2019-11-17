package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;

import java.util.ArrayList;

import modelo.ConjuntoDatos;
import modelo.ConjuntoDatosNoNumericos;
import modelo.ConjuntoDatosNumericos;
import modelo.ParserArchivo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParserArchivo_obtenerConjuntoDatos_test {
    private ParserArchivo parser;
    private ArrayList<ConjuntoDatosNumericos> conjuntos;
    private ArrayList<ConjuntoDatosNoNumericos> conjuntosNoNumerico;
    @Before
    public void setUp() throws Exception 
    {
    }
    @After
    public void tearDown() throws Exception 
    {
    }
    
    
    @Test
    public void obtenerConjuntoDatos_Test_Clase1_1()
    {
        try
        {
            ConjuntoDatosNumericos conj;
            String[] nombres = new String[2];
            nombres[0] = "cerouno";
            nombres[1] = "unouno";
            double[][] filas = new double[3][2];
            filas[0][0] = 10.0;
            filas[0][1] = 10.1;
            filas[1][0] = 11.0;
            filas[1][1] = 11.1;
            filas[2][0] = 12.0;
            filas[2][1] = 12.1;
            conj = new ConjuntoDatosNumericos("Prueba", nombres, filas);
            this.conjuntos = new ArrayList<ConjuntoDatosNumericos>();
            this.conjuntos.add(conj);
            this.parser.grabarDatos(conjuntos);
            File archivo = new File(".\\Datos\\"+"Prueba"+".dat");
            ConjuntoDatos aux = this.parser.obtenerConjuntoDatos(archivo);
            Assert.assertEquals("Obtuvo mal el conjunto de datos", conj, aux);
        }            
        catch (Exception e){
            Assert.fail("Crashea por motivos desconocidos");
        }
    }

    
    @Test
    public void obtenerConjuntoDatos_Test_Clase1_2()
    {
        try
        {
            ConjuntoDatosNoNumericos conj;
            String[] nombres = new String[2];
            nombres[0] = "cerouno";
            nombres[1] = "unouno";
            String[][] filas=new String[3][2];
            filas[0][0] = "cerocero";
            filas[0][1] = "cerouno";
            filas[1][0] = "unocero";
            filas[1][1] = "unouno";
            filas[2][0] = "doscero";
            filas[2][1] = "dosuno";
            conj = new ConjuntoDatosNoNumericos("Prueba", nombres, filas);
            this.conjuntosNoNumerico = new ArrayList<ConjuntoDatosNoNumericos>();
            this.conjuntosNoNumerico.add(conj);
            this.parser.grabarDatos(conjuntos);
            File archivo = new File(".\\Datos\\"+"Prueba"+".dat");
            ConjuntoDatos aux = this.parser.obtenerConjuntoDatos(archivo);
            Assert.assertEquals("Obtuvo mal el conjunto de datos", conj, aux);
        }            
        catch (Exception e){
            Assert.fail("Crashea por motivos desconocidos");
        }
    }
    
    }
    
    
}
