import java.util.*;public class switched{
    public static void main(String[] args) {
       {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("welcome to my program");
        System.out.println("press 1 for pen, 2 for book, 3 for box, 4 for bag, 5 for pencil");
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("you selected pen ");
                break;
            case 2:
                System.out.println("you selected book ");
                break;    
            case 3:
                System.out.println("you selected box");
                break;
            case 4:
                System.out.println("you selected bag ");
                break;    
            case 5:
                System.out.println("you selected pencil ");
                break;        
        
            default:
            System.out.println("not found");
                break;
           
        }
           
       
      
        }




    }
    
}
