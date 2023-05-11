/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Jonathan
 */
public class Proveedor extends Externo{
    
    private int idProveedor;
    private String primerNombre;

    
     public Proveedor(){

    }
     public Proveedor(int idProveedor, String primerNombre){
        this.idProveedor = idProveedor;
        this.primerNombre = primerNombre;
    }


    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    @Override
    public String getPrimerNombre() {
        return primerNombre;
    }

    @Override
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

}
