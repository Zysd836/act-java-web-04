/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile1;

/**
 *
 * @author vieth
 */
public class BaiTapFile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileUtils file= new FileUtils();
        file.inputduongDan();
        file.outputDate();
        file.outputFolder();
        file.outputFile();
        file.outputPhoto();
        
    }
    
}
