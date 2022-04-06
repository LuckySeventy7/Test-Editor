
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio
 */
public class TextFile {
    static String name;
    static String text;
    public TextFile(String name, String text) {
        this.name= name;
        this.text=text;
    }
    public TextFile(String text) {
        
        this.text=text;
    }
    static public String getText(){
        return text;
    }
    static public String getName(){
        return name;
    }
    public void setText(String text){
        this.text=text;
    }
    public void setName(String name){
        this.name= name;
    }
    static public void saveFile(){
         try {
            
            System.out.println("syc2");
            
            
            FileWriter writeFile = new FileWriter(name); 
          
           // writeFile.write(MainFrame.stringTextBox());
            writeFile.write(TextFile.getText());
            writeFile.close();
            TextFile.name=name;
            System.out.println("3h");
        }catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }        
        
    }
    static public void OpenFile(){
          try {
            String n=name;
            File file =  new File(n);
            Scanner scan = new Scanner(file);
            String t="";
            while(scan.hasNext()){
                t = scan.nextLine();

            }
            //textBox.setText(t);
        }catch (IOException e) {
        System.out.println("An error occurred.");
      
        }
    }
}
