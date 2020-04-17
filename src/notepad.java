/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author abc
 */
public class notepad {
    public static void main(String args[]){ 
    editor obj=new editor();
    obj.setBounds(0,0,700,700);
    obj.setTitle("notepad");
     Image icon=Toolkit.getDefaultToolkit().getImage("D:\\PRAVEEN sub wize LECTURE AND STUDY MATERIAL\\photossssssss\\B612-2015-10-20-18-39-50.jpg");
       obj.setIconImage(icon);
    obj.setVisible(true);
    obj.setResizable(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    
    }
    
}
