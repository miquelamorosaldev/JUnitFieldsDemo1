package junitfieldsdni;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author alumne
 */
public class Validacions {

    /**
     * Metodo que valida si un NIF o CIF tiene el formato correcto o no.
     * @param DNI Cadena de texto con el DNI a validar.
     * @return true si tiene el formato valido, false en caso contrario.
     */
    public boolean isDNICorrectOld(String DNI) {
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
        boolean result = Pattern.matches(dniRegexp, DNI);
        return result;
    }
    
    public static boolean isNifNie(String nif){

        System.out.println("NIF "+nif);
        //si es NIE, eliminar la x,y,z inicial para tratarlo como nif
        if (nif.toUpperCase().startsWith("X")||nif.toUpperCase().startsWith("Y")||nif.toUpperCase().startsWith("Z"))
        nif = nif.substring(1);

        Pattern nifPattern = Pattern.compile(
                "(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
        Matcher m = nifPattern.matcher(nif);
        if(m.matches()){
            String letra = m.group(2);
            //Extraer letra del NIF
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int dni = Integer.parseInt(m.group(1));
            dni = dni % 23;
            String reference = letras.substring(dni,dni+1);

            if (reference.equalsIgnoreCase(letra)){
                System.out.println("son iguales. Es NIF. "+letra+" "+reference);
                return true;
            }else{
                System.out.println("NO son iguales. NO es NIF. "+letra+" "+reference);
                return false;
            }
        } else {
            return false;
        }
    }
}
