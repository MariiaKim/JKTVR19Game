/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19game;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        
        System.out.println("privet,poigraem?");
        Random random = new Random();
        int myNumber = random.nextInt(5-0+1)+0;
        System.out.println("ugaday chislo 0-5");
        Scanner scanner = new Scanner(System.in);
        String gamerNumberStr = null;
        int gamerNumber = -1;
        int attempt = 0;
        do{
        try {
           gamerNumberStr = scanner.nextLine();
           gamerNumber = Integer.parseInt(gamerNumberStr);
        } catch (NumberFormatException e) {
            System.out.println("nepravelniy vvod"); 
            System.exit(0);
        }
        
        
                
        if(myNumber == gamerNumber){
            System.out.println("viigral");
            break;
        }else{
            if(attempt < 2){
           System.out.println("nepravilno echo"); 
        }else{
        System.out.println("proigral zadumanno chislo:"+myNumber); 
        break;
    }
        attempt++;
    
}
        }while (true);
        System.out.println("---konec----");
    }
}
