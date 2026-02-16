class Employee {
public int e;
protected String d;
private double s;

public void setS(double x){
s=x;
}

public double getS(){
return s;
}
}

class Manager extends Employee {
void show(){
System.out.println(e);
System.out.println(d);
}
}

class Test4 {
public static void main(String[] args){
Manager m=new Manager();
m.e=10;
m.d="HR";
m.setS(60000);
m.show();
System.out.println(m.getS());
}
}
