///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package pdfpagereader;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.Reader;
//import java.io.UnsupportedEncodingException;
//import java.io.Writer;
//import java.nio.charset.StandardCharsets;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author saqib
// */
//public class ReadPdf {
//
//    public static void main(String[] args){
//        String enc = System.getProperty("file.encoding");
//        System.out.println("default encoding is :" + enc);
//        //System.setProperty("file.encoding", "Cp420");
//        enc = System.getProperty("file.encoding");
//        System.out.println(" now default encoding is :" + enc);
//        File f = new File("testfile.pdf");
//        try {
//            InputStream is = new FileInputStream(f);
//            Reader reader = new InputStreamReader(is);
//            BufferedReader buffer = new BufferedReader(reader);
//            String line = null;
//            File file = new File("file2.txt");
//
//			// if file doesnt exists, then create it
//			if (!file.exists()) {
//				file.createNewFile();
//			}
//                        FileWriter fw = new FileWriter(file.getAbsoluteFile());
//			//BufferedWriter bw = new BufferedWriter(fw, "UTF16");
//                        Writer out = new BufferedWriter(fw);
//			
//			
//            while((line = buffer.readLine())!= null){
//                //JOptionPane.showMessageDialog(null, line);
//                byte[] bytes = line.getBytes(StandardCharsets.ISO_8859_1);
//                line = new String(bytes, StandardCharsets.UTF_8);
//                JOptionPane.showMessageDialog(null, line);
//                out.write(line);
//                
//                //System.out.println(line);
//            }
//            out.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ReadPdf.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedEncodingException ex) {
//            Logger.getLogger(ReadPdf.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ReadPdf.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
