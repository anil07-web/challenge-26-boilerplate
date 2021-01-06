import java.util.Scanner;
class Customer{
   private String firstname;
   private String lastname;
   private int age;
   private String aadhaar;
   private String address;
   private long phno;
   private  static int id=0;
   private int customerid;
   private String village;
   Scanner sc = new Scanner(System.in);
   public Customer(String fname,String lname,int age,String aadhaar,String address,long phno,String vill ){
     id++;
     this.customerid=id;
     this.firstname=fname;
     this.lastname=lname;
     this.age=age;
     this.aadhaar=aadhaar;
     this.address=address;
     this.phno=phno;
     this.village=vill;
   }
   public String getfname(){
     return firstname;
   }
   public String getlname(){
    return lastname;
   }
   public int getage(){
    return age;
   }
   public String getaadhar(){
    return aadhaar;
   }
   public String getaddress(){
    return address;
   }
   public long getphno(){
    return phno;
   }
   public int getid(){
    return customerid;
   }
   public String getvillage(){
    return village;
  }
  public static long count(long n) {
  if(n==0)
  return 0;
  return 1+count(n/10);
  }
 
  public void byLastName(String entlast,int id,String fname,String lname,int age,String aadhaar,String address,long phno,String vill ) {
  if(entlast.equalsIgnoreCase(lname))
  {
   System.out.println();   
   System.out.println("**CUSTOMER DETAILS**");          
   System.out.println("CUSTOMER ID: "+id);
   System.out.println("Name: "+fname+" "+lname);
   System.out.println("Age: "+age);
   System.out.println("Address: "+address);
   System.out.println("Phone no.  +91"+phno);
   System.out.println("Aadhaar id: "+aadhaar);
   System.out.println("village : "+village);
  }
  }
  public void byVillageName(String myvillage,int id,String fname,String lname,int age,String aadhaar,String address,long phno,String vill ) {
  if(myvillage.equalsIgnoreCase(vill))
  {           
   System.out.println(+id+"                "+fname+" "+lname);
  }
  }
}

class Challenge26{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    Scanner obj1 = new Scanner(System.in);
    char ch;
    int n=0;
    Customer[] object = new Customer[100];
		do{
        System.out.println("Enter the First name of customer");
        String a=obj.next();
        System.out.println("Enter the Last name of customer");
        String b=obj.next();
        System.out.println("Enter the Age of customer");
        int c=obj.nextInt();
        System.out.println("Enter the Aadhaar id of customer");
        String d=obj.next();
        System.out.println("Enter the Address of customer");
        String e=obj1.nextLine();
        int k=0;
        do{ 
        System.out.println("Enter the Phone number of customer");
        long f=obj.nextLong();   
        if(Customer.count(f)==10){
        System.out.println("Enter the Village of customer"); 
        String g=obj1.nextLine();
        object[n] = new Customer(a,b,c,d,e,f,g);
        k=0;
        }
        else{
        System.out.println("Please enter 10 digits number only\n");
        k=1;
        }
        }while(k==1);
        n++;
        System.out.println("Do you want to Add Customer (y/n)");
        ch = obj.next().charAt(0);
        }while( ch == 'y' || ch =='Y');
        System.out.println("Details of customer by last name, Enter the last name :");
        String entlast=obj.next();
        for(int i=0;i<n;i++)
        object[i].byLastName(entlast,object[i].getid(),object[i].getfname(),object[i].getlname(),object[i].getage(),object[i].getaadhar(),object[i].getaddress(),object[i].getphno(),object[i].getvillage());
        System.out.println();
        System.out.println("******A list of customers belonging to a particular taluk or village******");
        System.out.println("Enter Village Name :");
        String myvillage = obj.next();
        System.out.println("**CUSTOMER LIST**");
        System.out.println();
        System.out.println("CUSTOMER ID      Name");
        for(int i=0;i<n;i++)
        object[i].byVillageName(myvillage,object[i].getid(),object[i].getfname(),object[i].getlname(),object[i].getage(),object[i].getaadhar(),object[i].getaddress(),object[i].getphno(),object[i].getvillage());
  }
}





