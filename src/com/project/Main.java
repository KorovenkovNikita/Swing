package com.project;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {
    private static final Integer width = 600;
    private static final Integer height = 400;
    private static  JFrame jFrame = new JFrame();
    private static  JPanel jPanel = new JPanel();
    public static void main(String[] args) throws Exception {
        getFrame();
    }

    static JFrame getFrame() throws Exception {
        jFrame.add(jPanel);
        JButton jButton = new JButton(new MyAction());
        jButton.setText("Изменить цвет на синий");
        jPanel.add(jButton);

        jFrame.setVisible(true);
        jFrame.setSize(width, height);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

    static class MyAction extends AbstractAction {
     public MyAction(){
            putValue(AbstractAction.SHORT_DESCRIPTION,"My small action");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
jPanel.setBackground(Color.BLUE);
        }
    }
}
