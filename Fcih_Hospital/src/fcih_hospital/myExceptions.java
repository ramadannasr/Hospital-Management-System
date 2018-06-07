package fcih_hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class myExceptions {

  static  String True = "accepted";

    public static String IsStrValid(String a,String b,String c) {
        if ((!a.matches("[a-zA-Z]*")) || a == null||(!b.matches("[a-zA-Z]*")) || b == null||(!c.matches("[a-zA-Z]*")) || c == null) {
            return "Error Name Must Be Only Characters Or It Contain Spaces";
        }
        if (a.length() > 12||b.length() > 12||c.length() > 12) {
            return "Error Name Number of Characters Must N't Exceed 12 Characters";
        }
      

        return null;
    }

    public static String IsAgeValid(String I) {
        int Item = 0;
        try{
         Item = Integer.parseInt(I);
          if (!(Item > 0 && Item < 101)) {
            if (Integer.toString(Item).contains(" ")) {
                return "Error Age Contains spaces";
            }
            return " (^_^) Age must not exceed 100 year \nand Mustn't Be less than 1 (ربنا يديك الصحة )";
        }
        }catch(Exception e){
        return  "Error Age Must Be Only Numbers";
        }
       
        
        return null;
    }

    public static String IsAddressValid(String Item) {
        if ((!Item.matches("[a-zA-Z]*")) || Item == null) {
            if (Item.length() > 16) {
                return "Error Address number of characters must not exceed 16 characters";
            }
            if (Item.length() < 6) {
                return "Address number of characters must not exceed 16 "+"\n"+"characters and must not be less than 6";
            }
         
            return "Error it must be only characters or it Contain spaces";
        }
        if (Item.length() == 0) {
            return "You entered no thing";
        }
        return null;
    }

    public static String IsValidPhone(String Item) {
        if (!(Item.matches("[0-9]*") && (Item.length() > 5 && Item.length() < 13)) || Item == null) {
            if (Item.contains(" ")) {
                return "Error PhoneNumber  Contains spaces";
            }
            return "Error Phone Number must not exceed 12 characters"+"\n"+" and must not be less than 6";
        }
        return null;
    }

    public  static String IsHieghtValid(String I) {
         int Item = 0;
        try{
            Item = Integer.parseInt(I);
        if (!(Item > 49 && Item < 220)) {
            if (Float.toString(Item).contains(" ")) {
                return "Error Hieght Contains spaces";
            }
            return "Error Hieght must not exceed 220cm characters and must not be less than 50cm";
        }}catch(Exception e){
        return  "Error Hieght Must Be Only Numbers";
        }
        return null;
    }

    public static String IsWieghtValid(String I) {
        int Item = 0;
        try{
            Item = Integer.parseInt(I);
        if (!(Item > 4 && Item < 151)) {
            if (Float.toString(Item).contains(" ")) {
                return "Error Wieght Contains spaces";
            }
            return "Error wieght must not exceed 150kg characters and must not be less than 5kg";
         }}catch(Exception e){
        return  "Error Wight Must Be Only Numbers";
        }
        return null;
    }

    public boolean IsHealthProblemsValid(String Item) {
        if (!(Item.equals("s") || Item.equals("S") || Item.equals("Gastrointestinalpain") || Item.equals("BreakingBones") || Item.equals("EyePain") || Item.equals("SeriousInjury") || Item.equals("NervousTension") || Item.equals("Pregnancy"))) {
            return false;
        } else {
            return true;
        }
    }

    public  static int isValidDate(String value) {
        Date cdate = new Date();
        SimpleDateFormat cdf = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = cdf.format(cdate);
        Date date = null;
        String[] arr = new String[3];
        String[] current_date = new String[3];
        current_date = strDate.split("/");
        int d, m, y, currentDay, currentMonth, currentYear;

        arr = value.split("/");
        try {

            date = cdf.parse(value);
            currentDay = Integer.parseInt(current_date[0]);
            currentMonth = Integer.parseInt(current_date[1]);
            currentYear = Integer.parseInt(current_date[2]);
            d = Integer.parseInt(arr[0]);
            m = Integer.parseInt(arr[1]);
            y = Integer.parseInt(arr[2]);
            if (value.equals(cdf.format(date)) && value.length() < 12) {
                if (((d > currentDay && d < 31) || d == currentDay) && m == currentMonth && (y == currentYear)) {
                    return 1;
                } else if ((d < 31) && ((m == currentMonth + 1) || m == 1) && (y == currentYear + 1)) {
                    return 2;
                } else if (d < 31 && (m == (currentMonth + 2) || m == 2) && (y == currentYear + 1)) {
                    return 3;
                }
            }
        } catch (ParseException ex) {

        }
        return -1;
    }

}
