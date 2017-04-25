/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Lider extends Programador {
    private ArrayList<Programador>programadores;

    public Lider(ArrayList<Programador> programadores, String lenguaje, String nombre, double salario, int id) {
        super(lenguaje,nombre,salario,id);
        this.programadores = programadores;
    }
    
    public void agregarProgramador (Programador p){
        this.programadores.add(p);
    }
    
    @Override
    public double calcularSalario(){
        double salarioT=0;
        salarioT+=super.calcularSalario()*this.programadores.size()*0.1;
        return salarioT;
    }
    
    @Override
    public String listarInformacion(){
        String informacion = super.listarInformacion();
        for(Programador programador : programadores){
            informacion+= programador .listarInformacion();
        }
        return informacion;
    }
    
    

    

    
    
    
    
    

    

    
    
    
}
