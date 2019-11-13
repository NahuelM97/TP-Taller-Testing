package test;

import client.Parser;

import java.util.HashMap;

import java.util.Iterator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Parser_obtenerTokens_test 
{
    private Parser parser;
    private HashMap<Integer,String> tokens;
    
    
    @Before
    public void setUp() throws Exception 
    {
        this.parser=new Parser();
        this.tokens = new HashMap<Integer,String>();
    }

    @After
    public void tearDown() throws Exception 
    {
    }
    
    @Test
    public void TestobtenerTokensClase_1()
    {
        try
        {
            this.tokens = this.parser.obtenerTokens("usar <nombre_conjunto_de_datos>");
            if(this.tokens.isEmpty())
            {
                Assert.fail("Devuelve HashMap vacio. No deberia entrar aca");
            }
            if(!this.tokens.containsValue("usar")){
                Assert.fail("No agrega bien el comando. No deberia entrar aca");
            }
            else
            {
                if(!this.tokens.containsValue("<nombre_conjunto_de_datos>"))
                {
                    Assert.fail("No agrega bien el comando. No deberia entrar aca");
                }
            }
        }
        catch(Exception e){
            Assert.fail("Crashea por motivos desconocidos");
        }
    }
    
    
    @Test
    public void TestobtenerTokensClase_2_1()
    {
        try
        {
            this.tokens = this.parser.obtenerTokens(null);
            if(this.tokens.isEmpty())
            {
                Assert.fail("Devuelve HashMap vacio. No deberia entrar aca");
            }
        }
        catch(Exception e){
            Assert.fail("Crashea por nulo. Deberia resolverse con una excepcion");
        }
        Assert.fail("Deberia haber crasheado");
    }
    
    @Test
    public void TestobtenerTokensClase_2_2()
    {
        try{
            this.tokens = this.parser.obtenerTokens("");
            if(this.tokens.isEmpty())
            {
                Assert.fail("Devuelve HashMap vacio. No deberia salir por aca");
            }
            if(!this.tokens.containsValue("")){
                Assert.fail("No agrega bien el comando. No deberia entrar aca");
            }
            else
            {
                if(!this.tokens.containsValue(""))
                {
                    Assert.fail("No agrega bien el comando. No deberia entrar aca");
                }
            }
        }
        catch(Exception e){
            Assert.fail("Crashea por vacio. Deberia resolverse con una excepcion.");
        }
        Assert.fail("Deberia haber crasheado");
    }
}
