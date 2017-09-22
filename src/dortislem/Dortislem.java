/*
Bu program 4 işlem yapan metodlar içermektededir.


 */
package dortislem;

/**
 *
 * @author OGR-4
 */
public class Dortislem {

    /**
     * @param args the command line arguments
     */
  
        public  static void Toplama(int a, int b){
            int c = a+b;
	  System.out.println("a+b = " +c);
			
	}
         public  static void Çıkarma(int a, int b){
            int c = a-b;
	
            System.out.println("a-b = "+c);
          }
         public  static void Carpma(int a, int b){
            int c =a*b;
	
            System.out.println("a*b = "+c);
          }
        public  static void Bölme(int a, int b){
            int c = a/b;
	
            System.out.println("a/b = "+c);
          }
    public static void main(String[] args) {
        
        Toplama(5,6);
        Çıkarma(89,6);
        
        Bölme(95,5);
        Carpma(95,6);

    }
    
    
}
