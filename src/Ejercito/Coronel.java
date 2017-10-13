
package Ejercito;

/**
 *
 * @author Ana Lucia Hernandez (17138)
 * Una clase para representar a los Coroneles.
 * @since 13.10.2017
 * Coronel.java
 */

public class Coronel extends Teniente 
{
/**
 * metodo para obtener el salario de un coronel
 * @return salario
 */
    public double getSalario() 
    {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
/**
 * metodo para ejecutar una orden de maniobra
 */    
    public void ejecutaOrdenManiobra() 
    {
        System.out.println("Presenten Armas!");
    }
}
    
