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
    return choice;
  }
  
  private void printClubOptins(){
    System.out.println("\n1) Club Mercury");
    System.out.prntln("2) Club Neptune");
    System.out.prntln("3) Club Jupiter");
    System.out.prntln("4) Multi Clubs");
  }

  public int getChoice(){
    int choice;
    System.out.println("nWELCOME TO OZON FITNESS CENTER");
    System.out.println("=====================");
    System.out.println("1) Add Member");
    System.out.println("2) Remove Member");
    System.out.println("3) Display Member Information");
    System.out.println("\nPlease select an option (or Enter -1 to quit): ");

    choice = getIntInput();
    return choice;    
  }
  

  public String add
  
}
