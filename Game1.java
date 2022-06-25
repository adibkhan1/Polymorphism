public class Game1 {
    private int count;

    public void PrintRule(){
        System.out.println("Count ur turn "+ count);
    }
}

class ProfGame1 extends Game1{
    double salary;
    public void PrintMessage(){
        System.out.println("Start game");
    }
}

abstract class Nothing{
    abstract public void Show();
    protected void testing(); // since not abstract method it should have body "{}"
   
     public static void main(String[] args) {
         Nothing n1= new Nothing(); // abstract class cannot be initiated
         n1.Show();
     }
}