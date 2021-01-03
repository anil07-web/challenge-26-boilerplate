import java.util.Scanner;
public class Challenge26{
    public static void main(String[] args) {
        customer_details obj = new customer_details();
        obj.enter_Details();
        obj.show_Details();    
    }
}
class customer_details{
    int n;
    String firstname[] = new String[100];
    String lastname[] = new String[100];
    int age[] = new int[100];
    String aadhaar[] = new String[100];
    String address[] = new String[100];
    String phno[] = new String[100];
    int custid[] = new int[100];
    Scanner obj = new Scanner(System.in);
    Scanner obj1 = new Scanner(System.in);
    public void enter_Details() {
        for (int i = 0; i <100; i++) {
        System.out.println("Enter the First name of customer");
        firstname[i]=obj.next();
        System.out.println("Enter the Last name of customer");
        lastname[i]=obj.next();
        System.out.println("Enter the Age of customer");
        age[i]=obj.nextInt();
        System.out.println("Enter the Aadhaar id of customer");
        aadhaar[i]=obj.next();
        System.out.println("Enter the Address of customer");
        address[i]=obj1.nextLine();
        System.out.println("Enter the Phone number of customer");
        phno[i]=obj.next();
        custid[i]=i+1;
        System.out.println("Do you want to continue (y/n)");
        char c = obj.next().charAt(0);
        if(c=='y' || c=='Y')
        continue;
        else{
        n=i;    
        break;
        }
        }
    }
    public void show_Details(){
         System.out.println();
         System.out.println("Details of customer by last name, Enter the last name");
         String entlast=obj.next();
         for(int i=0;i<n+1;i++){
         if(entlast.equalsIgnoreCase(lastname[i]))
         {
          System.out.println();   
          System.out.println("**CUSTOMER DETAILS**");          
          System.out.println("CUSTOMER ID: "+custid[i]);
          System.out.println("Name: "+firstname[i]+" "+lastname[i]);
          System.out.println("Age: "+age[i]);
          System.out.println("Address: "+address[i]);
          System.out.println("Phone no.  +91"+phno[i]);
          System.out.println("Aadhaar id: "+aadhaar[i]);
         }
        }
        int index[]=new int[100];
        int k=0;
        System.out.println();
        System.out.println("********A list of customers belonging to a particular taluk or village********");
        System.out.println();
        for(int i=0;i<n+1;i++){
            for(int l=0;l<k;l++){
            if(i==index[l]){
            i++;
            break;
            }
            }
            System.out.println("**"+address[i]+"**");
            for (int j = i; j < n+1; j++){
            if(address[i].equalsIgnoreCase(address[j])){   
             System.out.println("CUSTOMER DETAILS");          
             System.out.println("CUSTOMER ID      Name");
             System.out.println(+custid[j]+"                "+firstname[j]+" "+lastname[j]);
             System.out.println();
             index[k]=j;
             k++;
             }
            }
        }
    }
}