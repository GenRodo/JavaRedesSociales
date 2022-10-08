package cl.duocuc.redsocial.Modelo;

public class Instagram {
    
    private int Id;
    private String Historia;
    private boolean Estado;

    public Instagram(){

        this.Id = 0;
        this.Historia = "";
        this.Estado = false;
        
    }
    
    public Instagram(int Id, String Historia, boolean Estado) {
        this.Id = Id;
        this.Historia = Historia;
        this.Estado = Estado;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getHistoria() {
        return Historia;
    }

    public void setHistoria(String Historia) {
        this.Historia = Historia;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
}
