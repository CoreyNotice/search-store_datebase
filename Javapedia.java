import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        int figures=scan.nextInt();
        
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
            String [][] database=new String[figures][3];      
        //Watch out for the nextLine() pitfall. 
        scan.nextLine();
        for (int i=0;i<database.length;i++) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            //pick up and store figure's name.   
             database[i][0]=scan.nextLine();
            System.out.print("\t - Date of birth: ");
            //pick up and store figure's birthday.
            database[i][1]=scan.nextLine();

            System.out.print("\t - Occupation: ");
            //pick up and store figure's occupation. 
            database[i][2]=scan.nextLine();
            System.out.print("\n");

        }
        
    
        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 

        System.out.print("\nWho do you want information on? ");  
        String who=scan.nextLine();
         
        for(int i=0;i<database.length;i++){
        if(database[i][0].equals(who)){
            System.out.println("\tName: "+ database[i][0]);
            System.out.println("\tDate of birth: "+ database[i][1]);
            System.out.println("\tOccupation: "+ database[i][2]);
        }
    }
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        

        scan.close();
    }
      
    public static void print2DArray(String[][] database){
       for(int i=0;i<database.length;i++){
        for(int j=0;j<database[i].length;j++){
            System.out.print(database[i][j]+" ");
        }
        System.out.print("\n");
       }
    }
  
}
