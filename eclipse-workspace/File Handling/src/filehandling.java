import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {

	public static void main(String[] args) {
		
		Boolean a=false;
		File f= new File("C:\\Users\\Vasudev\\eclipse-workspace\\File Handling\\Main");
		if(a==f.exists())
		{
			f.mkdir(); //created the main folder
		}
		
		System.out.println("Welcome to LockedMe");
	    System.out.println("Choose the operation that you want to perform:");
	    
	    //Displaying Operations
	    while(true) {
	    System.out.println("1.Retrieve the Files in the folder.");
	    System.out.println("2.Perform File operations.");
	    System.out.println("3.Exit the Application.");
	    
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the option....");
	    int n=sc.nextInt();
	    switch(n)
	    {
	    case 1: File a1[]= f.listFiles();
	            System.out.println("Files inside the Folder:" );
	             for(int i=0;i<a1.length;i++)
	            {
	            	System.out.println(a1[i]);
	            }
	             break;
	    case 2: while(true) {
	    	    System.out.println(" Choose any operation:");
	            System.out.println("1.Create a File or Folder."); 
	            System.out.println("2.Delete a File or Folder.");
  	            System.out.println("3.Search a File.");
  	            System.out.println("4.Go to previous option.");
	            Scanner sc1= new Scanner(System.in);
	            int n2=sc1.nextInt();
	            
	            switch(n2)
	            {
	            case 1: System.out.println("Create a new  1.File OR 2.Folder.");
	                    Scanner sc2=new Scanner(System.in);
	                    int n3=sc2.nextInt();
	                    if(n3==1)
	                    {   
	                    	System.out.println("Enter the File Name");
	                    	Scanner sc3=new Scanner(System.in);
	                    	String file= sc3.next();
	                    	file=file+".txt";
	                    	File f2= new File("C:\\Users\\Vasudev\\eclipse-workspace\\File Handling\\Main\\"+file);
	                    	try {
								f2.createNewFile();
							} catch (Exception e) {
								e.getMessage();
							}
	                    }
	                    	else
	                    	{   
	                    		System.out.println("Enter the Folder");
	                    		Scanner sc4=new Scanner(System.in);
	                    		String folder= sc4.nextLine();
	                    		File f3= new File("C:\\Users\\Vasudev\\eclipse-workspace\\File Handling\\Main\\"+folder);
	                    		f3.mkdir();
	                    	}
	                    break;
	            case 2: System.out.println("Delete a  1.File OR 2.Folder.");
	                    Scanner sc5=new Scanner(System.in);
                        int n4=sc5.nextInt();
                        if(n4==1)
                        {   
                	     System.out.println("Enter the File Name");
                	     Scanner sc3=new Scanner(System.in);
                	     String file= sc3.next();
                	     file=file+".txt";
                	     File f2= new File("C:\\Users\\Vasudev\\eclipse-workspace\\File Handling\\Main\\"+file);
                	     f2.delete();
                	     }
                	    else
                	   {   
                		System.out.println("Enter the Folder Name");
                		Scanner sc4=new Scanner(System.in);
                		String folder= sc4.nextLine();
                		File f3= new File("C:\\Users\\Vasudev\\eclipse-workspace\\File Handling\\Main\\"+folder);
                		f3.delete();
                	   }
                       break;
	            case 3: System.out.println("Enter the file name you want to search...");
	                    Scanner sc6=new Scanner(System.in);
                        String n5=sc6.nextLine();
                        File a2[]= f.listFiles();
        	            System.out.println("Files inside the Folder:" );
        	             for(int i=0;i<a2.length;i++)
        	            {
        	            	if(a2[i].getName().startsWith(n5))
        	            	System.out.println(a2[i]);
        	            }
        	            break;
	            case 4: 
	                    break;
	                    
	            default:System.out.println("!! WRONG INPUT !!");
	                    break;
                        }
	             if(n2==4)
	             {
	            	 break;
	             }
	            	
	            
	            }
	    
	    case 3: 
                break;
	    
	    default:System.out.println("!! WRONG INPUT !!");
                break;        
	            }
	    if(n==3)
        {
	     System.out.println("Program terminated successfully !");
       	 break;
        }
       	
	    
	    }
	    
	}
}

