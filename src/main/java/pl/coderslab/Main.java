package pl.coderslab;

import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
//        String s = "/home/arek/Desktop/delete/sample.pdf";
        String s = "/home/arek/Desktop/delete/skany/typowe/42492.pdf";
//        String s = "/home/arek/Desktop/delete/skany/typowe/34466.jpg";
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("/home/arek/Desktop/delete/");
        tesseract.setLanguage("eng");
        String s1 = tesseract.doOCR(new File(s));
        System.out.println(s1);
    }
}
