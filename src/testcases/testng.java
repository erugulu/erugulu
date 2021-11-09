package testcases;

import org.testng.annotations.Test;

public class testng {
    @Test(priority = 1)
     void  testme(){
        System.out.println("hii");
    }
    @Test(priority = 2)
     void setup(){
         System.out.println("inside set up");
     }
     @Test(priority = 3)
      void tecah(){
          System.out.println(" this is teaching");

      }
}
