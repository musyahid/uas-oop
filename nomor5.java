/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.plantmainswing;

*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;
// import bumbu-bumbu yang diperlukan
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

// bisa juga diimpor sekaligus seperti ini:
// import java.sql.*


public class PlantMainSwing{
private JFrame frame;
private JLabel label;
private JButton btnLihatJadwal;
private JButton btnLihatNilai;
private JButton btnLihatMataKuliah;
private JTextField txtDisplay;
private ImageIcon plantIcon;
private Plant p;


public PlantMainSwing()
{
    p = new Plant();
    createAndShowGUI();
}
private void createAndShowGUI()
{
    frame = new JFrame("UAS OOP M. MUSYAHID ABROR");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());
    //Add label
    label = new JLabel("");
    frame.getContentPane().add(label);
    //Add button
    btnLihatJadwal = new JButton("Lihat Jadwal");
    btnLihatNilai = new JButton("Lihat Nilai");
    btnLihatMataKuliah = new JButton("Lihat Mata Kuliah");
    frame.getContentPane().add(btnLihatJadwal);
    frame.getContentPane().add(btnLihatNilai);
    frame.getContentPane().add(btnLihatMataKuliah);
    //Add text
//    txtDisplay = new JTextField("hasilnya");
//    frame.getContentPane().add(txtDisplay);
    //Add action listener
    btnLihatJadwal.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
        {
            btnLihatJadwal_actionPerformed(e);
        }
    });
    btnLihatNilai.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
        {
            btnLihatNilai_actionPerformed(e);
        }
    });
    btnLihatMataKuliah.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
            btnLihatMataKuliah_actionPerformed(e);
        }
        });
    //Display the window
    frame.setSize(500,300);
    frame.setVisible(true);
}
private void btnLihatJadwal_actionPerformed(ActionEvent e){
    System.out.println("Daftar Jadwal");
}
private void btnLihatNilai_actionPerformed(ActionEvent e){
    System.out.println("Daftar Nilai");
}
private void btnLihatMataKuliah_actionPerformed(ActionEvent e){
    System.out.println("Daftar Mata Kuliah");
}
protected ImageIcon createImageIcon(String path, String description) {
    java.net.URL imgURL = getClass().getResource(path);
        System.err.println(imgURL);
    if (imgURL != null) {
        return new ImageIcon(imgURL, description);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
}

public static void main(String[] args)
{ 
        javax.swing.SwingUtilities.invokeLater(new
        Runnable(){
        public void run(){
            PlantMainSwing uGardenApp = new
            PlantMainSwing();
            }
        });
    }
}