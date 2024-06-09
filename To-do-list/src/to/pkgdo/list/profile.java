/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to.pkgdo.list;

/**
 *
 * @author USUARIO
 */
public class profile {
    private String Nombre;
    private String Contra;
    public profile(String Nombre,String Contra){
        this.Contra=Contra;
        this.Nombre=Nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getContra(){
        return Contra;
    }
}
