/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.io.File;

/**
 *
 * @author Megi
 */
public class folder {
       
        public static void main(String [] args){
           
              String path="src\\QR";
              File f = new File(path);
           
                if(f.exists()){
                    System.out.println("Directory is already exixted");
                }else{
                    f.mkdir();
                       System.out.println("Directory is created" +path);
                }
        }
}
