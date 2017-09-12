/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.blanco.p01;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author eazuara
 */
class Sala <S extends Pelicula>{
    int num;
    ArrayList<Pelicula>P = new ArrayList<Pelicula>();

    public Sala(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    
    String Sort(){
        Collections.sort(P);
        return P.get(0).getNombre();
    }
    
    void addFuncion(String nombre){
        if(P.contains(nombre)){
            System.out.println("La Pelicula"+nombre+"ya esta en una sala");
        }else P.add(new Pelicula(nombre));
    
}
 
    int Fetch(String nombre ){
        for(int i=0;i<P.size();i++){
            if(P.get(i).getNombre()==nombre){
                return i;
            }
        }
        return -1;
    }
    String mostViewed(){
       Collections.sort(P);
       return P.get(0).getNombre();
    }
    
    int getVisitas(){
        return P.get(0).getVisitas();
    }
    
    

    
}
