/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcih_hospital;

import javax.swing.JOptionPane;

/**
 *
 * @author romyo
 */
public class ExeptionHandling extends Exception{
     public ExeptionHandling()
    {
        super();
    }
    public ExeptionHandling(String s)
    {
        super(s);
    }
    public static String checkSalary(String S){
        float s = 0;
        try{
        s = Float.parseFloat(S);
        if (!(s > 0 && s < 100001.0)) {
            if (Float.toString(s).contains(" ")) {
                return "Error Salary Contains spaces";
            }
            return "Salary Overflow (^_^)";
        }
        
        }catch(Exception e){return  "Error Salary Must Be Only Numbers"+"\n"+"and must n't exseed 100000 ";}
         
        return null;  
    }
   
   public static int checkUsername(String x){
        
        
             if (!x.matches("[.-@-a-zA-Z-9-_]*")) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Username Or It Contain Spaces"+"\n"+" Try Again ");
                
               
              return -1;  
            }
            
           return 0 ; 
    }

    public static int checkLength(String x){
        
        
             if (x.length()<8||x.contains(" ")) {
                JOptionPane.showMessageDialog(null, "Not valid Password length Or It Contain Spaces"+"\n"+" Try Again \nEnter more than 8 char  !");
                
                if(!x.matches("[a-zA-Z]*")){
                JOptionPane.showMessageDialog(null, "Not valid Password"+"\n"+" Try Again \nEnter more than 8 char  !");
                return-1;
                }
                return -1;
            }

        return 0;
    }
    public static boolean checkEmpty(String a,String b,String c,String d,String e,String f,String g,String k,String t,String i){
    if(a.length()==0||b.length()==0||c.length()==0||d.length()==0||e.length()==0||f.length()==0||g.length()==0||k.length()==0||t.length()==0||i.length()==0)
        return false;
    else
    return true;
    }

    
}
