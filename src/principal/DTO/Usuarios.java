
package principal.DTO;

import java.util.Date;
import java.util.Scanner;

public class Usuarios {
    private int Id;
    private String NombreCompleto;
    private int Run;
    private String Dv;
    private Date Fechanac;
    private int Telefono;
    private String NombreUsuario;
    private String Mail;
    private String Contraseña;
    
    public Usuarios(){
        this.Id = 0;
        this.NombreCompleto = "";
        this.Run = 0;
        this.Dv = "";
        this.Fechanac = new Date();
        this.NombreUsuario = "";
        this.Telefono = 0;
        this.Mail = "";
        this.Contraseña = "";

    }

    public void setRun(int Run) {
        this.Run = Run;
    }
    
    public Usuarios(int Id, String NombreUsuario, String Mail, String Contraseña, 
            String NombreCompleto, int Run, Date Fecha, String Dv, int Telefono) {
        this.Id = Id;
        this.NombreUsuario = NombreUsuario;
        this.Mail = Mail;
        this.Contraseña = Contraseña;
        this.NombreCompleto = NombreCompleto;
        this.Run = Run;
        this.Dv = Dv;
        this.Fechanac = Fecha;
        this.NombreUsuario = NombreUsuario;
        this.Telefono = Telefono;
    
}

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public void setRun(int Run, char Dv) {
        if(this.validar(Run, Dv)){
            this.Run = Run;
            this.Dv = Dv+"";
    }
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public void setFechanac(Date Fechanac) {
        this.Fechanac = Fechanac;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public int getRun() {
        return Run;
    }

    public String getDv() {
        return Dv;
    }

    public Date getFechanac() {
        return Fechanac;
    }

    public int getTelefono() {
        return Telefono;
    }

    public int getId() {
        return Id;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public String getMail() {
        return Mail;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setId(int IdEntrada){
        if(IdEntrada < 9999){
            this.Id = IdEntrada;
        }
    }

    public void setNombreUsuario(String NombreUsuario) {
        StringBuilder sb = new StringBuilder();
        sb.append(NombreUsuario);
        
        if(sb.length() > 4){
            this.NombreUsuario = NombreUsuario;
        }
    }

    public void setMail(String Mail) {
        if(Mail.length() > 5 && Mail.contains("@")){
            this.Mail = Mail;
        }
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;

             final int MAX=6;
                          
             final int Mayusculas=1;
             final int MinimoMayusculas=1;
             final int DigitosContra=6;
             int ContadorMayus=0;
             int ContadorMinus=0;
             int ContadorDigitos=1;

 System.out.println("ingrese La Contraseña");
            
 Scanner input = new Scanner(System.in);

 String Contra = input.nextLine();
             
             for (int i=0; i < Contra.length(); i++ ) {
                    char a = Contra.charAt(i);
                    if(Character.isUpperCase(a)) 
                          ContadorMayus++;
                    else if(Character.isLowerCase(a)) 
                          ContadorMinus++;
                    else if(Character.isDigit(a)) 
                          ContadorDigitos++;     
             }
             
             if (Contra.length() >= MAX && ContadorMayus >= Mayusculas 
&& ContadorMinus >= MinimoMayusculas && ContadorDigitos <= DigitosContra) { 
                    System.out.println("La contraseña es Valida");
             }
             else {
   System.out.println("Su contraseña no contiene lo siguiente:");
                    if(Contra.length() < MAX)
                          System.out.println(" Al menos 6 caracteres");
                    if (ContadorMinus < MinimoMayusculas) 
                          System.out.println("Letras minusculas minimas");
                    if (ContadorMayus < Mayusculas) 
                          System.out.println("Letras mayusculas minimas");
                    if(ContadorDigitos > DigitosContra) 
System.out.println("La contraseña no tiene los requerimientos necesarios:");
                    
             }
             
        
	

    
    }
    
            public boolean validar(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 2;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}



    

