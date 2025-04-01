/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.entidades;

/**
 *
 * @author alumnog
 */
public class Computadora extends DispositivoElectronico{
    private int memoriaRAM;
    private int memoriaDisco;
    
    public Computadora( String marca, String modelo, String DirecionIP, int memoriaRAM, int memoriaDisco){
        super(marca, modelo, DirecionIP);
        this.memoriaDisco = memoriaDisco;
        this.memoriaRAM = memoriaRAM;
    }
    
    public double actualizarMemoriaDisco(double cantidad){
        this.memoriaDisco += cantidad;
        return this.memoriaDisco;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getMemoriaDisco() {
        return memoriaDisco;
    }

    public void setMemoriaDisco(int memoriaDisco) {
        this.memoriaDisco = memoriaDisco;
    }
}
