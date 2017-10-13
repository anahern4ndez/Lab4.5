/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercito;

/**
 *
 * @author Ana Lucia Hernandez (17138)
 *  Una clase para representar a los soldados.
 * @since 13.10.2017
 * Soldado.java
 */
public class Soldado extends Militar 
{
/**
 * metodo para obtener horas de un soldado
 * @return horas
 */
    public int getHoras() 
    {
        return super.getHoras()*2 ;           // trabaja 80 horas / semana
    }
  /**
 * metodo para obtener el salario de un soldado
 * @return salario
 */  
    public double getSalario() 
    {
        return super.getSalario() - 10000.0;      // Q30,000.00 / anio
    }
   /**
 * metodo para obtener dias de vacaciones de un soldado
 * @return int dias de vacaciones
 */ 
    public int getDiasVacaciones() 
    {
        return super.getDiasVacaciones()/2;           // 1 semana de vacaciones pagadas
    }
    /**
 * metodo para recibir una orden
 */
    public void recibeOrden()
    {
        System.out.println("¡Ordene mi general!");
    }
    
}
