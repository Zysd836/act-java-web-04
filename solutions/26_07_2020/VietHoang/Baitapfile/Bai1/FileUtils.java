/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfile1;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class FileUtils {

    private String duongDan;
    private File file;

    public FileUtils() {
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void inputduongDan() {
        System.out.println("Moi nhap duong dan:");
        Scanner sc = new Scanner(System.in);
        this.duongDan = sc.nextLine();
        this.file = new File(duongDan);
    }

    public void outputFolder() {
        String[] list = this.file.list();
        System.out.println("Cac folder trong duong dan la:");
        for (String string : list) {
            File f1 = new File(duongDan, string);
            if (f1.isDirectory()) {
                System.out.println(string);
            }
        }
    }

    public void outputFile() {
        String[] list = this.file.list();
        System.out.println("Cac file trong duong dan la:");
        for (String string : list) {
            File f1 = new File(duongDan, string);
            if (f1.isFile()) {
                System.out.println(string);
            }
        }
    }

    public void outputPhoto() {
        String[] list = this.file.list();
        System.out.println("Cac file anh la:");
        for (String string : list) {
            String[] l = string.split("\\.");

            String s = l[l.length - 1];
            if (s.equalsIgnoreCase("jpg")) {
                System.out.println(string);
            } else if (s.equalsIgnoreCase("png")) {
                System.out.println(string);
            } else if (s.equalsIgnoreCase("jpeg")) {
                System.out.println(string);
            }

        }
    }

    public void outputExt(String path, String tail) {
        File f = new File(path);
        String[] list = f.list();
        System.out.println("Cac file co phan mo rong ext la");
        for (String string : list) {
            String s = list[list.length - 1];
            if (s.equalsIgnoreCase("ext")) {
                System.out.println(string);
            }
        }
    }

    public void outputDate() {
        String[] list = this.file.list();
        for (String string : list) {
            File f = new File(this.duongDan, string);
            long lateDate = f.lastModified();
            Date lastTime = new Date(lateDate);
            System.out.println("Date " + string + ":" + lastTime);
        }
    }

    public void outputMemory(String type) {
        String[] list = this.file.list();
        for (String string : list) {
            File f = new File(this.duongDan, string);
            if (type.equalsIgnoreCase("kb")) {
                System.out.println("Memory " + string + ":" + f.length() / 1024);
            } else {
                if (type.equalsIgnoreCase("mb")) {
                    System.out.println("Memory " + string + ":" + (f.length() / 1024) / 1024);
                }
            }
        }
    }
}
