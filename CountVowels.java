package practice;

public class CountVowels {

	public static void main(String[] args) {
    String str="Ragakadimisetty";
    int vCount=0;
    int cCount=0;
    str=str.toLowerCase();
    int len= str.length();
    for(int j=0;j<len;j++)
    {
    	if(str.charAt(j)=='a' || str.charAt(j)=='e'|| str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u')
    		vCount++;
    	else if(str.charAt(j)>='a' && str.charAt(j)<='z')
    	{
    		cCount++;
    	}}
    	System.out.println("Number of vowels are " +vCount);
    	System.out.println("Number of consonants are " +cCount);
    		
    }
  
}