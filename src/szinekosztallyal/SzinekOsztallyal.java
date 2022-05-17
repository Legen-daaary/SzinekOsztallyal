/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package szinekosztallyal;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T
 */
public class SzinekOsztallyal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Szin> szinek = feltolt("kodok.txt");
        System.out.println("Tárolt színek mennyiége: " + szinek.size());
    }
    
    
    private static List<Szin> feltolt(String fajlNeve) {
        List<Szin> result = new ArrayList<>();
        List<String> sorok = null;
        try {
            sorok = Files.readAllLines(Paths.get(fajlNeve), Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.out.println("Hiba: " + e.getMessage());
        }
        
        sorok.remove(sorok.size() - 1);
        
        for (String sor : sorok) {
            String[] darabok = sor.split("\t");
            result.add(new Szin(darabok[1], darabok[0]));
        }
        
        return result;
    }
}
