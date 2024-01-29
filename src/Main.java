import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
       // JOptionPane.showMessageDialog(null,"Hello world");
        //int blah = JOptionPane.showConfirmDialog(null,"Are they done?");
        //System.out.println(blah);
        //if (blah ==0){
        //    JOptionPane.showMessageDialog(null,"Okay");
        //}
        String slimShady = JOptionPane.showInputDialog(null, "What is your name?");
        System.out.println(slimShady);
        int x = 0;
        while(x==0){
        String agg = JOptionPane.showInputDialog(null, "what is your age?");
            try {
                int age = Integer.parseInt(agg);
                JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
                x=1;
            } catch (Exception pony) {
                JOptionPane.showMessageDialog(null, "try again");
            }
        }
    }
}