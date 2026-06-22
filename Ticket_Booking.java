import java.util.Scanner;
public class Ticket_Booking {
    static String Seats[][]=new String[9][6];
    static void View()
    {
        System.out.println();
        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                System.out.print(Seats[i][j]+"  ");
            }    
            System.out.println("\n");
        }
        Scanner get = new Scanner(System.in);
        System.out.print("Want to book tickets:");
        String choice = get.nextLine();
        if(choice.equals("Yes"))
        {
            Booking();
        }
        else
        {
            System.out.println("Thanks for your Visit.");
        }
    }
    static void Booking()
    {
        Scanner get = new Scanner(System.in);
        System.out.print("Select your row(1-9):");
        int T_row=get.nextInt();
        T_row-=1;
        System.out.print("Select your seat(1-6):");
        int T_col=get.nextInt();
        T_col-=1;
        if(Seats[T_row][T_col]=="Available")
        {
            Seats[T_row][T_col]=" Booked  ";
            System.out.println("Your Tickets Booked.");
        }
        else
        {
            System.out.println("Seat is not Available.");
        }
        View();
    }
    Ticket_Booking()
    {
        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                Seats[i][j]="Available";
            }    
        }
    }
    public static void main(String[] args) 
    {
        Ticket_Booking Gurunatha= new Ticket_Booking();
        Scanner get = new Scanner(System.in);
        System.out.print("Want to Book Movie Tickets: ");
        String choice=get.nextLine();
        if(choice.equals("Yes")) {
            
         Booking();
        }
        else{
            System.out.println("Thanks for your Visit"); 
        } 
    }
}


/*import java.util.Scanner;
public class Ticket_Booking {
    static String Seats[][]=new String[9][6];
    static void view(){
        for(int i=0;i<9;i++){
            for(int j=0;j<6;j++){
                System.out.print(Seats[i][j]+"  ");
            }
            System.out.print(" \n");
        }
    }
    static void Booking(int T_row,int T_col)
    {
        if(Seats[T_row][T_col]=="Available"){
            Seats[T_row][T_col]="Booked   ";
            System.out.println("your booking is complete");
        }
        else{
            System.out.println("seats are not avvailable");
        }
        view();
        
    }
    Ticket_Booking(){
        for(int i=0;i<9;i++){
            for(int j=0;j<6;j++){
                Seats[i][j]="Available";
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Ticket_Booking Mahal=new Ticket_Booking();
        Scanner sc=new Scanner(System.in);
        System.out.println("select row(0-8):");
        int row=sc.nextInt();
        System.out.println("select col(0-5):");
        int seat=sc.nextInt();
        Booking(row-1,seat-1);
        

    }
}*/
