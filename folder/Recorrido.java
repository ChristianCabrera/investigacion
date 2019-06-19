/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Navarro.folder;

import java.io.File;
/**
 *
 * @author tetzu
 */
public class Recorrido {
    public static void explorar(File f){
        System.out.print(f);
        for (File file : f.listFiles()) {
            
        }
        if(f.isDirectory()){
            explorar(f);
        
        }else if (f.isFile()){
            System.out.print("");
        }
        
    }
}
