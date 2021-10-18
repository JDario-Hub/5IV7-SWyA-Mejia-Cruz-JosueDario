/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.*;

public class AES {
    public static final byte[] keyvalue = new byte[]{
            
        'q','w','e','r','t','y','u','i',
        'q','w','e','r','t','y','u','i'
        
            };
    
    private static final String instancia = "AES";
    
    
    public static String encrypt(String Data) throws Exception{
    
        Key key = generateKey();
                
        Cipher cifrado = Cipher.getInstance(instancia);
        cifrado.init(Cipher.ENCRYPT_MODE,key);
        
        byte[] encValores = cifrado.doFinal(Data.getBytes());
        
        //
        //formato de codificacion base 64
        
        System.out.println("VAlores sin formato:");
        
        String valoresencriptados = new BASE64Encoder().encode(encValores);
        
        return valoresencriptados;
    }
    
     public static String decrypt(String valoresencriptados) throws Exception{
    
        Key key = generateKey();
                
        Cipher cifrado = Cipher.getInstance(instancia);
        cifrado.init(Cipher.DECRYPT_MODE,key);
        
        byte[]decodificadorvalores = new BASE64Decoder().decodeBuffer(valoresencriptados);
        
        
                
        byte[] decvalores = cifrado.doFinal(decodificadorvalores.getBytes());
        
        //
        //formato de codificacion base 64
        
        System.out.println("Valores sin formato:");
        
        String valoresdescriptado = new BASE64Encoder().encode(decvalores);
        
        return valoresdescriptado;
    }
    
    private static Key generateKey() throws Exception {
        
        Key key = new SecretKeySpec(keyvalue,instancia);
        return key;
    }

    static String encrypt (String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}   
