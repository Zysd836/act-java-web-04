/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapFile2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vieth
 */
public class SimpleVim {

    private String duongDan;
    private File file;

    public SimpleVim() {
    }

    public void inputDuongDan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập đường dẫn:");
        this.duongDan = sc.nextLine();
        this.file = new File(duongDan);
    }

    public void menu() {
        System.out.println("Loaded......");
        System.out.println("Trình soạn thảo sẵn sàng");
        System.out.println("--------------------");
    }

    public void infoVim() {
        if (this.file.exists()) {

            menu();
            openVim();
        } else {
            
            try {
                if (this.file.createNewFile()) {
                    System.out.println("Created");
                }
            } catch (IOException ex) {
                Logger.getLogger(SimpleVim.class.getName()).log(Level.SEVERE, null, ex);
            }
            menu();
            openVim();
        }
    }

    public void openVim() {
        Note n = new Note();

        try {
            FileOutputStream f1 = new FileOutputStream(this.file);
            ObjectOutputStream f2 = new ObjectOutputStream(f1);
            while (!n.getString().equals(":q")) {
                
                n.writeNote();
                f2.writeObject(n);
            }
            f1.close();
            f2.close();

        } catch (Exception ex) {

        }

    }

    public void openFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập đường dẫn:");
        String dt = sc.nextLine();
        File f = new File(dt);
        try {
            FileInputStream fo1 = new FileInputStream(f);
            ObjectInputStream fo2 = new ObjectInputStream(fo1);
            while (fo1.available() > 0) {
            
                Note no =(Note) fo2.readObject();
                System.out.println(no.getString());
               
            }
            fo2.close();

        } catch (Exception e) {
            System.out.println("BaiTapFile2.SimpleVim.openFile()");
        }
    }
}
