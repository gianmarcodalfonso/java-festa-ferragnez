package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
  public static void main(String[] args) {
    String[] invitedList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

  Scanner scanner = new Scanner(System.in);

  // nome utente
  System.out.println("Scrivi il tuo nome");
  String userName = scanner.nextLine();
  boolean isInvited = false;

  for(int i = 0; i < invitedList.length; i++){
    if(invitedList[i].toLowerCase() == userName.toLowerCase()){
      isInvited = true;
    }
  }

  if(isInvited == true){
    System.out.println("Guest accepted!");
  }
  else{
    System.out.println("Go back home!");
  }

}
}
