class Student {
public int r;
protected String n;
private double c;

public void setC(double x){
c=x;
}

public double getC(){
return c;
}
}

class PostgraduateStudent extends Student {
void show(){
System.out.println(r);
System.out.println(n);
}
}

class Test1 {
public static void main(String[] args){
PostgraduateStudent a=new PostgraduateStudent();
a.r=1;
a.n="Sam";
a.setC(8.5);
a.show();
System.out.println(a.getC());
}
}
