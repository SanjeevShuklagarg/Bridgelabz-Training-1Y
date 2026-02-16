class Course {
String n;
int d;
double f;
static String i="ABC Institute";

Course(String n,int d,double f){
this.n=n;
this.d=d;
this.f=f;
}

void displayCourseDetails(){
System.out.println("Course: "+n);
System.out.println("Duration: "+d);
System.out.println("Fee: "+f);
System.out.println("Institute: "+i);
}

static void updateInstituteName(String x){
i=x;
}

public static void main(String[] args){
Course a=new Course("Java",3,5000);
a.displayCourseDetails();
Course.updateInstituteName("XYZ Institute");
a.displayCourseDetails();
}
}
