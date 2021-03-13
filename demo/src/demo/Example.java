package demo;

public class Example {  
	  
    private static  String inputString = "123.33";   
    
    public static void main(String[] args) {  
        try {  
                 int a = Integer.parseInt(inputString);  
        }catch(NumberFormatException ex){  
           System.out.println(ex);
            //request for well-formatted string  
        }  
            }  
}  