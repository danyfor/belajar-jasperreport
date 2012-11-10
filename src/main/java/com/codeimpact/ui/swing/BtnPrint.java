/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeimpact.ui.swing;

import java.awt.Dimension;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author eko
 */
public class BtnPrint extends JButton {
    
    public BtnPrint() {
        this("Print", null);
    }
    
    public BtnPrint(Icon icon) {
        this(null, icon);
    }
    
    public BtnPrint(String text) {
        this(text, null);
    }
    
    public BtnPrint(Action a) {
        this();
        setAction(a);
    }
    
    public BtnPrint(String text, Icon icon) {
        super(text, icon);
        setPreferredSize(new Dimension(90, 25));
    }
}
