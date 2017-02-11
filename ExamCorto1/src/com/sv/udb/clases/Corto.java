/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.Random;

/**
 *
 * @author DanielWilfredo
 */
public class Corto {
    
  
     public int numeAlea1;
     public int numeAlea2;
     public int numeAlea3;
   
        public int calcNume1()
        {
            Random geneRand = new Random();
            numeAlea1= geneRand.nextInt(7)+1;
            return numeAlea1;
        }
        public int calcNume2()
        {
            Random geneRand = new Random();
            numeAlea2= geneRand.nextInt(7)+1;
            return numeAlea3;
        }
        public int calcNume3()
        {
            Random geneRand = new Random();
            numeAlea2= geneRand.nextInt(7)+1;
            return numeAlea2;
        }
    
       
}
