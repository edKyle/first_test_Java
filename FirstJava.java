import java.io.Console;
 
public class FirstJava{
  
    public static void main(String[] argv) {
        System.out.print(PezDispenser.AGE + "\n");
        Console console = System.console();
        // Welcome to the Introductions program!  Your code goes below here
      
        String firstName = console.readLine("what is your name?? ");

        if (firstName.equalsIgnoreCase("kyle")){
            firstName = "change yes";
        	console.printf("this is kyle, %s\n", firstName);
        }else{
        	console.printf("what the who are U?\n");
        }
        System.out.println("the other way to print");

        //class test
        PezDispenser dispenser = new PezDispenser();
        System.out.printf("%s and age is %d\n", dispenser.abc("方法"), dispenser.AGE);

        //Array
        int[] money = new int[2];
        money[0] = 50;
        money[1] = 50;

        for(int m : money){
             System.out.printf("%d\n", m);
        }
    }       
}
 