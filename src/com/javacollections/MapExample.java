package com.javacollections;

import java.util.*;  
public class MapExample {  
        public static void main(String args[])   
        {   
            Map<String, Integer> m = new HashMap<String, Integer>(); //implementation of the Map Interface  
  
          //Adding elements
            m.put("Abhi", (001));            
            m.put("Nick", (002));   
            m.put("Ketty",(003));   
            m.put("Paul", (004));   
            for (Map.Entry<String, Integer> me : m.entrySet())// Traversing of the elements through the Map   
            {   
                System.out.print(me.getKey() + ":");
                System.out.println(me.getValue());   
            }   
        }   
    }   