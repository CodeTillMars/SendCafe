package PASCertificationScripts;

import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {
    private static ExtentReports instance;

    public static synchronized ExtentReports getInstance() {
        if (instance == null) {
            //System.out.println(System.getProperty("user.dir"));
            String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            instance = new ExtentReports(System.getProperty("user.dir") + "/Test-output" + "/Extent_" + dateName + ".html");
            //	instance = new ExtentReports("\\\\p01apw103\\PAS_CORE\\aaa_pas_cert_automation" + "\\Test-output"+"\\Extent_"+dateName+".html");
            instance.loadConfig(new File(System.getProperty("user.dir") + "\\src\\extent-config.xml"));
        }

        return instance;
    }


    public static synchronized ExtentReports getInstance(String suiteName) {
        if (instance == null) {
            //System.out.println(System.getProperty("user.dir"));
            String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            System.out.println(System.getProperty("user.dir") + "/" + suiteName + "_" + dateName + ".html");
            instance = new ExtentReports(System.getProperty("user.dir") + "/Test-output" + "/" + suiteName + "_" + dateName + ".html");
            //instance = new ExtentReports("\\\\p01apw103\\PAS_CORE\\aaa_pas_cert_automation" + "\\Test-output"+"\\Extent_"+dateName+".html");
            instance.loadConfig(new File(System.getProperty("user.dir") + "\\src\\extent-config.xml"));
        }

        return instance;
    }

}
