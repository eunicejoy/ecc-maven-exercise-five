package com.mycompany.app;

import java.util.Scanner;
import org.apache.commons.collections4.*;
/**
 * Hello world!
 *
 */

public class App
{

    public static void main( String[] args ){

      Model model = new Model();
      Service service = new Service();
      Util util = new Util();

      int userChoice = 8;

      while(userChoice != 0){

          System.out.println("");

          System.out.print("Print\t\t[1]\nSearch\t\t[2]\nEdit\t\t[3]\nAdd New Row\t[4]\nSort\t\t[5]\nReset\t\t[6]\nExit\t\t[0]: ");

          Scanner scanInput = new Scanner(System.in);
          userChoice = scanInput.nextInt();

          switch(userChoice){
            case 1:
              model.print();
              break;
            case 2:
              service.search();
              break;
            case 3:
              service.edit();
              break;
            case 4:
              util.addNewRow();
              break;
            case 5:
              util.sortTable();
              break;
            case 6:
              model.reset();
              break;
            case 0:
              break;
            default:
              System.out.println("Invalid input.");

      }
    }
 }
}
