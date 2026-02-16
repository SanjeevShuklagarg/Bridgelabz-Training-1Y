class Product {
String n;
double p;
static int t = 0;

Product(String n,double p){
this.n=n;
this.p=p;
t++;
}

void displayProductDetails(){
System.out.println("Name: "+n);
System.out.println("Price: "+p);
}

static void displayTotalProducts(){
System.out.println("Total Products: "+t);
}

public static void main(String[] args){
Product a=new Product("Pen",10);
Product b=new Product("Book",50);
a.displayProductDetails();
b.displayProductDetails();
Product.displayTotalProducts();
}
}
