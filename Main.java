//package jp.ac.uryukyu.ie.e175713;

public class Main {
    public static void main (String[] args){
        try{
            String str = null;
        str.length();   
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生。");
            System.out.println(e.getMessage());
        }     
    }
}