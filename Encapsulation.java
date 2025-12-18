class Car{
    private String carName;
    private int mileage;
    private String color;
        
    public void setData(String x,int y,String z){
       carName=x;
       mileage=y;
       color=z;
    }
    
    public String getCarName(){
        return carName;
    }
    public int getMileage(){
        return mileage;
    }
    public String getColor(){
        return color;
    }
}
public class Encapsulation{
    public static void main(String[] args){
        Car c=new Car();
        c.setData("BMW",128,"Blue");
        System.out.println("The Car Name:"+c.getCarName());
        System.out.println("the Car Mileage:"+c.getMileage());
        System.out.println("The Car Color:"+c.getColor());
    }
}