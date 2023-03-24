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

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.*;
import java.awt.color.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Designer extends JFrame {
    // INSTANSIASI OBJEK KOMPONEN GUI

    JLabel lJudul = new JLabel("HasilPenilaian");
    JLabel lBiodata = new JLabel("Nama");
    JLabel lPenilaian = new JLabel("Result Penilaian (0-100)");
    JPanel PanelBiodata = new JPanel();
    JPanel PanelPenilaian = new JPanel();
    Border border = new LineBorder(Color.GRAY, 1, true);

    JLabel lNama = new JLabel("Nama");
    JLabel lJurusan = new JLabel("Asal Kampus");
    JLabel lNim = new JLabel("IPK");
    JLabel rNama = new JLabel("Contoh");
    JLabel rJurusan = new JLabel("Sistem Informasi");
    JLabel rNim = new JLabel("123");

    JButton btnKembali = new JButton("Batal");

    public Designer() {
        setTitle("Hasil Penilaian");
        setLayout(null);
        setSize(1200, 1000);

        PanelBiodata.setBorder(border);
        PanelPenilaian.setBorder(border);
        PanelBiodata.add(lNama);
     
        add(btnKembali);
        add(lJudul);
        add(lBiodata);
        add(PanelBiodata);
        add(lPenilaian);
        add(PanelPenilaian);

        lJudul.setBounds(250, 10, 200, 50);
        lJudul.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lBiodata.setBounds(50, 60, 200, 50);
        lBiodata.setFont(new Font("Arial", Font.PLAIN, 16));
        PanelBiodata.setBounds(50, 110, 530, 160);
        PanelBiodata.setLayout(null);

        lNama.setBounds(15, 8, 50, 50);
        lNama.setFont(new Font("Arial", Font.BOLD, 14));
        rNama.setBounds(100, 18, 380, 25);

        lJurusan.setBounds(15, 50, 100, 50);
        lJurusan.setFont(new Font("Arial", Font.BOLD, 14));
        rJurusan.setBounds(100, 63, 380, 25);

        lNim.setBounds(15, 95, 100, 50);
        lNim.setFont(new Font("Arial", Font.BOLD, 14));
        rNim.setBounds(100, 108, 380, 25);

        lPenilaian.setBounds(50, 300, 200, 50);
        lPenilaian.setFont(new Font("Arial", Font.PLAIN, 16));

        PanelPenilaian.setBounds(50, 350, 530, 100);
        PanelPenilaian.setLayout(null);

        lNilaiAkhir.setBounds(15, 8, 150, 50);
        lNilaiAkhir.setFont(new Font("Arial", Font.BOLD, 14));
        lNilai.setBounds(120, 18, 380, 25);
        lNilai.setFont(new Font("Arial", Font.BOLD, 14));

        lKeterangan.setBounds(15, 40, 150, 50);
        lKeterangan.setFont(new Font("Arial", Font.BOLD, 14));
        lKet.setBounds(120, 53, 380, 25);
        lKet.setFont(new Font("Arial", Font.BOLD, 14));

        btnKembali.setBounds(230, 600, 100, 30);
        this.setSize(650, 700);
        this.setVisible(true);
    }

    Designer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
