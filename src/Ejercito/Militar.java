/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercito;

/**
 *
 * @author Ana Lucia Hernandez (17138)
 *  Una clase para representar a los Militares en general.
 * @since 13.10.2017
 * Coronel.java
 */
public class Militar 
{
    /**
 * metodo para obtener las horas de un militar
 * @return horas
 */
    public int getHoras() 
    {
        return 40;           // trabaja 40 horas / semana
    }
    /**
 * metodo para obtener el salario de un militar
 * @return salario
 */
    public double getSalario() 
    {
        return 40000.0;      // Q40,000.00 / anio
    }
   /**
 * metodo para obtener los dias de vacaciones
 * @return dias de vacaciones
 */ 
    public int getDiasVacaciones() 
    {
        return 10;           // 2 semanas de vacaciones pagadas
    }
/**
 * metodo para obtener el tipo de formulario
 * @return formulario
 */
    public String getFormularioVacaciones() 
    {
        return "amarillo";     // use el formulario amarillo
    }
}
    

