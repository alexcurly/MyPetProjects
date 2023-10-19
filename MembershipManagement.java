package javaproject;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

final private Scanner reader = new Scanner(System.in);

public class MembershipManagemen {
  private int getIntInput() {
    int choice = 0;

    

    while (choice == 0){
      try{
        //System.out.println("Input a number, please");
        choice = reader.nextInt();

        if(choice == 0) throw new InputMismatchException();

        reader.nextLine(); // куда данный метод будет сохранять введенные данные ? 
        
        
      }catch(InputMismatchException e){
        System.out.println("Inputed number was wrong. Please, do it again!");
        
      }
    }
  }
}
