/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
/**
 *
 * @author johnt
 */
public class TestUserprofile {
    public static void main(String[] args)
    {
        int userCount=0;//keep track of number of users for array
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your desired user name:");
        String userName = sc.nextLine();
               
            System.out.println("Please Select your favourite Genre.");
            System.out.println("Action, Adventure, Drama, Comedy,");            
            String genre = sc.nextLine();
            
        
        UserID newUserID = new UserID(userName, genre);
        users[userCount] = newUser;//add the new user to the user list
        userCount++;
        System.out.println("New User Added");
        System.out.println("UserName: " + userID);
        System.out.println("Genre: " + genre);

    }//end run method        
    
}
