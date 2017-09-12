/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.blanco.p01;

/**
 *
 * @author eazuara
 */
public class Pelicula <S> implements Comparable<Pelicula<S>> {
    String nombre;
    int visitas;
    

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", visitas=" + visitas + '}';
    }

    
    
    

    @Override
    public int compareTo(Pelicula<S> o) {
     if(this.getVisitas()<o.getVisitas()){ 
            return 1;                           
        }
        if(this.getVisitas()>o.getVisitas()){
            return -1;
        }
        return 0; 
    }
}

  

