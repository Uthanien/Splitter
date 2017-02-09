/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splitter;

/**
 *
 * @author Uthanien
 */
class Gastos {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Gastos(String nombre, int monto) {
        this.nombre = nombre;
        this.monto = monto;
    }
    private String nombre;
    private int monto;
    private int debe;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    private String mensaje;

    public int getDebe() {
        return debe;
    }

    public void setDebe(int debe) {
        this.debe = debe;
    }
    
    
}
