/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testframe;
import java.awt.*;
public class testtombol extends Frame{
    public static void main(String[] args) {
        testtombol tombol1 = new testtombol();
    }
    
    public testtombol(){
        super("Tombol Saya");
        setSize(300,200);
        Panel paneltombol = new Panel();
        paneltombol.add(new Button("Perbesar"));
        paneltombol.add(new Button("Keluar"));
        add("South",paneltombol);
        show();
    }
}