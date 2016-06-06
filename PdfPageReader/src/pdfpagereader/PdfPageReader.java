///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package pdfpagereader;
//import com.itextpdf.text.Chunk;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.BaseFont;
//import com.itextpdf.text.pdf.PdfContentByte;
//import com.itextpdf.text.pdf.PdfReader;
//import com.itextpdf.text.pdf.PdfStamper;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.text.pdf.parser.PdfTextExtractor;
//import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.io.UnsupportedEncodingException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
///**
// *
// * @author saqib
// */
//public class PdfPageReader {
//static Document document;
//    /**
//     * @param args the command line arguments
//     */
//static String s = null;
//    public static void main(String[] args) {
//        BaseFont tahoma = null;
//            try {
//                
//                
//                PdfReader pr = new PdfReader("myfile.pdf");
//                
//                s = PdfTextExtractor.getTextFromPage(pr, 1);
//                
//                pr.close();
//                System.out.println("Contents are " + s);
//                try {
//                    tahoma = BaseFont.createFont("/resources/ARIALUNI.ttf", BaseFont.WINANSI, BaseFont.EMBEDDED);
//                } catch (DocumentException | IOException ex) {
//                    Logger.getLogger(PdfPageReader.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                BufferedReader bufferReader = null;
//                Reader reader =null;
//                try {
//                    dothis();
//                    JOptionPane.showMessageDialog(null, "hello");
//                    // TODO code application logic here
//                    reader = new InputStreamReader(new FileInputStream("C:\\Users\\saqib\\Documents\\NetBeansProjects\\PdfPageReader\\myfile.pdf"),"UTF8");
//                    bufferReader = new BufferedReader(reader);
//                    String line = null;
//                    
//                    while((line = bufferReader.readLine())!=null){
//                        System.out.println(line);
//                    }
////            JOptionPane.showMessageDialog(null, s);
//
//
//pr.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(PdfPageReader.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(PdfPageReader.class.getName()).log(Level.SEVERE, null, ex);
//            }
//    }
//       public static void dothis(){
//           try {
//		File fileDir = new File("C:\\Users\\saqib\\Documents\\NetBeansProjects\\PdfPageReader\\myfile.pdf");
//			
//		BufferedReader in = new BufferedReader(
//		   new InputStreamReader(
//                      new FileInputStream(fileDir), "UTF8"));
//		String filename = "heybro.pdf";
//		String str;
//		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filename));
//                document.open();    
//		while ((str = in.readLine()) != null) {
//		    System.out.println(str);
//                    document.add(new Paragraph(str));
//		}
//		
//                in.close();
//                document.close();
//	    } 
//	    catch (UnsupportedEncodingException e) 
//	    {
//			System.out.println("1 - " + e.getMessage());
//	    } 
//	    catch (IOException e) 
//	    {
//			System.out.println("2 - " + e.getMessage());
//	    }
//	    catch (Exception e)
//	    {
//			System.out.println("3 - "+e.getMessage());
//	    }
//       }
//}
