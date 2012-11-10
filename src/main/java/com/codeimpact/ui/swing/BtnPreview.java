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
public class BtnPreview extends JButton {
    
    public BtnPreview() {
        this("Preview", null);
    }
    
    public BtnPreview(Icon icon) {
        this(null, icon);
    }
    
    public BtnPreview(String text) {
        this(text, null);
    }
    
    public BtnPreview(Action a) {
        this();
        setAction(a);
    }
    
    public BtnPreview(String text, Icon icon) {
        super(text, icon);
        setPreferredSize(new Dimension(90, 25));
    }
}
