package myprojects;
import java.io.*;
import java.util.Scanner;

class stdentdata {
    int roll_no, phone;
    String name, course, cl, email;
    int searchrollno;
    int n, i;

    
public 
    void file_create() {
        System.out.println("********YOUR WELCOME*******");
        File fo = new File("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");
        try {
            if (fo.createNewFile()) {
                System.out.println("Your file created :");
            } else {
                System.out.println("<<<<<<<<<<<<<<<Your File Already Created>>>>>>>>>>>>>>>");
            }
        } catch (IOException i) {
            System.out.println("IOEx	ception Occurred");
        }
    }

    void dataEnter() throws IOException {
        Scanner o = new Scanner(System.in);
        FileWriter foo = new FileWriter("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");

        try {
                   System.out.println("How many students records do you want to Enter ::");
            n = o.nextInt();
            for (i = 0; i < n; i++) {
            	 System.out.println("Enter your Roll_NO:");
                 roll_no = o.nextInt();

                System.out.println("Enter your class:");
                cl = o.next();
                System.out.println("Enter your Course:");
                course = o.next();
                System.out.println("Enter your Gmail_ID:");
                email = o.next();
                System.out.println("Enter your Mobile_No:");
                phone = o.nextInt();
                System.out.println("Enter your name:");
                name = o.next();
                               foo.write("Name: " + name + "\n");
                foo.write("Class: " + cl + "\n");
                foo.write("Course: " + course + "\n");
                foo.write("Email: " + email + "\n");
                foo.write("Roll No: " + roll_no + "\n");
            }
        } finally {
            foo.close();
            System.out.println("Thank you :");
        }
    }

    void datashow() {
        try {
            FileReader Readerob = new FileReader("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");
            try {
                int i;
                while ((i = Readerob.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                Readerob.close();
            }
        } catch (IOException e) {
            System.out.println("Exception Handled ");
        }
    }
    void search() 
    {
    	
        try {
        	int rollno;
        	Scanner so=new Scanner(System.in);
        	System.out.println("Enter the Rollno YOu want the search : ");
        	rollno=so.nextInt();
            FileReader Readerob = new FileReader("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");
            try {
                int i;
                while ((i = Readerob.read()) != -1) {
                	if(rollno==i) {
i=Readerob.read();

                    System.out.print((char)i);
                }
                }
            } finally {
                Readerob.close();
            }
        } catch (IOException e) {
            System.out.println("Exception Handled ");
        }
    }

    void dataseatch() {
    	  try {
//    	int n;
    	System.out.println("Enter how many Enter");
    	 Scanner o = new Scanner(System.in);
    	 searchrollno=o.nextInt();
       

    	 
    	stdentdata[] searchobj=new stdentdata[searchrollno];
      
           
            
//            int a[]=new int[searchobj];
            for(int i=0;i<searchobj.length;i++){
            	searchobj[i]=new stdentdata();
            }
            for(int i=0;i<searchobj.length;i++){
                FileInputStream Readerobj = new FileInputStream("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");
                try {
                    if (searchrollno ==searchobj[i].roll_no) {
                        System.out.println("Your Name: " + searchobj[i].roll_no);
                        System.out.println("Your class: " + searchobj[i].cl);
                        System.out.println("Your course: " + searchobj[i].course);
                        System.out.println("Your email: " + searchobj[i].email);
                        System.out.println("Your phone: " + searchobj[i].phone);
                        System.out.println("Your roll_no: " + searchobj[i].name);
                    } else {
                        System.out.println("Sorry! The Roll_no Data was Not Found");
                    }
                } 
                finally {
                    Readerobj.close();
                }
           
            }
     
        }
        catch (Exception ee) {
            System.out.println("Error: " + ee.getMessage());
        }
    }
    
}

public class studentmangmentdata {
	  public static void main(String[] args) throws Exception {
	        // TODO Auto-generated method
	        stdentdata dataobject = new stdentdata();
	         dataobject.file_create();
//	         dataobject.datashow();
	        dataobject.dataEnter();
	        dataobject.datashow();
//	        dataobject.datasearch();
	        dataobject.search();

	    }

}
//void dataSearch(String filePath, String name2) {
//	
//    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
//        String line;
//        boolean found = false;
//        while ((line = bufferedReader.readLine()) != null) {
//            if (line.contains("Roll No: " + name2)) {
//                found = true;
//                System.out.println("Data found for Roll No: " + name2);
//                for (int i = 0; i < 5; i++) {
//                    System.out.println(bufferedReader.readLine());
//                }
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Data not found for Roll No: " + name2);
//        }
//    } catch (IOException e) {
//        System.out.println("IOException occurred: " + e.getMessage());
//    }
//}
//}
//public class studentmangmentdata {
//  public static void main(String[] args) throws Exception {
//        // TODO Auto-generated method
//        stdentdata dataobject = new stdentdata();
////         dataobject.file_create();
////         dataobject.datashow();
//        dataobject.dataEnter();
//        dataobject.datashow();
//        String filePath = "C:\\Users\\parti\\Desktop\\file\\Shiv.txt";
//        Scanner o=new Scanner(System.in);
//        String name=o.next();
//        dataobject.dataSearch(filePath, name);
//
//    }
//
//}