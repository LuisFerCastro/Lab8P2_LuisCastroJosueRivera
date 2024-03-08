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
public class Torneo implements Serializable{
    private String nombreTorneo;
    ArrayList<Participante> participantes = new ArrayList();
    boolean cerrado;
    Participante ganador;
    private static final long SerialVersionUID = 777;
    public Torneo(String nombreTorneo, boolean cerrado) {
        this.nombreTorneo = nombreTorneo;
        this.cerrado = cerrado;
    }

    public Torneo(String nombreTorneo, boolean cerrado, Participante ganador) {
        this.nombreTorneo = nombreTorneo;
        this.cerrado = cerrado;
        this.ganador = ganador;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }

    public User getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }

    @Override
    public String toString() {
        return nombreTorneo;
    }
    
}
