class Animal{
    void sounds(){
         System.out.println("Animals lives on earth");
    }
}
class Dog extends Animal{
    void sounds(){
        System.out.println("Dogs Barks");
    }
    
}
public class Test{
    public static void main(String[] args){
        Animal obj = new Dog();
        obj.sounds();
    }
}
