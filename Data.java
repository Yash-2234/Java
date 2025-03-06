//This code is of prameterized constructor 

/*public class Data {
    private String name;
    public Data(String n){
        System.out.println(" This is Parameterized constructor");
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public static void main(String [] args){
       Data d = new Data ( "   Yash");
       System.out.println(d.getName());
    }
}*/

public class Data{
String model;
int year;

public Data(String model,int year){
    this.model=model;
    this.year=year;
 }

 public static void main (String[]args) {
    Data myCar = new Data("BMW",2025);
    System.out.println("Car Model:"+ myCar.model);
    System.out.println("Manufacturing Year:"+ myCar.year);
 }
}