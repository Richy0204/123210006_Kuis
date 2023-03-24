/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_006;

/**
 *
 * @author Lab Informatika
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HomePage extends JFrame implements ActionListener {
    // INSTANSIASI OBJEK KOMPONEN GUI
    JLabel lJudul = new JLabel("Aplikasi Seleksi Calon Pegawai");
    JLabel lUniv = new JLabel("PT. Jaya Abadi");
    JLabel lUniv2 = new JLabel("Pilih Posisi");
    JButton btnProgrammer = new JButton("Programmer");
    JButton btnDesigner = new JButton("Designer");

    public HomePage() {
        setTitle("Aplikasi Seleksi Calon Pegawai");
        setLayout(null);
        setSize(800, 800);
        add(lJudul);
        add(lUniv);
        add(lUniv2);
        add(btnProgrammer);
        add(btnDesigner);

        lJudul.setBounds(128, 30, 600, 50);
        lJudul.setFont(new Font("Times New Roman", Font.BOLD, 24));
        lUniv.setBounds(225, 60, 600, 50);
        lUniv2.setBounds(223, 110, 200, 50);
        lUniv2.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        lUniv.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        btnProgrammer.setBounds(200, 160, 150, 50);
        btnDesigner.setBounds(200, 220, 150, 50);
        btnProgrammer.addActionListener(this);
        btnDesigner.addActionListener(this);
        this.setSize(600, 400);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnProgrammer) {
            Programmer program = new Programmer();
        }
        if (e.getSource() == btnDesigner) {
           Designer desig = new Designer();
        }
    }}
 
