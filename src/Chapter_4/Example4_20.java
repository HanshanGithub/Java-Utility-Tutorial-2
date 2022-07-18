package Chapter_4;
public class Example4_20 { 
   public static void main(String args[ ]) { 
      char a[]={'a','b','c','D','E','F'};
      for(int i=0;i<a.length;i++) { 
         if(Character.isLowerCase(a[i]))    
             a[i]=Character.toUpperCase(a[i]);
         else if(Character.isUpperCase(a[i]))
             a[i]=Character.toLowerCase(a[i]);
       }
      for(char c:a)
    	  System.out.print(" "+c);
      /*for(int i=0;i<a.length;i++)   
          System.out.print(" "+a[i]);*/
      
      /*System.out.println("\n--------此法不行------------");
      char A[] = a;
      for(char c:A) {
          if(Character.isLowerCase(c))    
              c=Character.toUpperCase(c);
          else if(Character.isUpperCase(c))
              c=Character.toLowerCase(c);
      }
      for(int i=0;i<A.length;i++)   
         System.out.print(" "+A[i]);*/
 
   } 
}




