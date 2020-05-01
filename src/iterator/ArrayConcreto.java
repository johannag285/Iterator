/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Johanna
 */
public class ArrayConcreto implements IEmpleado{
    
 
    public String[] listaEmpleados = new String[11]; 
    
    
    
    public ArrayConcreto(){
        this.agregar();
    }
    
    @Override
    public IIterador getIterador() {
        return new IteradorConcretoArray(this);
    }
    
    public void agregar(){
        this.listaEmpleados[0] = "Diego";
        this.listaEmpleados[1] = "Carlos";
        this.listaEmpleados[2] = "David";
        this.listaEmpleados[3] = "Sebastian";
        this.listaEmpleados[4] = "Jaime";
        this.listaEmpleados[5] = "Juan";
        this.listaEmpleados[6] = "Paola";
        this.listaEmpleados[7] = "Luisa";
        this.listaEmpleados[8] = "Xiomy";
        this.listaEmpleados[9] = "Lucia";
        this.listaEmpleados[10] = "Alexandra";
    }
    
}
