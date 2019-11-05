package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Calculador
{
    /* Metodo de programacion defensiva, para verificar que no hay celdas nulas en la columna */
    private static boolean verificaCeldaNoNula(Object[] columna)
    {
        int i = 0;
        
        while ((i < columna.length) && (columna[i] != null))
            i++;
        
        return i == columna.length;
    }
    
    /**
     * Este m�todo calcula la suma de dos columnas num�ricas entre s�. <br>
     * 
     * <b>pre:</b> ambas columnas son num�ricas, de igual longitud, no nulas y sin celdas nulas. <br>
     * <b>post:</b> se retorna una nueva columna, que contiene el resultado de sumar elemento a elemento ambas columnas. <br>
     * 
     * @param columna1 Es una columna num�rica, no nula, sin celdas nulas y de igual longitud que columna2. <br>
     * @param columna2 Es una columna num�rica, no nula, sin celdas nulas y de igual longitud que columna1. <br>
     * 
     * @return columna que contiene el resultado de la suma de ambas columnas. <br>
    */
    
    public static Double[] suma(Double[] columna1, Double[] columna2)
    {
        assert columna1 != null : "La columna no puede ser nula";
        assert columna2 != null : "La columna no puede ser nula";
        assert columna1.length == columna2.length : "No coinciden longitudes de arreglos";
        assert Calculador.verificaCeldaNoNula(columna1) : "La columna 1 no puede tener elementos nulos"; 
        assert Calculador.verificaCeldaNoNula(columna2) : "La columna 2 no puede tener elementos nulos";
        
        int i;
        Double[] resultado = new Double[columna1.length]; 

        for (i = 0; i < columna1.length; i++)
            resultado[i] = columna1[i] + columna2[i];
        
        assert i == columna1.length : "No se sumaron todos los elementos"; /* Invariante de ciclo */

        return resultado;
    }
    
    /**
     * Este m�todo calcula la resta de dos columnas num�ricas entre s�. <br>
     * 
     * <b>pre:</b> ambas columnas son num�ricas, de igual longitud, no nulas y sin celdas nulas. <br>
     * <b>post:</b> se retorna una nueva columna, que contiene el resultado de restar elemento a elemento ambas columnas. <br>
     * 
     * @param columna1 Es una columna num�rica, no nula, sin celdas nulas y de igual longitud que columna2. <br>
     * @param columna2 Es una columna num�rica, no nula, sin celdas nulas y de igual longitud que columna1. <br>
     * 
     * @return columna que contiene el resultado de la resta de ambas columnas. <br>
    */

    public static Double[] resta(Double[] columna1, Double[] columna2)
    {
        assert columna1 != null : "La columna no puede ser nula";
        assert columna2 != null : "La columna no puede ser nula";
        assert columna1.length == columna2.length : "No coinciden longitudes de arreglos";
        assert Calculador.verificaCeldaNoNula(columna1) : "La columna 1 no puede tener elementos nulos"; 
        assert Calculador.verificaCeldaNoNula(columna2) : "La columna 2 no puede tener elementos nulos";

        int i;
        Double[] resultado = new Double[columna1.length]; 

        for (i = 0; i < columna1.length; i++)
            resultado[i] = columna1[i] - columna2[i];

        assert i == columna1.length : "No se restaron todos los elementos"; /* Invariante de ciclo */

        return resultado;
    } 
    
    /**
     * Este m�todo calcula la frecuencia de repetici�n porcentual de un cierto valor en una columna de datos 
     * num�ricos o no num�ricos. <br>
     * 
     * <b>pre:</b> columna de datos num�ricos o no num�ricos, no nula y sin celdas nulas. <br>
     * <b>post:</b> se retorna la frecuencia de repetici�n porcentual del valor buscado. <br>
     * 
     * @param columna Es una columna de datos num�ricos o no num�ricos, no nula y sin celdas nulas. <br>
     * @param valor Es el valor a buscar en la columna de datos. <br>
     * 
     * @return frecuencia de repetici�n porcentual del valor buscado. <br>
    */
    
    public static double frecuenciaPorcentual(Object[] columna, Object valor)
    {
        assert columna != null : "La columna no puede ser nula";
        assert Calculador.verificaCeldaNoNula(columna) : "La columna no puede tener elementos nulos";
        
        int i; 
        double frec = 0;
        
        for (i = 0; i < columna.length; i++)
            if (columna[i].equals(valor))
                frec++;
        
        assert i == columna.length : "No se contabilizaron todos los elementos"; /* Invariante de ciclo */
        
        if (columna.length != 0)
            frec /= columna.length; 
    
        return frec * 100.0; /* % */
    }
    
    /**
     * Este m�todo calcula el promedio de una columna num�rica. <br>
     * 
     * <b>pre:</b> columna num�rica, no nula y sin celdas nulas. <br>
     * <b>post:</b> se retorna el promedio de los valores de la columna. <br>
     * 
     * @param columna Es una columna num�rica, no nula y sin celdas nulas. <br>
     * 
     * @return promedio de los valores de la columna. <br>
    */

    public static double promedio(Double[] columna)
    {
        assert columna != null : "La columna no puede ser nula";
        assert Calculador.verificaCeldaNoNula(columna) : "La columna no puede tener elementos nulos";
        
        double prom = 0;
        int i;

        for (i = 0; i < columna.length; i++)
            prom += columna[i];
        
        assert i == columna.length : "No se sumaron todos los elementos"; /* Invariante de ciclo */
        
        if (columna.length != 0)
            prom /= columna.length;

        return prom;
    }
    
    /**
     * Este m�todo calcula la moda multimodal de una columna de datos num�ricos o no num�ricos. <br>
     * 
     * <b>pre:</b> columna de datos num�ricos o no num�ricos, no nula y sin celdas nulas. <br>
     * <b>post:</b> se retorna la moda multimodal de los valores de la columna. <br>
     * 
     * @param columna Es una columna de datos num�ricos o no num�ricos, no nula y sin celdas nulas. <br>
     * 
     * @return moda multimodal de los valores de la columna. <br>
    */
    
    public static String moda(Object[] columna)
    {
        assert columna != null : "La columna no puede ser nula";
        assert Calculador.verificaCeldaNoNula(columna) : "La columna no puede tener elementos nulos";
        
        HashMap<Object, Integer> contador = new HashMap<Object, Integer>();
        int max = -1, cant, i;
        Iterator<Object> iter;
        Object valor;
        String moda = "";
        
        for (i = 0; i < columna.length; i++)
        {
            if (contador.containsKey(columna[i]))
                cant = contador.get(columna[i]) + 1;
            else
                cant = 1;
            contador.put(columna[i], cant);
            if (cant > max)
                max = cant;
        }
        
        assert i == columna.length : "No se contabilizaron todos los elementos"; /* Invariante de ciclo */
        
        iter = contador.keySet().iterator();
        if (max != -1)
            moda = Integer.toString(max)  + " apariciones de: ";
        while (iter.hasNext())
        {
            valor = iter.next();
            if (contador.get(valor) == max)
                moda = moda + valor + " ";
        }
        
        assert !iter.hasNext() : "No se vacio el iterator"; /* Invariante de ciclo */

        return moda;
    }
    
    /**
     * Este m�todo genera el histograma en formato String correspondiente a una columna de datos no num�ricos. <br>
     * 
     * <b>pre:</b> columna de datos no num�ricos, no nula y sin celdas nulas. <br>
     * <b>post:</b> se retorna el histograma en formato String correspondiente a los valores de la column. <br>
     * 
     * @param columna Es una columna de datos no num�ricos, no nula y sin celdas nulas. <br>
     * 
     * @return histograma en formato String correspondiente a los valores de la columna. <br>
    */
    
    public static String histograma(String[] columna)
    {
        assert columna != null : "La columna no puede ser nula";
        assert Calculador.verificaCeldaNoNula(columna) : "La columna no puede tener elementos nulos";
        
        TreeMap<String,Integer> contador = new TreeMap<String,Integer>();
        int i, cant;
        String actual;
        Iterator<String> iter;
        StringBuilder builder = new StringBuilder();
        
        /* Calcula frecuencia de cada dato */
        for (i = 0; i < columna.length; i++)
        {
            if (contador.containsKey(columna[i]))
                cant = contador.get(columna[i]) + 1;
            else
                cant = 1;
            contador.put(columna[i], cant);
        }
        
        assert i == columna.length : "No se contabilizaron todos los elementos"; /* Invariante de ciclo */
        
        /* Armo histograma */
        iter = contador.keySet().iterator();
        while (iter.hasNext())
        {
            actual = iter.next();
            cant = contador.get(actual);
            builder.append("\n" + actual + " : ");
            for (i = 1; i <= cant; i++)
                builder.append('=');
            
            assert i > cant : "No se completo el dibujo de la columna"; /* Invariante de ciclo */
        }
        
        assert !iter.hasNext() : "No se vacio el iterator"; /* Invariante de ciclo */
        
        return builder.toString();
    }
    
    /**
     * Este m�todo genera el histograma en formato String correspondiente a una columna de datos num�ricos. <br>
     * 
     * <b>pre:</b> columna de datos num�ricos, no nula y sin celdas nulas. <br>
     * <b>post:</b> se retorna el histograma en formato String correspondiente a los valores de la columna. <br>
     * 
     * @param columna Es una columna de datos num�ricos, no nula y sin celdas nulas. <br>
     * 
     * @return histograma en formato String correspondiente a los valores de la columna. <br>
    */
    
    public static String histograma(Double[] columna)
    {
        assert columna != null : "La columna no puede ser nula";
        assert Calculador.verificaCeldaNoNula(columna) : "La columna no puede tener elementos nulos";
        
        TreeMap<Double,Integer> contador = new TreeMap<Double,Integer>();
        int i, cant;
        Double actual;
        Iterator<Double> iter;
        StringBuilder builder = new StringBuilder();
        
        /* Calcula frecuencia de cada dato */
        for (i = 0; i < columna.length; i++)
        {
            if (contador.containsKey(columna[i]))
                cant = contador.get(columna[i]) + 1;
            else
                cant = 1;
            contador.put(columna[i], cant);
        }
        
        assert i == columna.length : "No se contabilizaron todos los elementos"; /* Invariante de ciclo */
        
        /* Armo histograma */
        iter = contador.keySet().iterator();
        while (iter.hasNext())
        {
            actual = iter.next();
            cant = contador.get(actual);
            builder.append("\n" + actual + " : ");
            for (i = 1; i <= cant; i++)
                builder.append('=');
            
            assert i > cant : "No se completo el dibujo de la columna"; /* Invariante de ciclo */
        }
        
        assert !iter.hasNext() : "No se vacio el iterator"; /* Invariante de ciclo */
        
        return builder.toString();
    }
}