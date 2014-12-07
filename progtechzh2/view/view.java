/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.model;

/**
 *
 * @author kubuaai
 */
public class view extends JFrame {

    private static final int SIZE = 5;
    private final JButton[][] buttons = new JButton[SIZE][SIZE];
    private JPanel panel = new JPanel();
    private int counter = 1;
    model model = new model();

    public view() {
        setTitle("Chess");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(SIZE, SIZE));
        add(panel);
        initialize();
    }

    private void initialize() {
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                JButton button = new JButton(Integer.toString(model.getElements(i, j)));
                buttons[i][j] = button;
                final int x = i;
                final int y = j;
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        model.lephetE(x,y);
                        model.lephet(x,y);
                        refresh();
                        
                        if(model.winCheck()){
                            JOptionPane.showMessageDialog(null, "You win");
                            System.exit(0);
                        }
                    }
                });
                panel.add(button);
            }
        }
        refresh();
    }

    private void refresh() {
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                if (model.getElements(i, j) != 0) {
                    buttons[i][j].setText("");
                } else {
                    buttons[i][j].setText("huszar");
                    buttons[i][j].setBackground(Color.blue);  
                }
            }
        }
    }
}
