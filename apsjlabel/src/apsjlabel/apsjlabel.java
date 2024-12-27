/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apsjlabel;
import javax.swing.*;
import java.awt.event.*;
public class apsjlabel extends JFrame{
    public static void main(String[] args) {
        apsjlabel aplikasi = new apsjlabel();
    }
    public apsjlabel(){
        super("Aplikasi JLabel");
        setSize(300,150);
        addWindowListener(new apsjlabel.keluar());
        Icon svt= new ImageIcon("972f3bef-b1fc-41e6-832e-ce98bec3f250.jpeg");
        JLabel t1 = new JLabel("My Support system :");
        JLabel t2 = new JLabel("The Best...",svt,SwingConstants.CENTER);
        
        JPanel p1 = new JPanel();
        p1.add(t1);
        p1.add(t2);
        getContentPane().add("South",p1);
        show();
    }
    class keluar extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
}
