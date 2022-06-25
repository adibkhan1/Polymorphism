public abstract class Card {
    private String recipient;
 
    public Card(String r ){
        recipient=r;
    }
    public Card(){}

    public void setRecipient(String r){
        recipient=r;
    }

    public String GetRecipient(){
        return recipient;
    }

    public abstract void greeting();
}

class KadRaya extends Card{

    public KadRaya(String r){
        setRecipient(r);
    }
    public void greeting(){
        System.out.println("Selamat Hari Raya "+GetRecipient());
    }
}

class Birthday extends Card{
    int age;

    public Birthday(String r, int yr){
        setRecipient(r);
        age=yr;
    }
    public void greeting(){
        System.out.println("Happy Birthday "+GetRecipient());
    }
}

class Wedding extends Card{

    public Wedding(String r){
         setRecipient(r);
    }

    public void greeting(){
        System.out.println("Rest in peace "+ GetRecipient());
    }

}

class CardTester{
    public static void main(String[] args) {
        KadRaya K1=new KadRaya("Shadman");
        Birthday B1 =new Birthday("Rahman", 18);
        Wedding W1= new Wedding("Shadman");

        K1.greeting();
        B1.greeting();
        W1.greeting();
    }
}