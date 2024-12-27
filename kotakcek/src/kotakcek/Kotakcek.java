/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kotakcek;
import java.awt.*;
import java.awt.event.*;
public class Kotakcek extends Frame{
    Checkbox cb1, cb2, cb3;
    TextArea tarea;
    public static void main(String[] args) {
       Kotakcek aplikasi = new Kotakcek();
    }
    public Kotakcek(){
        super("Aplikasi Checkbox");
        setSize(400,120);
        cb1 = new Checkbox("Spotify");
        cb2 = new Checkbox("Figma");
        cb3 = new Checkbox("Steam");
        tarea = new TextArea("",3,35,TextArea.SCROLLBARS_NONE);
        tarea.setEditable(false);
        
        Panel p1 = new Panel();
        p1.setLayout (new GridLayout(3,1));
        p1.add(cb1);
        p1.add(cb2);
        p1.add(cb3);
        
        Panel p2 = new Panel();
        p2.add(tarea);
        
        add("West",p1);
        add("East",p2);
        
        cb1.addItemListener(new Kotakcek.penanganitem());
        cb2.addItemListener(new Kotakcek.penanganitem());
        cb3.addItemListener(new Kotakcek.penanganitem());
        show();
    }
    public void cetak(){
        String scb1, scb2, scb3;
        scb1 = "Pilihan Spotify :"+cb1.getState();
        scb2 = "Pilihan Figma :"+cb2.getState();
        scb3 = "Pilihan Steam :"+cb3.getState();
        tarea.setText(scb1+"\n"+scb2+"\n"+scb3);
    }
    class penanganitem implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            Object o = e.getItem();
            if(o.equals("Spotify"))
                cetak();
            else if(o.equals("Figma"))
                cetak();
                else if(o.equals("Steam"))
                    cetak();
        }
    }
}
