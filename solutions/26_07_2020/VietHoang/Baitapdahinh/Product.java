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
public class Product {
    private int id;
    private String name;
    private double price;
    private int quanlity;

    public Product() {
    }

    public Product(int id, String name, double price, int quanlity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quanlity = quanlity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuanlity() {
        return quanlity;
    }
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin san pham:");
        do
        try {
                   System.out.println("Nhap ma san pham :");
                   setId(sc.nextInt());
                   break;
        } catch (Exception e) {
            System.out.println("Nhap vao so");
        } while (true);
        
        System.out.println("Nhap ten san pham:");
        sc.nextLine();
        setName(sc.nextLine());
        do{
        try {
            System.out.println("Nhap gia:");
        setPrice(sc.nextDouble());
        break;
        } catch (Exception e) {
            System.out.println("Nhap vao dinh dang la so nguyen:");
        }
        } while (true);
        do {
        try {
            System.out.println("Nhap quanlity: ");
        setQuanlity(sc.nextInt());
        break;
        } catch (Exception e) {
            System.out.println("Nhap vao dinh dang la so");
        }
        } while (true);
    }
    public void outputInfo() {
        
    }
}
