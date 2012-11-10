/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeimpact.util;

import com.codeimpact.ui.MainFrame;
import java.io.File;

/**
 *
 * @author eko
 */
public class AppUtils {

    private static AppUtils singleton;
    private File file;

    private AppUtils() {
    }

    public static synchronized AppUtils getInstance() {
        if (null == singleton) {
            singleton = new AppUtils();
            singleton.init();
        }

        return singleton;
    }

    private void init() {
        file = new File(getJarPath());
    }

    public String getJarPath() {
        String jarPath = MainFrame.class.getProtectionDomain().getCodeSource().getLocation().getPath();

        int index = jarPath.indexOf("classes");
        if (index >= 0) {
            jarPath = jarPath.substring(0, index - 1);
        }

        return jarPath;
    }

    public String getReportPath() {
        return getPath() + getFileSeparator() + "report";
    }

    public String getPath() {
        String path = file.getParent();
        if (path != null && path.indexOf("%20") >= 0) {
            path = path.replace("%20", " ");
        }
        
        return path;
    }

    public String getFileSeparator() {
        return System.getProperty("file.separator");
    }
}
