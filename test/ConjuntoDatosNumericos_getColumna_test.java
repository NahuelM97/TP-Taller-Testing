package test;

import modelo.ConjuntoDatosNumericos;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConjuntoDatosNumericos_getColumna_test {
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
        public void getColumna_Test_1_1_Esc1()
        {
            try{
                Object[] aux = this.conj.getColumna("cero");
                if(((Double)aux[0]!=0.0)||((Double)aux[1]!=1.0)||((Double)aux[2]!=2.0))
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
            this.filas[0][0] = 0.0;
            this.filas[0][1] = 0.1;
            this.filas[1][0] = 1.0;
            this.filas[1][1] = 1.1;
            this.filas[2][0] = 2.0;
            this.filas[2][1] = 2.1;
            this.conj = new ConjuntoDatosNumericos("Prueba", this.nombres, this.filas);
            
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
