/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitfieldsdni;

/**
 *
 * @author alumne
 */
public class MainValidacions {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Validacions validacions = new Validacions();
        
        System.out.println("Programa validación campos, DNI");
        System.out.println(
                validacions.isNifNie("1234"));
        System.out.println(
                validacions.isNifNie("12345678Z"));
        System.out.println(
                validacions.isNifNie("72994798C"));
//        Aun no valida CIF.
//        System.out.println(
//                validacions.isDNICorrect("Z7663728H"));

    }
    
}
