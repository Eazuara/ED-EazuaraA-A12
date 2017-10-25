/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.eazuaraa.arbolesbinarios;

/**
 *
 * @author eazuara
 */
public class Arbol {
     private Leaf root;
    private int leaves;

    Arbol(){
        root= null;
        leaves=0;
    }
    
    Arbol(int d){
        Leaf leaf = new Leaf(d);
        root = leaf;
        leaves=1;
    }
    
    public void insert(int d, Leaf root){
        if(!isEmpty()){
            if(d < root.getData()){
                if(root.left==null){
                    root.left = new Leaf(d);
                    leaves++;
                } else {
                    insert(d,root.left);
                }
            } else {
                if(root.right==null){
                    root.right = new Leaf(d);
                    leaves++;
                } else {
                    insert(d,root.right);
                }
            }
        } else {
            root = new Leaf(d);
            leaves=1;
        }
    }

    public void deleteLeaf(int d){
       
    }

    public boolean isEmpty(){
        return leaves==0;
    }

    public Leaf getRoot(){
        return root;
    }

    public int Height(Leaf root){
        if(!isEmpty()){
            int a,b;
            if(root.left==null && root.right==null){
                return 1;
            } else {
                a=Height(root.left);
                b=Height(root.right);
                if (a>b){
                    return a+1;
                } else return b+1;
            }
        } else {
            return 0;
        }
    }

    public int getLeaves(){
        return leaves;
    }
}

