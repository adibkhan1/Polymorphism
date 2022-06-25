import java.util.*;

class NetBallPlayer{

    private int JerseryNumber;

    public  void PrintMessage(){
        System.out.println("I am good netball player");
    }
}

class ProfNetBallPlayer extends NetBallPlayer{

    private double salary;

    public void PrintMessage(){
        System.out.println("Greatest Netball Player");
    }
}

class Test{
    public static void main(String[] args) {
        NetBallPlayer Nb1= new ProfNetBallPlayer();
         Nb1.PrintMessage();
    }
}