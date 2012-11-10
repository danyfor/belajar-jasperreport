/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeimpact.ui.abstraction;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.design.JasperDesign;

/**
 *
 * @author eko
 */
public abstract class ReportIFrame extends JInternalFrame {

    protected JasperDesign jasperDesign;
    protected JasperPrint jasperPrint;
    protected ReportViewer jasperViewer;

    public ReportIFrame() {
    }

    /**
     * override jika dibutuhkan
     */
    public void registerHyperlinkListener() {
    }

    public abstract void prepareReport() throws Exception;

    private ReportViewer createViewer(String title) {
        ReportViewer localViewer = new ReportViewer(jasperPrint, false);
        localViewer.setTitle(title);

        return localViewer;
    }

    public void viewReport() {
        this.viewReport(this.getTitle());
    }

    public void viewReport(String title) {
        try {
            prepareReport();
            jasperViewer = createViewer(title);
            registerHyperlinkListener();
            jasperViewer.setVisible(true);
            jasperViewer.toFront();
        } catch (Exception ex) {
            Logger.getLogger(ReportIFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void printReport() {
        try {
            prepareReport();
            JasperPrintManager.printReport(jasperPrint, true);
        } catch (Exception ex) {
            Logger.getLogger(ReportIFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
