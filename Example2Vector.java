import java.util.*;
class CarVector
{
  private String carName;
  private String carColor;
  public CarVector(String carName,String carColor)
  {
    super();
    this.car Name=carName;
    this.carColor=carColor;  
  }
  public String getCarName()
  {
    return carName;
  }
  public String getCarColor()
  {
    return carColor;
  }
  @Override
  public String toString()
  {
    return "CarVector[carName="+carName+",carColor="+carColor+"]";
  }
}
public class Example2Vector
{
  public static void main(String [] args)
  {
    CarVector cv1=new CarVector("BMW","Blue");
    CarVector cv2=new CarVector("Ferari","Black");
    Vector<CarVector> v=new Vector<CarVector>();
    v.add(cv1);
    v.add(cv2);
    for(Object i :v)
    {
       System.out.println(i);
    }

}
}