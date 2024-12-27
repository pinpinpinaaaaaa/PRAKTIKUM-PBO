/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testtombol;
import java.awt.*;
public class Testtombol extends Frame{
    public static void main(String[] args) {
        Testtombol tombol1 = new Testtombol();
    }
    
    public Testtombol(){
        super("Tombol Saya");
        setSize(300,200);
        Panel paneltombol = new Panel();
        paneltombol.add(new Button("Perbesar"));
        paneltombol.add(new Button("Keluar"));
        add("South",paneltombol);
        show();
    }
}
