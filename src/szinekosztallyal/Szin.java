/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package szinekosztallyal;

/**
 *
 * @author T
 */
public class Szin {
    private final String nev;
    private final String hexaKod;

    public Szin(String nev, String hexaKod) {
        this.nev = nev;
        this.hexaKod = hexaKod;
    }

    public String getNev() {
        return nev;
    }

    public String getHexaKod() {
        return hexaKod;
    }

    @Override
    public String toString() {
        return "Szin{" + "nev=" + nev + ", hexaKod=" + hexaKod + '}';
    }
    
    
}
