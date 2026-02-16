class Vehicle {
String o;
String v;
static double r=1000;

Vehicle(String o,String v){
this.o=o;
this.v=v;
}

void displayVehicleDetails(){
System.out.println("Owner: "+o);
System.out.println("Type: "+v);
System.out.println("Fee: "+r);
}

static void updateRegistrationFee(double x){
r=x;
}

public static void main(String[] args){
Vehicle a=new Vehicle("Ram","Car");
a.displayVehicleDetails();
Vehicle.updateRegistrationFee(2000);
a.displayVehicleDetails();
}
}
