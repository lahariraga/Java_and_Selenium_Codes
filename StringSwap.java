package practice;

public class StringSwap {

	public static void main(String[] args) {
        String a="Love";
        String b="Me";
        a=a+b;
        
        b = a.substring(0,a.length()-b.length());  
       System.out.println(a.length());
       System.out.println(b.length());
        System.out.println(a.length()-b.length());
       System.out.println(a.substring(0,a.length()-b.length()));
        a = a.substring(b.length());
        System.out.println("After swapping:" +a +" " +b); 
	}}