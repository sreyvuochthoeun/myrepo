/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapsearch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Yan Pheakdey
 */
public class MapSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CountriesHastMap countriesHashMap = new CountriesHastMap();
        HashMap<String, List<String>> countriesMap = countriesHashMap.getCountriesHashMap();
        Scanner scInput = new Scanner(System.in);
        
        try {
            while (true){
                System.out.print("Please Enter Starting Char or Exit to leave : ");
                String strInput = scInput.next();
                if (!"EXIT".equals(strInput.toUpperCase())){
                    if (strInput.length()==1 &  Character.isLetter(strInput.charAt(0)) ){
                        List<String> _countriesList = countriesMap.get(strInput.toUpperCase());
                        _countriesList.forEach((strCountry) -> {
                            System.out.println(strCountry);
                        });
                    }
                    else{
                        System.out.print("Error Please Enter Char -> ");
                    }
                }else{
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception : ".concat(e.getMessage()));
        }
    }
    
}
