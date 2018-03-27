package main;

import graphics.Sprite;
import maths.Delta;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Main
{
    public static Main instance;

    public static JFrame frame = new JFrame("TITLE");
    public static JPanel panel = new JPanel();
    public static Canvas canvas = new Canvas();
    public static Delta delta = new Delta();
    public static double fps;

    public Sprite Player;


    public BufferedImage image;

    public static void main(String [] args)
    {
        instance = new Main();
        instance.

        frame.setVisible(true);
        frame.setSize(720, 480);
        frame.add(canvas);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(frame.isActive())
        {
            canvas.setBackground(Color.BLUE);
            System.out.println(fps);
            fps = 1 / delta.getDelta();
            delta.update();
        }
    }
}