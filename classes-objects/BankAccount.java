class BankAccount {
public int a;
protected String h;
private double b;

public void setB(double x){
b=x;
}

public double getB(){
return b;
}
}

class SavingsAccount extends BankAccount {
void show(){
System.out.println(a);
System.out.println(h);
}
}

class Test3 {
public static void main(String[] args){
SavingsAccount s=new SavingsAccount();
s.a=101;
s.h="Raj";
s.setB(5000);
s.show();
System.out.println(s.getB());
}
}
