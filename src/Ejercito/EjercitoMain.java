
package Ejercito;
/**
 *
 * @author Ana Lucia Hernandez (17138)
 *  clase main
 * @since 13.10.2017
 * EjercitoMain.java
 */
public class EjercitoMain 
{
    public static void main(String[] args) 
    {
        Coronel coronel = new Coronel();
        General general = new General();
        Teniente teniente = new Teniente();
        Soldado soldado = new Soldado();
        
        System.out.println("Datos del Coronel: ");
        System.out.println( "Salario: "+ coronel.getSalario());
        System.out.println("Horas: " + coronel.getHoras());
        System.out.println("Dias de vacaciones: "+ coronel.getDiasVacaciones());
        System.out.println("Tipo de Formulario: "+ coronel.getFormularioVacaciones());
        coronel.ejecutaOrdenManiobra();
        
        System.out.println("\nDatos de un general: ");
        System.out.println( "Salario: "+ general.getSalario());
        System.out.println("Horas: " + general.getHoras());
        System.out.println("Dias de vacaciones: "+ general.getDiasVacaciones());
        System.out.println("Tipo de Formulario: "+ general.getFormularioVacaciones());
        general.planificaEstrategia();
        
        System.out.println("\nDatos de un teniente: ");
        System.out.println( "Salario: "+ teniente.getSalario());
        System.out.println("Horas: " + teniente.getHoras());
        System.out.println("Dias de vacaciones: "+ teniente.getDiasVacaciones());
        System.out.println("Tipo de Formulario: "+ teniente.getFormularioVacaciones());
        teniente.tomaOrdenCoronel("Barrios");
       
        System.out.println("\nDatos de un soldado: ");
        System.out.println( "Salario: "+ soldado.getSalario());
        System.out.println("Horas: " + soldado.getHoras());
        System.out.println("Dias de vacaciones: "+ soldado.getDiasVacaciones());
        System.out.println("Tipo de Formulario: "+ soldado.getFormularioVacaciones());
        soldado.recibeOrden();
        
        
        
        
    }
    
}
