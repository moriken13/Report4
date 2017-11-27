//package jp.ac.uryukyu.ie.e175713;

public class Main {
    public static void main (String[] args){
        try{
            String str = "3．14";
            Double value = Double.parseDouble(str);   
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生。");
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }     
    }
}