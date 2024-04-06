/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hacktonfuckjackson;

/**
 *
 * @author Loh Kai Xuan
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class wallet {
    private static String publickey;
    private static String privatekey;
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Loh Kai Xuan\\Documents\\NetBeansProjects\\hacktonfuckjackson\\src\\main\\java\\com\\mycompany\\hacktonfuckjackson\\walletKeys.txt"; // Replace "example.txt" with the path to your text file
        //String fileName = "walletKeys.txt"; // Replace "example.txt" with the path to your text file
        File file = new File(fileName);
        System.out.println(fileName);

         try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

                String pubkey =  line.substring(14,58);
                String prikey =  line.substring(74,301);
                System.out.println(pubkey);
                System.out.println(prikey);
                publickey = pubkey;
                privatekey = prikey;

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
    public String getSavePublicKey(){
            return wallet.publickey;
        }
    public String getSavePrivateKey(){
            return wallet.privatekey;
        }

    
}