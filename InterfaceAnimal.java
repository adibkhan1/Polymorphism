
 interface Speakable{
    public String Speak();
}

class Animal {
    protected String kind;

    public Animal(){}
    public String toString(){
        return "I am a "+kind+" and I go"+ ((Speakable)this).Speak();
    }
}

 class Cat extends Animal implements Speakable{
    public Cat(){
        kind="Cat";
    }
    public String Speak(){
        return "mewo";
    }
}

 class Cow extends Animal implements Speakable{
    public Cow(){
        kind="Cow";
    }
    public String Speak(){
        return "moo";
    }
}

class test{
    public static void main(String[] args) {
        Cat cat=new Cat();
        Cow cow= new Cow();

        cat.Speak();
        cow.Speak();
    }
}