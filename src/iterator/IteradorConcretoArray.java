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
public class IteradorConcretoArray implements IIterador{
    
    public ArrayConcreto lista;
    private int posicion_actual = 0;
    
    public IteradorConcretoArray(ArrayConcreto lista){
        this.lista = lista;
    }

    @Override
    public Object primero() {
         Object obj = null;
        if (this.lista.listaEmpleados.length != 0) {
            this.posicion_actual = 0;
            obj = this.lista.listaEmpleados[this.posicion_actual];
        }
        return obj;
    }

    @Override
    public Object siguiente() {
        Object obj = null;
        if ((this.posicion_actual) < this.lista.listaEmpleados.length) {
            obj = this.lista.listaEmpleados[this.posicion_actual];
            this.posicion_actual = this.posicion_actual + 1;
        }
        return obj;
    }

    @Override
    public boolean hayMas() {
        boolean ok = false;
        if (this.posicion_actual < (this.lista.listaEmpleados.length)) {
            ok = true;
        }
        return ok;
    }

    @Override
    public Object actual() {
         Object obj = null;
        if (this.posicion_actual < this.lista.listaEmpleados.length) {
            obj = this.lista.listaEmpleados[this.posicion_actual];
        }
        return obj;
    }
    
}
