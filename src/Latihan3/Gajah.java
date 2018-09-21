
package Latihan3;

public class Gajah extends Hewan {
    public static void testClassMethod(){
        System.out.println("The class Method in Hewan...");
    }
    //meng-overwrite method pada class Animal
    public void testInstanceMethod(){
        System.out.println("The Instance method in Gajah...");
    }
    public static void main (String[] args){
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
        
    }
    
}
