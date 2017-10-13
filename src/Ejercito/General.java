
package Ejercito;
/**
 *
 * @author Ana Lucia Hernandez (17138)
 *  Una clase para representar a los Generales.
 * @since 13.10.2017
 * Coronel.java
 */


public class General extends Militar 
{
    /**
 * metodo para obtener los dias de vacaciones de un general
 * @return int con dias de vacaciones
 */
    public int getDiasVacaciones() 
    {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }
/**
 * metodo para obtener formulario de vacaciones
 * @return String
 */
    public String getFormularioVacaciones() 
    {
        return "rosado";
    }
/**
 * metodo para obtener planificar estrategia
 */
    public void planificaEstrategia() 
    {
        System.out.println("Llevaremos tres divisiones a la frontera!");
    }

    
}
