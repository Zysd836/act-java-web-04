/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapFile2;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Note implements Serializable{
    private String string;
    public Note() {
        this.string="";
    }
    public void setString(String string) {
        this.string = string;
    }
    public String getString() {
        return string;
    }

    
    
    public void writeNote() {
        Scanner sc = new Scanner(System.in);
        this.string=sc.nextLine();
    }
}
