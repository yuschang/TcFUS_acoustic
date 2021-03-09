/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnu.acoustic;

/**
 *
 * @author yustc
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class OptionPaneCustom {
    
    JFrame f;

    OptionPaneCustom(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "test");
    }
    
    OptionPaneCustom(String popmsg){
        f = new JFrame();
        JOptionPane.showMessageDialog(f, popmsg);
    } 
    
    
    public void popupDialog(String popmsg){          

    }
            
    
}
