/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luiscastrojosuerivera;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author lfern
 */
public class Admin extends User{
    ArrayList<Torneo> creados = new ArrayList();
   
    public Admin(String nombre, String contra) {
        super(nombre, contra);
    }
    
    public ArrayList<Torneo> getCreados() {
        return creados;
    }

    public void setCreados(ArrayList<Torneo> creados) {
        this.creados = creados;
    }
    
}
