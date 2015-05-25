/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import javax.swing.JFrame;

public class FraMain extends JFrame {

    public FraMain() {
        add(new PanBoard());
        setTitle("Welp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}