/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapsearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Yan Pheakdey
 */
public class CountriesHastMap {
    public HashMap<String, List<String>>  getCountriesHashMap(){
        CountriesList countriesList = new CountriesList();
        Collection<String> allCountries = countriesList.getAllCountries();
        
        HashMap<String, List<String>> countriesHashMap = new HashMap<String, List<String>>();
        countriesHashMap.put("A", new ArrayList<String>());
        countriesHashMap.put("B", new ArrayList<String>());
        countriesHashMap.put("C", new ArrayList<String>());
        countriesHashMap.put("D", new ArrayList<String>());
        countriesHashMap.put("E", new ArrayList<String>());
        countriesHashMap.put("F", new ArrayList<String>());
        countriesHashMap.put("G", new ArrayList<String>());
        countriesHashMap.put("H", new ArrayList<String>());
        countriesHashMap.put("I", new ArrayList<String>());
        countriesHashMap.put("J", new ArrayList<String>());
        countriesHashMap.put("K", new ArrayList<String>());
        countriesHashMap.put("L", new ArrayList<String>());
        countriesHashMap.put("M", new ArrayList<String>());
        countriesHashMap.put("N", new ArrayList<String>());
        countriesHashMap.put("O", new ArrayList<String>());
        countriesHashMap.put("P", new ArrayList<String>());
        countriesHashMap.put("Q", new ArrayList<String>());
        countriesHashMap.put("R", new ArrayList<String>());
        countriesHashMap.put("S", new ArrayList<String>());
        countriesHashMap.put("T", new ArrayList<String>());
        countriesHashMap.put("U", new ArrayList<String>());
        countriesHashMap.put("V", new ArrayList<String>());
        countriesHashMap.put("W", new ArrayList<String>());
        countriesHashMap.put("X", new ArrayList<String>());
        countriesHashMap.put("Y", new ArrayList<String>());
        countriesHashMap.put("Z", new ArrayList<String>());
        
        for (String country : allCountries) {
            countriesHashMap.get( String.valueOf(country.charAt(0)).toUpperCase()).add(country);
        }
        
        return countriesHashMap;
    }
}
