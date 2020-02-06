
package Proyecto2;

public class Usuario {
    String nombre;
    String apellido;
    String carnet;
     // 0 - admin
     // 1 - resto
    String pass;
    String passE;
    int tipo;
    Interfaz i = new Interfaz();
    public Usuario(){
        nombre = "";
        apellido = "";
        carnet = "";
        pass = "";
        passE = "";
        tipo = 0;
    }
    public Usuario(String nombre, String apellido, String carnet, String pass, int tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.pass = pass;
        this.passE = i.convertirSHA256(pass);
        this.tipo = tipo;
    }
}
    