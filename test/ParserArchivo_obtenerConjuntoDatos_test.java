package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;

import java.util.ArrayList;

import modelo.ConjuntoDatos;
import modelo.ConjuntoDatosNumericos;
import modelo.ParserArchivo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParserArchivo_obtenerConjuntoDatos_test {
    private ParserArchivo parser;
    private ArrayList<ConjuntoDatosNumericos> conjuntos;
    @Before
    public void setUp() throws Exception 
    {
    }
    @After
    public void tearDown() throws Exception 
    {
    }
    
    
    @Test
    public void obtenerConjuntoDatos_Test_Clase1()
    {
        try
        {
            ConjuntoDatosNumericos conj;
            String[] nombres = null;
            nombres[0] = "cerouno";
            nombres[1] = "unouno";
            double[][] filas=null;
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
            if(conj!=aux){
                Assert.fail("Obtuvo mal el conjunto de datos");
            }
        }            
        catch (Exception e){
            Assert.fail("Crashea por motivos desconocidos");
        }
    }
    
    
}
