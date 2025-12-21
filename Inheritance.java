class Car
{
    String color ="RED";
    String tyres="MRF";
    public void startEngine()
    {
        System.out.println("ENGINE TURNED ON");
    }
}
class SportsCar extends Car
{
  String price="1 crore";
  public void turboMode()
  {
    System.out.println("TURBOMODE ACTIVATED");
  }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        SportsCar obj=new SportsCar();
        System.out.println("COLOR OF THE SPORTS CAR IS : "+ obj.color);
        System.out.println("TYRE OF THE SPORTS CAR IS : "+ obj.tyres);
        System.out.println("PRICE OF THE SPORTS CAR IS : "+ obj.price);
        obj.startEngine();
        obj.turboMode();
    }}
/*
1. Car is the parent class.
2. It has common properties like color,tyres and a method startEngine().
3. SportsCar is the child class.
4. SportsCar also has its own property price and a method turboMode().
5. SportsCar inherits color, tyres and startEngine() from Car.
6. This reuse of parent class properties is called Inheritance.
*/
