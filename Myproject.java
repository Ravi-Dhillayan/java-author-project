package myfristproject;
import java.util.*;
import java.io.*;

class stdfile {
    int roll_no, phone;
    String name, course, cl, email;

    void filewrite() {
        try {
            File fo = new File("C:\\Users\\parti\\Desktop\\file\\datashiv.txt");
            if (fo.createNewFile()) {
                System.out.println("Your file created: " + fo.getName());
            } else {
                System.out.println("Your File Already Created");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    void dataEnter() {
        FileWriter foo = null;
        try {
            foo = new FileWriter("C:\\Users\\parti\\Desktop\\file\\shiv.txt");
            Scanner So = new Scanner(System.in);
            int n, i, j;
            System.out.println("How many students' records do you want to Enter: ");
            n = So.nextInt();
            for (i = 0; i < n; i++) {
                System.out.println("Enter your name:");
                name = So.next();
                System.out.println("Enter your class:");
                cl = So.next();
                System.out.println("Enter your Course:");
                course = So.next();
                System.out.println("Enter your Gmail_ID:");
                email = So.next();
                System.out.println("Enter your Mobile_No:");
                phone = So.nextInt();
                System.out.println("Enter your Roll_NO:");
                roll_no = So.nextInt();
                foo.write("Name: " + name + "\n");
                foo.write("Class: " + cl + "\n");
                foo.write("Course: " + course + "\n");
                foo.write("Email: " + email + "\n");
                foo.write("Phone: " + phone + "\n");
                foo.write("Roll No: " + roll_no + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } 
        finally {
            try {
                if (foo != null) {
                    foo.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file.");
                e.printStackTrace();
            }
            System.out.println("Thank you.");
        }
    }
    void show(stdfile ob) {
    	int show;
//        System.out.println("Enter the roll_no where Data show of Data :");
        Scanner o = new Scanner(System.in);
        show = o.nextInt();
        BufferedReader reader;
       try {
    	   String filepath="C:\\Users\\parti\\Desktop\\file\\shiv.txt";
           if (show == ob.roll_no) {
               System.out.println("Show Student of Data : ");
               reader = new BufferedReader(new FileReader(filepath));
               String line = reader.readLine();
               while (line != null) {
                   System.out.println(line);
                   line = reader.readLine();
               }
               reader.close();
        }
       }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        
        }
    }
    void search(stdfile stdfileobj) {
        int search;
        System.out.println("Enter You are searching Student of Data : ");
        Scanner o = new Scanner(System.in);
        search = o.nextInt();
        if (search == stdfileobj.roll_no) {
            System.out.println("Your Name: " + stdfileobj.name);
            System.out.println("Your class: " + stdfileobj.cl);
            System.out.println("Your course: " + stdfileobj.course);
            System.out.println("Your email: " + stdfileobj.email);
            System.out.println("Your phone: " + stdfileobj.phone);
            System.out.println("Your roll_no: " + stdfileobj.roll_no);
        } else {
            System.out.println("Sorry! The Roll_no Data was Not Found");
        }
    }
   
    	

    	    void update(stdfile stdfileobj) throws IOException {
    	        System.out.println("Enter the Student Roll_no Whose data you want to update:");
    	        Scanner o = new Scanner(System.in);
    	        int update;

    	        update = o.nextInt();
    	        if (update == stdfileobj.roll_no) {
    	            System.out.println("Enter the new Data for Student:");
    	            stdfileobj.dataEnter();
    	        }
    }
}


public class Myproject {

    public static void main(String[] args) throws IOException {
        stdfile stdfileobj = new stdfile();
        stdfileobj.filewrite();
        stdfileobj.dataEnter();
        stdfileobj.show(stdfileobj);
        stdfileobj.search(stdfileobj);
        stdfileobj.update(stdfileobj);
        
      //String password = "ravi@123", enterpas;
      //char op;
      //
      //System.out.println("Enter Your password:");
      //Scanner obj = new Scanner(System.in);
      //enterpas = obj.nextLine();
      //if (password.equals(enterpas)) {
      //do {
      //  
//      	Your_choiice so = new Your_choiice();
//            so.enterdata();
//            stddataEnter obb = new stddataEnter();
//            int n;
//            n = obj.nextInt();
//            if (n >= 49 && n <= 54) {
//                switch (n) {
//                    case 49:
//                       Your_choiice  choiceobj=new Your_choiice(); //Class Name Your_choiice
//          	           choiceobj.enterdata();   
//                        break;
//                    case 50:
//                        show o = new show();
//                        o.Daata(obb);
//                        break;
//                    case 51:
//                        show so2 = new show();
//                        so2.search(obb);
//                        break;
//                    case 52:
//                        update objj = new update();
//                        objj.update(obb);
//                        break;
//                    default:
//                        System.out.println("WRONG CHOICE");
//                }
//            }
      //
      //  System.out.println("Do you want to try again? y/n");
      //  op = obj.next().charAt(0);
      //} while (op == 'Y' || op == 'y');
      //}
      //else {
      //  System.out.println("***You Entered the Wrong Password***");
      //}
        
    }

}
