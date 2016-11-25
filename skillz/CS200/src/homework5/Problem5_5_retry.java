package homework5;

public class Problem5_5_retry {

   public static void main(String[] args) {
      
      System.out.println("Kilograms\tPounds\t\t|\tPounds\tKilograms");
      int kg_left = 1; int lb_right = 20;
      float lb_left = 0.0f; float kg_right = 0.0f;
      while(kg_left < 200) {
         lb_left = (kg_left * 2.2f);
         kg_right = (lb_right / 2.2f);
         System.out.println(kg_left + "\t\t" + lb_left + "\t\t|\t" + lb_right + "\t" + kg_right);
         kg_left+=2; lb_right+=5;
      }
      
      // using for loop
      
      for (kg_left = 1, lb_right = 20; kg_left < 200; kg_left+=2, lb_right+=5) {
      }
   }
}