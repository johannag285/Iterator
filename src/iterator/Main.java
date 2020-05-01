/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author David
 */
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            // Crear el objeto agregado que contiene la lista (un vector en este ejemplo)
            EmpleadoConcreto empleado = new EmpleadoConcreto();
            ArrayListConcreto arrayListConcreto = new ArrayListConcreto();
            ArrayConcreto arrayConcreto = new ArrayConcreto();
            // Crear el objeto iterador para recorrer la lista
            IIterador iterador = empleado.getIterador();
            IIterador iterador2 = arrayListConcreto.getIterador();
            IIterador iterador3 = arrayConcreto.getIterador();
  
            String obj = (String) iterador3.primero();
            System.out.println( obj );
     
            iterador3.siguiente();
            iterador3.siguiente();
        
            System.out.println( (String) iterador3.actual() + "\n" );
         
            iterador3.primero();
         
            while(iterador3.hayMas()) {
                System.out.println( iterador3.siguiente() );
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}