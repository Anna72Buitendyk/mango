/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.entidades;

/**
 *
 * @author alumnog
 */
public class DispositivoElectronico {
    
    private String marca;
    private String modelo;
    private String direcionIP;
    
    public DispositivoElectronico(String marca, String modelo, String direcionIP){
        this.marca = marca;
        this.modelo = modelo;
        this.direcionIP = direcionIP;
     }
    
    public String encender(){
        return "El dispositivo electronico esta encendido";
    }
    
    public abstract double calcularDepreciacion(double precio);

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDirecionIP() {
        return direcionIP;
    }

    public void setDirecionIP(String direcionIP) {
        this.direcionIP = direcionIP;
    }
    
}
