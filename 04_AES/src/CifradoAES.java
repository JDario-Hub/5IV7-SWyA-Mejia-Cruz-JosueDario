/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class CifradoAES {
    
    public static void main(String[] args) throws Exception{
    String mensaje= "Hola como estan gente de de youtube";
    String mensajecifrado= AES.encrypt(mensaje);
    String mensajedescifrado = AES.decrypt(mensajecifrado);
    
          System.out.println("EL mensaje  de texto plano"+ mensaje);
          System.out.println("El mensaje cifrado con AES 128: "+ mensajecifrado);
          System.out.println("EL mensaje descifrado: " +mensajedescifrado);
        
    }
}
