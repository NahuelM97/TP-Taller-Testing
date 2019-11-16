package test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({ Calculador_frecuenciaPorcentual_test.class, Calculador_promedio_test.class,
                      Calculador_resta_test.class, Calculador_suma_test.class,
                      ConjuntoDatosNoNumericos_getColumna_Test.class,
                      ConjuntoDatosNumericos_actualizarColumna_Test.class, ConjuntoDatosNumericos_getColumna_test.class,
                      Parser_obtenerTokens_test.class, ParserArchivo_grabarDatos_test.class,
                      ParserArchivo_obtenerConjuntoDatos_test.class
    })


public class Todoslostest
{

}
