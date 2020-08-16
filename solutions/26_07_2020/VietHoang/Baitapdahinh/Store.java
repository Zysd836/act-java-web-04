/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import com.sun.java.accessibility.util.EventID;
import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product[] products=new Product[100];
        int key;
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            key= sc.nextInt();
            switch(key) {
                case 1:
                    addProduct(products);
                    break;
                case 2:
                    listProduct(products);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Ko hop le");
            }
        }
    }
   public static void addProduct(Product[] pr) {
       int i=0;int key;String test;
       Scanner sc = new Scanner(System.in);
        do {
            
            System.out.println("Nhap 1 neu sp la smartphone");
            System.out.println("Nhap 2 neu san pham la camera");
            key=sc.nextInt();
          switch(key) {
              case 1:
                  
                  pr[i]= new SmartPhone();
                  pr[i].addNew();
                  break;
              case 2:
                  
                  pr[i]= new Camera();
                  pr[i].addNew();
                  break;
                  
          }
          i++;
          sc.nextLine();
            System.out.println("Co muon nhap nua ko:yes/no?");
            
            test=sc.nextLine();
        } while (test.equalsIgnoreCase("Yes"));
    }
   public static void listProduct(Product[] pr) {
       System.out.println("Danh sach thong tin san pham:");
       
        for (Product pr1 : pr) {
            
            if (pr1 == null) {
                break;
            }
            pr1.outputInfo();
        }
   }
   public static void search(Product[] pr) {
       Scanner sc = new Scanner(System.in);
       String findName;
       System.out.println("Nhap ten can tim:");
       findName=sc.nextLine();
       for (int i = 0; i < pr.length; i++) {
           if (pr[i].getName().equalsIgnoreCase(findName));
           pr[i].outputInfo();
           break;
           
       }
   }
   public static void menu() {
       System.out.println("Nhap 1 de them danh sach san pham");
       System.out.println("Nhap 2 de in danh sach san pham");
       System.out.println("Nhap 3 de ket thuc");
       System.out.println("Moi nhap lua chon:");
   }
}
