/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeimpact.ui.abstraction;

import java.io.InputStream;
import java.util.Locale;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author eko
 */
public class ReportViewer extends JasperViewer {

    public ReportViewer(String sourceFile, boolean isXMLFile) throws JRException {
        super(sourceFile, isXMLFile);
    }

    public ReportViewer(InputStream is, boolean isXMLFile) throws JRException {
        super(is, isXMLFile);
    }

    public ReportViewer(JasperPrint jasperPrint) {
        super(jasperPrint);
    }

    public ReportViewer(String sourceFile, boolean isXMLFile, boolean isExitOnClose) throws JRException {
        super(sourceFile, isXMLFile, isExitOnClose);
    }

    public ReportViewer(InputStream is, boolean isXMLFile, boolean isExitOnClose) throws JRException {
        super(is, isXMLFile, isExitOnClose);
    }

    public ReportViewer(JasperPrint jasperPrint, boolean isExitOnClose) {
        super(jasperPrint, isExitOnClose);
    }

    public ReportViewer(String sourceFile, boolean isXMLFile, boolean isExitOnClose, Locale locale) throws JRException {
        super(sourceFile, isXMLFile, isExitOnClose, locale);
    }

    public ReportViewer(InputStream is, boolean isXMLFile, boolean isExitOnClose, Locale locale) throws JRException {
        super(is, isXMLFile, isExitOnClose, locale);
    }

    public ReportViewer(JasperPrint jasperPrint, boolean isExitOnClose, Locale locale) {
        super(jasperPrint, isExitOnClose, locale);
    }

    public JRViewer getJRViewer() {
        return viewer;
    }
}
