/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Camera extends Product{
    private boolean hasWifi;

    public Camera() {
        super();
    }

    public Camera(boolean hasWifi) {
        super();
        this.hasWifi = hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    @Override
    public void addNew() {
        super.addNew();
        Scanner sc = new Scanner(System.in);
        do {
        try {
            System.out.println("Co camera hay ko:true/false");
        setHasWifi(sc.nextBoolean());
        break;
        } catch (Exception e) {
            System.out.println("Nhap vao gia tri true/false");
        }
        sc.nextLine();
        } while (true);
        
    }
    @Override
    public void outputInfo() {
        System.out.printf("%3s|%10s|%10s|%8s|%8s\n","Ma id","Name","Price","Quanlity","Wifi");
        System.out.printf("%3d|%10s|%10f|%8d|%8B\n)",super.getId(),super.getName(),super.getPrice(),super.getQuanlity(),this.hasWifi);
    }
    
}
