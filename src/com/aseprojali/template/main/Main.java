package com.aseprojali.template.main;




import com.aseprojali.template.view.MainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AsepRojali
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                MainFrame mf = new MainFrame();
                mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                mf.setVisible(true);
            }
        });
    }
}
