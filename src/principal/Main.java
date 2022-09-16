package principal;
import principal.DTO.Usuarios;
import principal.DTO.Equipos;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creando Usuario");
        Usuarios c = new Usuarios();
        c.setId(5678);
        c.setNombreCompleto("Angel Morales");
        c.setTelefono(77234574);
        c.setRun(21654899, '0');
        c.setNombreUsuario("cjou");
        c.setMail("Angelon@gmail.com");
        c.setContraseña("");
        
        System.out.println("Su Id es: "+c.getId());
        System.out.println("su nombre es: "+c.getNombreCompleto());
        System.out.println("su telefono es: "+ c.getTelefono());
        System.out.println("su rut es: "+c.getRun());
        System.out.println("Su nombre de usuario es: "+c.getNombreUsuario());
        System.out.println("Su Mail es: "+c.getMail());
        
        System.out.println("Inscripcion de equipos");
        Equipos p = new Equipos();
        p.setNombreClub("Arsenal de Coquimbo");
        p.setNombreFundador("Alonso");
        p.setPaisOrigen("Chile");
        p.setLema("Hoy por ti mañana por mi :D");
        p.setColores("Amarillo, Rojo");
        p.setValorSubscripcion(10500);
    
        
        
       
    }
}