/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;

/**
 *
 * @author Johanna
 */
public class ArrayListConcreto implements IEmpleado{

    
    public ArrayList<String> listaEmpleados = new ArrayList<String>();
    
    
    public ArrayListConcreto(){
        this.agregar();
    }
    
    @Override
    public IIterador getIterador() {
        return new IteradorConcretoArrayList(this);
    }
    
    
    public void agregar(){
        this.listaEmpleados.add("Johanna");
        this.listaEmpleados.add("Maria");
        this.listaEmpleados.add("Andres");
    }
    
}
