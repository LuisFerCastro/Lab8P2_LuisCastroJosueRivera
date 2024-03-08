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
public class Participante extends User{
    ArrayList<Torneo> participando = new ArrayList();
    ArrayList<Torneo> ganados = new ArrayList();
    
    public Participante(String nombre, String contra) {
        super(nombre, contra);
    }

    public ArrayList<Torneo> getParticipando() {
        return participando;
    }

    public void setParticipando(ArrayList<Torneo> participando) {
        this.participando = participando;
    }

    public ArrayList<Torneo> getGanados() {
        return ganados;
    }

    public void setGanados(ArrayList<Torneo> ganados) {
        this.ganados = ganados;
    }

}
