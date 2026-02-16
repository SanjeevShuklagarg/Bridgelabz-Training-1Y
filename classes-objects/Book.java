class Book {
public String i;
protected String t;
private String a;

public void setA(String x){
a=x;
}

public String getA(){
return a;
}
}

class EBook extends Book {
void show(){
System.out.println(i);
System.out.println(t);
}
}

class Test2 {
public static void main(String[] args){
EBook b=new EBook();
b.i="123";
b.t="Java";
b.setA("Tom");
b.show();
System.out.println(b.getA());
}
}
