
public class DecimalToOctal {
   public int convert(int decimal) {
      int pow = 0;
      int digits = 0;
      int octal = 0;
      while((Math.pow(8, pow)) < decimal){
         pow++;
         digits++;
      }
      for(int i=0;i<digits;digits--) {
         octal += decimal/Math.pow(8, pow)*(digits*10);
         octal /= 8;
      }
      return octal;
   }
   public static void main(String[] args) {
      DecimalToOctal a = new DecimalToOctal();
      System.out.println(a.convert(32));
   }
}
