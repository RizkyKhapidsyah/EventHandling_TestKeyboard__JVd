package com.rk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainProgram extends JFrame implements KeyListener {

    int KodeTombol;
    char KarakterTombol;

    public static void main(String[] args) {
        MainProgram MP = new MainProgram();
    }

    MainProgram() {
        setTitle("Percobaan Keyboard");
        addKeyListener(this);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.clearRect(0, 0, 300, 200);
        g.setColor(Color.BLACK);
        g.drawString("Tekan Sebuah Tombol   : ", 20, 20);
        g.drawString("Kode Tombol           : " + KodeTombol, 20, 50);
        g.drawString("Karakter Tombol       : " + KarakterTombol, 20, 70);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        KodeTombol = e.getKeyCode();
        KarakterTombol = e.getKeyChar();
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
