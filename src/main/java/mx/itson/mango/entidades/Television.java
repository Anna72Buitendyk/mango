/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.entidades;

/**
 *
 * @author alumnog
 */
public class Television extends DispositivoElectronico {
    
    private int pulgadas;
    private int volumenActual;
    
    public Television(String marca, String modelo, String direcionIP, int pulgadas, int volumenActual){
        super( marca, modelo, direcionIP);
        this.pulgadas = pulgadas;
        this.volumenActual = volumenActual;
    }
    
    public String cambiarVolumen( int cantidad ){
        if ( (this.volumenActual + cantidad) > 100 || (this.volumenActual + cantidad) <0 ){
            this.volumenActual += cantidad;
            return "El volumen nuevo es " + this.volumenActual;
        }
        else {
            return "Volumen fuera del rango";
        }
    }
    
    @Override
    public String encender(){
        return "La television esta cargando....";
    }
    
    @Override
    public double calcularDepreciacion(double precio){
        return precio * 0.05;
    }
}
