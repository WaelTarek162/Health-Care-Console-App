/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i.clup.project;
import java.lang.NullPointerException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author The Twins
 */
public class IClupProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ui ui = new Ui();
        admin primary = new admin();
        boolean flag = false;
        while (flag == false) {
            if (primary.validating() == true) {
                flag = true;
                System.out.println("good . loged in");
                ui.StartPoint();
            } else {
                System.err.println("try again ");
            }
        }
    }
}
    

    
    
    

