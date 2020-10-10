public class Employee{
  String name,city;
  int age;
  public void display(){
     System.out.println("The name is "+ name);
     System.out.println("The city is "+ city);
     System.out.println("The age is "+ age);
  }
  public static void main(String[] args){
    Employee e1=new Employee();
    Employee e2=new Employee();
    e1.name="thor";
    e1.city="asgard";
    e1.age=20;
    e2.name="stark";
    e2.city="Jaipurr";
    e2.age=15;
    e1.display();
    e2.display();
   
  }

}