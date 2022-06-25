import java.util.*;

class TypeCast{


   public static void main(String[] args) {
      Parent p= new Child();
      if(p instanceof Child){
        Child C= (Child)p;    //  p is parent object which is type casted to Child referring 
                              // variable C.
        System.out.println("Type Casting is done");
      }
      else{
         System.out.println("Type casting not done");
      }
      //System.out.println(p instanceof Child );


//----------------------- For Parent referring variables-----------------//


      if(p instanceof Parent){
         Child D= (Child)p;    // p is instance of both Parent and Child
         System.out.println("Type Casting is done");
       }
       else{
          System.out.println("Type casting not done");
       }
//---------------------------------Upcasting and Downcasting-----------------------------//
         Parent p2 = new Parent();
       if(p2 instanceof Child){
         Parent D= (Child)p2;   // You can only Upcast(or convert within same class type) but not Downcast
         System.out.println("Type Casting is done");
       }
       else{
          System.out.println("Type casting not done");
       }
   }

}

class Parent{}

class Child extends Parent{}