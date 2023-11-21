/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csia;

/**
 *
 * @author Aditya
 */
import java.math.BigInteger;  
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;
public class Validator_Client {
    public static void main(String[] args) {
        
    }
    
    public static boolean val_client(String username, String password){
        String hashed = getMd5Hash(password);
        
        return true;
    }
    
    public static String getMd5Hash(String input)  
{  
    try   
    {  //static getInstance() method is called with hashing MD5  
        MessageDigest md = MessageDigest.getInstance("MD5");  
        //calculating message digest of an input that return array of byte  
        byte[] messageDigest = md.digest(input.getBytes());  
        //converting byte array into signum representation  
        BigInteger no = new BigInteger(1, messageDigest);  
        String hashtext = no.toString(16);  

        while (hashtext.length() < 32){  
            hashtext = "0" + hashtext;  
        }
        return hashtext;
    }
    catch (NoSuchAlgorithmException e){  
        throw new RuntimeException(e);  
    }  
}   
    
}
