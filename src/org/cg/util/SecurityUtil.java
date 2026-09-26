package org.cg.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//hasear nustra clave as SHA256
/**
 * Clase SecurityUtil
 *
 * @author Cristofer
 * @version 1.0.0
 */
/**
 * Class SecurityUtil del sistema LibraryApp.
 *
 * @author Cristofer Gutierrez
 * @version 1.0.0
 * @see <a href='https://github.com/cristofer-ct/LibrariApp_CristoferGutierrez'>Repositorio</a>
 */
public class SecurityUtil {
    
    /**
     * Método hashSHA256.
     * @param password parámetro de tipo String
     * @return un valor de tipo String
     */
    /**
     * Método hashSHA256.
     * @param password parámetro de tipo String
     * @return un valor de tipo String
     */
    /**
     * Ejecuta la operacion hashSHA256.
     * @param password valor de tipo String
     * @return valor de tipo String
     */
    public static String hashSHA256(String password){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(password.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            
            StringBuilder hexString = new StringBuilder(2 * encodedhash.length);
            for (byte b : encodedhash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al encriptar la contraseña", e);
        }
    }
    
}
