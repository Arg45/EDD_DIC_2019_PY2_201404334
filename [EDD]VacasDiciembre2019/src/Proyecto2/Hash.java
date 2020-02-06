package Proyecto2;

import Proyecto2.Usuario;

public class Hash {
    Usuario tabla[];
    int t;

    public Hash() {
        t=37;
        tabla = new Usuario[t];
    }
    //dispersion "normal"
    public int getDisp(int c){
        return c%t;
    }
    //dispersion de colision
    public int getDisCol(String c, int i){    
        int disp=(Integer.parseInt(c)%t+1)*i;
        while (disp>=t) {
            disp=disp-t;            
        }
        return disp;
    }
    public void insertar(String nombre, String apellido, String carne, String password, int i, int disp){
        if(tabla[disp]==null){
            
        }
    }
    
    public Usuario buscar( String carne, int i, int disp){
        if(tabla[disp].carnet.equals(carne)){
            return tabla[disp];
        }else{
            disp=getDisCol(carne, i);
            return buscar(carne,++i, disp);
        }    
    }
    public void verificarUtil(){
        int c=0;
        int i;
        for(i=0;i<tabla.length;i++){
            c++;
        }
        if((c/t)*100>=55){
            Usuario Taux[]=tabla;
            t = getNextPrimo(t);
            tabla = new Usuario[t];
            for(i=0;i<tabla.length;i++){
                int disp=getDisp(Integer.parseInt(Taux[i].carnet));
                insertar(Taux[i].nombre,Taux[i].apellido,Taux[i].carnet,Taux[i].pass,0,disp);
            }
        }
    }

    private int getNextPrimo(int t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}