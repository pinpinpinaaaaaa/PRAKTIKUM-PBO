/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1;
import java.awt.*;
import javax.swing.JLabel;
public class Latihan1 extends Frame{
    public static void main(String[] args) {
        Latihan1 tombol1 = new Latihan1();
    }
    public Latihan1(){
        super("Tombol Saya");
        setSize(300,200);
        Panel paneltombol = new Panel();
        JLabel t1 = new JLabel("My Support system :");
        JLabel t2 = new JLabel("My Support system :");
        paneltombol.add(new Button("Proses"));
        paneltombol.add(new Button("Kosongkan"));
        add("South",paneltombol);
        show();
    }
}
