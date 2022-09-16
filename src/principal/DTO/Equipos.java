
package principal.DTO;

import java.util.Date;

public class Equipos {
       private String Codigo;
    private String Lema;
    private int ValorSubscripcion;
    private String Colores;
    private String NombreFundador;
    private String NombreClub;
    private String PaisOrigen;
    private Date FechaFundacion;
    public Equipos(){
        this.Codigo = "";
        this.Lema = "";
        this.ValorSubscripcion = 0;
        this.Colores = "";
        this.NombreFundador = "";
        this.FechaFundacion =new Date();
        this.PaisOrigen = "";
        this.NombreClub = "";
    }
    
    public Equipos(String Codigo, String Lema,
            int ValorSubscripcion, String Colores, String NombreFundador, Date FechaFundacion, String PaisOrigen, String NombreClub) {
        this.Codigo = Codigo;
        this.Lema = Lema;
        this.ValorSubscripcion = ValorSubscripcion;
        this.Colores = Colores;
        this.NombreFundador = NombreFundador;
        this.FechaFundacion = FechaFundacion;
        this.PaisOrigen = PaisOrigen;
        this.NombreClub = NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public void setFechaFundacion(Date FechaFundacion) {
        this.FechaFundacion = FechaFundacion;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public Date getFechaFundacion() {
        return FechaFundacion;
    }
    public String getCodigo() {
        return Codigo;
    }

    public String getLema() {
        return Lema;
    }

    public int getValorSubscripcion() {
        return ValorSubscripcion;
    }

    public String getColores() {
        return Colores;
    }

    public void setCodigo(String Codigo) {
        StringBuilder sb = new StringBuilder();
        sb.append(Codigo);
        
        if(sb.length() >= 5){
            this.Codigo = Codigo;
        }
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public void setValorSubscripcion(int ValorSubscripcion) {
        this.ValorSubscripcion = ValorSubscripcion;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }
 
}
