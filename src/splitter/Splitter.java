/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splitter;

import java.util.ArrayList;

/**
 *
 * @author Uthanien
 */
public class Splitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] personas = new String[3];
        personas[0] = "Nicolas";
        personas[1] = "Ian";
        personas[2] = "Felipe";
        
        ArrayList<Gastos> gastos = new ArrayList();
        gastos.add(new Gastos(personas[0], 2000));
        gastos.add(new Gastos(personas[1], 0));
        gastos.add(new Gastos(personas[2], 14000));
        
        int cantidadParticipantes = personas.length;
        int sumaGastado = 0;
        int cantidadPorPersona = 0;
        for(Gastos g : gastos){
            sumaGastado = sumaGastado + g.getMonto();
        }
        cantidadPorPersona = sumaGastado/cantidadParticipantes;        
        System.out.println("total gastado: " +sumaGastado);
        System.out.println("Total dividido personas: " +cantidadPorPersona);
        
        for(Gastos g : gastos){
            if(g.getMonto() == 0){
                g.setDebe(cantidadPorPersona);
                g.setMensaje("DEBE");
            }
            if(g.getMonto()>0 && (g.getMonto() < cantidadPorPersona)){
                g.setDebe(cantidadPorPersona - g.getMonto());
                g.setMensaje("DEBE");
            }
            if(g.getMonto() > cantidadPorPersona){
                g.setMensaje("LE DEBEN");
                g.setDebe(g.getMonto() - cantidadPorPersona);
            }                
        }
        for(Gastos g: gastos){
            System.out.println(g.getNombre()+  " Debe: [" + g.getDebe() + "] - Aporto: [" + g.getMonto() + "]" );
        }
        

    }
    
}
