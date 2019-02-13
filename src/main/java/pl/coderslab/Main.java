package pl.coderslab;

import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        String s = "/home/arek/Desktop/delete/sample.pdf";
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("/home/arek/Desktop/delete/");
        tesseract.setLanguage("eng");
        String s1 = tesseract.doOCR(new File(s));
        System.out.printf(s1);
    }
}
