package cl.duocuc.redsocial.Listas;

import cl.duocuc.redsocial.Modelo.Twitter;
import java.util.ArrayList;

public class listaTwitter {
    
    private ArrayList<Twitter> lista;
    
    public listaTwitter(){
    
        lista = new ArrayList();
    }
    
    public listaTwitter(ArrayList<Twitter>lista){
    
        this.lista = lista;
        
    }
    
    public ArrayList<Twitter>getLista(){
    
        return lista;
    
    }
    
    public void setLista(ArrayList<Twitter>lista){
    
        this.lista = lista;
    
    }
    
    public void AgregarTwitter(Twitter tw){
    
        this.lista.add(tw);
    
    }
    
    public void EliminarTwitter(Twitter tw){
    
        this.lista.remove(tw);
    
    }
    
    public void ObtenerTwitter(int indice){
    
        this.lista.get(indice);
    
    }
    
    public void Reemplazar(int indice, Twitter tw){
    
        this.lista.set(indice, tw);
    
    }
}
