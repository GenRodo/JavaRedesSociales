package cl.duocuc.redsocial.Listas;

import cl.duocuc.redsocial.Modelo.Instagram;
import java.util.ArrayList;

public class listaInstagram {
    
    private ArrayList<Instagram> lista;
    
    public listaInstagram(){
    
        lista = new ArrayList();
    }
    
    public listaInstagram(ArrayList<Instagram>lista){
    
        this.lista = lista;
        
    }
    
    public ArrayList<Instagram>getLista(){
    
        return lista;
    
    }
    
    public void setLista(ArrayList<Instagram>lista){
    
        this.lista = lista;
    
    }
    
    public void AgregarInstagram(Instagram ig){
    
        this.lista.add(ig);
    
    }
    
    public void EliminarInstagram(Instagram ig){
    
        this.lista.remove(ig);
    
    }
    
    public void ObtenerInstagram(int indice){
    
        this.lista.get(indice);
    
    }
    
    public void Reemplazar(int indice, Instagram ig){
    
        this.lista.set(indice, ig);
    
    }
    
}
