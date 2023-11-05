/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dominio.MecanismoSorteo;
import dominio.TipoApuesta;
import java.util.ArrayList;

/**
 *
 * @author Angela
 */
public class SistemaMecanismo {
    private ArrayList<MecanismoSorteo> efectos;


    public SistemaMecanismo() {
        efectos = new ArrayList();
    }
    
    public void agregar(MecanismoSorteo efecto) {
        efectos.add(efecto);
    }

    public ArrayList<MecanismoSorteo> getEfectos() {
        return efectos;
    }
}
