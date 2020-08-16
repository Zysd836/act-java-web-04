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
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;

    public SmartPhone() {
        super();
    }

    public SmartPhone(boolean hasCamera, int sim) {
        super();
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public int getSim() {
        return sim;
    }
    

    @Override
    public void addNew() {
        super.addNew();
        Scanner sc = new Scanner(System.in);
        
        do{
        try {
            System.out.println("Co camera hay ko:true/false");
            setHasCamera(sc.nextBoolean());
            
            break;
        } catch (Exception e) {
            System.out.println("Nhap vao gia tri true/false");
        }
        } while (true);
        do {
        try {
             System.out.println("Nhap sim:");
               setSim(sc.nextInt());
               break;
        } catch (Exception e) {
            System.out.println("Nhap vao day so");
        }
        } while (true);
    }
    @Override
    public void outputInfo() {
        System.out.printf("%3s|%10s|%10s|%8s|%7s|%15s\n","Ma id","Name","Price","Quanlity","Camera","Sim");
        System.out.printf("%3d|%10s|%10f|%8d|%8B|%15d\n)",super.getId(),super.getName(),super.getPrice(),super.getQuanlity(),this.hasCamera,this.sim);
    }
}
