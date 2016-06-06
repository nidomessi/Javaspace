/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfpagereader;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.Font;
import com.aspose.words.ParagraphAlignment;
import com.aspose.words.ParagraphFormat;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
import com.itextpdf.text.pdf.security.ExternalDecryptionProcess;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author saqib
 */
public class ArabicTextReader {
    
//    public ArabicTextReader() throws IOException{
//        method1();
//        method2();
   
//    }
    
    public ArabicTextReader(String s, String t){
        method3();
//        try {
//            parsePdf(s, t);
//        } catch (IOException ex) {
//            Logger.getLogger(ArabicTextReader.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    public static void main(String[] args) throws IOException{
       
        new ArabicTextReader("myfile.pdf","file12.txt");
        
    }
    public void parsePdf(String pdf, String txt) throws IOException {
        PdfReader reader = new PdfReader(pdf);
        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
        PrintWriter out = new PrintWriter(new FileOutputStream(txt));
        TextExtractionStrategy strategy;       
        for (int i = 1; i <= reader.getNumberOfPages(); i++) {
            strategy = parser.processContent(i, new SimpleTextExtractionStrategy());           
            out.println(strategy.getResultantText());
        }
        out.flush();
        out.close();
    }
    public void method1() throws IOException{
                    BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("myfile.pdf"), Charset.forName("UTF-16")));
            String line  = null;
            String hold = null;
            while((line = reader.readLine())!= null){
                JOptionPane.showMessageDialog(null, hold);
                hold = hold + line;
                
            }
            File file = new File("file3.txt");
            // if file doesnt exists, then create it
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(ArabicTextReader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            Writer out = new BufferedWriter(fw);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArabicTextReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(ArabicTextReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void method2(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\saqib\\Documents\\NetBeansProjects\\PdfPageReader\\myfile.pdf");
            String inputStreamString = new Scanner(fis,"UTF-16").useDelimiter("\\A").next();
            JOptionPane.showMessageDialog(null, inputStreamString);
            System.out.println(inputStreamString);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArabicTextReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(ArabicTextReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void method3(){
        Document wordDoc = null;
        DocumentBuilder builder = null;
        String s = null;
        try {
            PdfReader pr = new PdfReader("myfile.pdf");             
            s = PdfTextExtractor.getTextFromPage(pr, 1);                     
            pr.close();
            try {
                wordDoc = new Document();
                builder = new DocumentBuilder(wordDoc);
                Font wordFont = builder.getFont();
                wordFont.setSize(16.0);
                
                ParagraphFormat paragraphFormat = builder.getParagraphFormat();
                paragraphFormat.setFirstLineIndent(8);
                paragraphFormat.setAlignment(ParagraphAlignment.JUSTIFY);                                
                paragraphFormat.setKeepTogether(true);
                builder.write(s);
                wordDoc.save("D:\\git\\Javaspace\\wordDoc2.docx");
                } catch (Exception ex) {
                Logger.getLogger(ArabicTextReader.class.getName()).log(Level.SEVERE, null, ex);
            }                                               
//            PrintWriter out = new PrintWriter(new FileOutputStream("arabic5.txt"));                        
//            out.println(s);
//            out.flush();
//            out.close();
            System.out.println("Contents are " + s);
        } catch (IOException ex) {
            Logger.getLogger(ArabicTextReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
