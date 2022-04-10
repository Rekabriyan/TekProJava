
package DynamicPolimorphism;

public class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String agrs[]){
        Animal obj = new Cat();
        obj.sound();
    }
    
}
   