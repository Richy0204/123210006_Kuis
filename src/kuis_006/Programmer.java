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
import javax.naming.InterruptedNamingException;
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

public class Programmer extends JFrame {
    // INSTANSIASI OBJEK KOMPONEN GUI

    JLabel lJudul = new JLabel("Seleksi Programmer");
    JLabel lBiodata = new JLabel("Biodata Calon Pegawai");
    JLabel lPenilaian = new JLabel("Form Penilaian (0-100)");
    JPanel PanelBiodata = new JPanel();
    JPanel PanelPenilaian = new JPanel();
    Border border = new LineBorder(Color.GRAY, 1, true);

    JLabel lNama = new JLabel("Nama");
    JLabel lJurusan = new JLabel("Asal Kampus");
    JLabel lNim = new JLabel("IPK");
    JTextField fNama = new JTextField();
    JTextField fJurusan = new JTextField();
    JTextField fNim = new JTextField();

    JLabel lBahasa = new JLabel("Knowledge");
    JLabel lEYD = new JLabel("Clean Code");
    JLabel lStruktur = new JLabel("Debugging");
    JLabel lKreativitas = new JLabel("");
    JTextField fBahasa = new JTextField();
    JTextField fEYD = new JTextField();
    JTextField fStruktur = new JTextField();
    JTextField fKreativitas = new JTextField();

    JButton btnSimpan = new JButton("Simpan");
    JButton btnBatal = new JButton("Batal");
    // JLabel lUsername = new JLabel("Username");
    // JLabel lPassword = new JLabel("Password");

    // JTextField fJudul = new JTextField();
    // JTextField fUsername = new JTextField();
    // JPasswordField fPassword = new JPasswordField();

    public Programmer() {
        setTitle("");
        setLayout(null);
        setSize(1200, 1000);

        PanelBiodata.setBorder(border);
        PanelPenilaian.setBorder(border);
        PanelBiodata.add(lNama);
        PanelBiodata.add(lJurusan);
        PanelBiodata.add(lNim);
        PanelBiodata.add(fNama);
        PanelBiodata.add(fJurusan);
        PanelBiodata.add(fNim);

        PanelPenilaian.add(lBahasa);
        PanelPenilaian.add(lEYD);
        PanelPenilaian.add(lKreativitas);
        PanelPenilaian.add(lStruktur);
        PanelPenilaian.add(fBahasa);
        PanelPenilaian.add(fEYD);
        PanelPenilaian.add(fKreativitas);
        PanelPenilaian.add(fStruktur);

        add(btnSimpan);
        add(btnBatal);
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
        fNama.setBounds(100, 18, 380, 25);

        lJurusan.setBounds(15, 50, 100, 50);
        lJurusan.setFont(new Font("Arial", Font.BOLD, 14));
        fJurusan.setBounds(100, 63, 380, 25);

        lNim.setBounds(15, 95, 100, 50);
        lNim.setFont(new Font("Arial", Font.BOLD, 14));
        fNim.setBounds(100, 108, 380, 25);

        lPenilaian.setBounds(50, 300, 200, 50);
        lPenilaian.setFont(new Font("Arial", Font.PLAIN, 16));

        PanelPenilaian.setBounds(50, 350, 530, 200);
        PanelPenilaian.setLayout(null);

        lBahasa.setBounds(15, 8, 150, 50);
        lBahasa.setFont(new Font("Arial", Font.BOLD, 14));
        fBahasa.setBounds(120, 18, 380, 25);

        lEYD.setBounds(15, 50, 100, 50);
        lEYD.setFont(new Font("Arial", Font.BOLD, 14));
        fEYD.setBounds(120, 63, 380, 25);

        lStruktur.setBounds(15, 95, 100, 50);
        lStruktur.setFont(new Font("Arial", Font.BOLD, 14));
        fStruktur.setBounds(120, 108, 380, 25);

        btnSimpan.setBounds(230, 600, 100, 30);
        btnBatal.setBounds(350, 600, 100, 30);
        this.setSize(650, 700);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSimpan) {
            // String nama = fNama.getText();
            // String nim = fNama.getText();
            // String jurusan = fNama.getText();
            // String nilaiBahasa = fNama.getText();
            // Integer nilai;
            // String keterangan
            // if()
            // HasilPenilaian hasil = new HasilPenilaian();
        }
        if (e.getSource() == btnBatal) {
            Hasil desig = new Hasil();
        }
    }

}
