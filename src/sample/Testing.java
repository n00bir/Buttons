package sample;
import java.util.*;
public class Testing {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please set the hour, first start with the hour, then minute and then second");


        int tanswer = keyboard.nextInt();
        int manswer = keyboard.nextInt();
        int sanswer = keyboard.nextInt();


        Message MessageObject = new Message();
        MessageObject.setTime(tanswer, manswer, sanswer);
        System.out.println(MessageObject.toMilitary());

    }
}


