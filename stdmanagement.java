//import java.util.*;
//import java.io.*;
//
//class Enter {
//    void data() {
//        System.out.println("********YOUR WELCOME*******");
//    }
//}
//
//class one extends Enter {
//    int roll_no, phone;
//    String name, course, cl, email;
//
//    public void on() throws IOException {
//        FileWriter foo = new FileWriter("C:\\Users\\parti\\Desktop\\file\\shiv.txt");
//
//        try {
//            Scanner o = new Scanner(System.in);
//            int n, i, j;
//            System.out.println("How many students records do you want to Enter ::");
//            n = o.nextInt();
//            for (i = 0; i < n; i++) {
//                System.out.println("Enter your name:");
//                name = o.next();
//                System.out.println("Enter your class:");
//                cl = o.next();
//                System.out.println("Enter your Course:");
//                course = o.next();
//                System.out.println("Enter your Gmail_ID:");
//                email = o.next();
//                System.out.println("Enter your Mobile_No:");
//                phone = o.nextInt();
//                System.out.println("Enter your Roll_NO:");
//                roll_no = o.nextInt();
//                foo.write("Name: " + name + "\n");
//                foo.write("Class: " + cl + "\n");
//                foo.write("Course: " + course + "\n");
//                foo.write("Email: " + email + "\n");
//                foo.write("Phone: " + phone + "\n");
//                foo.write("Roll No: " + roll_no + "\n");
//            }
//        } finally {
//            foo.close();
//            System.out.println("Thank you :");
//        }
//    }
//}
//
//class show {
//    void Data(one ob) {
//        int show;
//        System.out.println("Enter the roll_no where Data show of Data :");
//        Scanner o = new Scanner(System.in);
//        show = o.nextInt();
//        if (show == ob.roll_no) {
//            System.out.println("Show Student of Data : ");
//            try {
//                FileReader obj = new FileReader("C:\\Users\\parti\\Desktop\\file\\shiv.txt");
//                BufferedReader reader = new BufferedReader(obj);
//
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    System.out.println(line);
//                }
//
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println("File closed");
//        }
//    }
//
//    void search(one ob) {
//        int search;
//        System.out.println("Enter You are searching Student of Data : ");
//        Scanner o = new Scanner(System.in);
//        search = o.nextInt();
//        if (search == ob.roll_no) {
//            System.out.println("Your Name: " + ob.name);
//            System.out.println("Your class: " + ob.cl);
//            System.out.println("Your course: " + ob.course);
//            System.out.println("Your email: " + ob.email);
//            System.out.println("Your phone: " + ob.phone);
//            System.out.println("Your roll_no: " + ob.roll_no);
//        } else {
//            System.out.println("Sorry! The Roll_no Data was Not Found");
//        }
//    }
//}
//
//class update extends show {
//    Scanner o = new Scanner(System.in);
//
//    void update(one ob) throws IOException {
//        System.out.println("Enter the Student Roll_no Whose data you want to update:");
//        int update;
//
//        update = o.nextInt();
//        if (update == ob.roll_no) {
//            System.out.println("Enter the new Data for Student:");
//            ob.on();
//        }
//    }
//
//    void delete(one ob) throws IOException {
//        int rollno;
//        System.out.println("Enter the Roll_no to Delete the Data Record:");
//        rollno = o.nextInt();
//    }
//}
//
//class Sdata {
//    void enterdata() throws IOException {
//        System.out.println("press 1 to Enter the Record:");
//        System.out.println("press 2 to show Record:");
//        System.out.println("press 3 to search Record:");
//        System.out.println("press 4 to update Record:");
//        System.out.println("press 5 to Delete Record:");
//        System.out.println("press 6 to Exit");
//        int recordofstd;
//        Scanner o = new Scanner(System.in);
//        recordofstd = o.nextInt();
//        one obb = new one();
//        obb.data();
//        obb.on();
//    }
//}
//
//public class stdmanagement {
//    public static void main(String[] args) throws IOException {
//        String password = "ravi@123", enterpas;
//        char op;
//
//        System.out.println("Enter Your password:");
//        Scanner obj = new Scanner(System.in);
//        enterpas = obj.nextLine();
//        do {
//            if (password.equals(enterpas)) {
//                Sdata so = new Sdata();
//                so.enterdata();
//                one obb = new one();
//                int n;
//                n = obj.nextInt();
//                if (n >= 49 && n <= 54) {
//                    switch (n) {
//                        case 49:
//                            obb.data();
//                            obb.on();
//                            break;
//                        case 50:
//                            show o = new show();
//                            o.Data(obb);
//                            break;
//                        case 51:
//                            show so2 = new show();
//                            so2.search(obb);
//                            break;
//                        case 52:
//                            update objj = new update();
//                            objj.update(obb);
//                            break;
//                        default:
//                            System.out.println("WRONG CHOICE");
//                    }
//                }
//            } else {
//                System.out.println("***You Entered the Wrong Password***");
//            }
//            System.out.println("Do you want to try again? y/n");
//            op = obj.next().charAt(0);
//        } while (op == 'Y' || op == 'y');

//    }
//}
package myfristproject;
import java.util.*;

import java.io.*;

class stdflie {
    void data() {
        System.out.println("********YOUR WELCOME*******");
		File fo=new File("C:\\Users\\parti\\Desktop\\file\\shiv.txt");
  	  try {
  		System.out.println("Your file created :");
  	  }
  	  catch(Exception i) {
  			System.out.println("<<<<<<<<<<<<<<<Your File Already Created>>>>>>>>>>>>>>>");
  		}
    }
}
class Your_choiice {
    void enterdata() throws IOException {
        System.out.println("press 1 to Enter the Record:");
        System.out.println("press 2 to show Record:");
        System.out.println("press 3 to search Record:");
        System.out.println("press 4 to update Record:");
        System.out.println("press 5 to Delete Record:");
        System.out.println("press 6 to Exit");
        int recordofstd;
        Scanner o = new Scanner(System.in);
        recordofstd = o.nextInt();
        stddataEnter obb = new stddataEnter();
        obb.data();
        obb.dataEnter();
    }
}
class stddataEnter extends stdflie  {
    int roll_no, phone;
    String name, course, cl, email;

    void dataEnter() throws IOException {
        FileWriter foo = new FileWriter("C:\\Users\\parti\\Desktop\\file\\shiv.txt");

        try {
            Scanner o = new Scanner(System.in);
            int n, i, j;
            System.out.println("How many students records do you want to Enter ::");
            n = o.nextInt();
            for (i = 0; i < n; i++) {
                System.out.println("Enter your name:");
                name = o.next();
                System.out.println("Enter your class:");
                cl = o.next();
                System.out.println("Enter your Course:");
                course = o.next();
                System.out.println("Enter your Gmail_ID:");
                email = o.next();
                System.out.println("Enter your Mobile_No:");
                phone = o.nextInt();
                System.out.println("Enter your Roll_NO:");
                roll_no = o.nextInt();
                foo.write("Name: " + name + "\n");
                foo.write("Class: " + cl + "\n");
                foo.write("Course: " + course + "\n");
                foo.write("Email: " + email + "\n");
                foo.write("Phone: " + phone + "\n");
                foo.write("Roll No: " + roll_no + "\n");
            }
        } finally {
            foo.close();
            System.out.println("Thank you :");
        }
    }
}

class Datashow {
    void Daata(stddataEnter ob) {
        int show;
        System.out.println("Enter the roll_no where Data show of Data :");
        Scanner o = new Scanner(System.in);
        show = o.nextInt();
        if (show equals(ob.roll_no)) {
            System.out.println("Show Student of Data : ");
            try {
                FileReader obj = new FileReader("C:\\Users\\parti\\Desktop\\file\\shiv.txt");
                BufferedReader reader = new BufferedReader(obj);

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("File closed");
        }
    }

    void search(stddataEnter ob) {
        int search;
        System.out.println("Enter You are searching Student of Data : ");
        Scanner o = new Scanner(System.in);
        search = o.nextInt();
        if (search == ob.roll_no) {
            System.out.println("Your Name: " + ob.name);
            System.out.println("Your class: " + ob.cl);
            System.out.println("Your course: " + ob.course);
            System.out.println("Your email: " + ob.email);
            System.out.println("Your phone: " + ob.phone);
            System.out.println("Your roll_no: " + ob.roll_no);
        } else {
            System.out.println("Sorry! The Roll_no Data was Not Found");
        }
    }
}

class update extends Datashow {
    Scanner o = new Scanner(System.in);

    void update(stddataEnter ob) throws IOException {
        System.out.println("Enter the Student Roll_no Whose data you want to update:");
        int update;

        update = o.nextInt();
        if (update == ob.roll_no) {
            System.out.println("Enter the new Data for Student:");
            ob.dataEnter();
        }
    }

    void delete(stddataEnter ob) throws IOException {
        int rollno;
        System.out.println("Enter the Roll_no to Delete the Data Record:");
        rollno = o.nextInt();
    }
}



public class stdmanagement {
    public static void main(String[] args) throws IOException {
    	Your_choiice  choiceobj=new Your_choiice(); //Class Name Your_choiice
    	choiceobj.enterdata(); 
    	Datashow  showobj=new Datashow();
    	 stddataEnter obb = new stddataEnter();
    	showobj.Daata(obb);
    	                
   
//String password = "ravi@123", enterpas;
//char op;
//
//System.out.println("Enter Your password:");
//Scanner obj = new Scanner(System.in);
//enterpas = obj.nextLine();
//if (password.equals(enterpas)) {
//do {
//  
//	Your_choiice so = new Your_choiice();
//      so.enterdata();
//      stddataEnter obb = new stddataEnter();
//      int n;
//      n = obj.nextInt();
//      if (n >= 49 && n <= 54) {
//          switch (n) {
//              case 49:
//                 Your_choiice  choiceobj=new Your_choiice(); //Class Name Your_choiice
//    	           choiceobj.enterdata();   
//                  break;
//              case 50:
//                  show o = new show();
//                  o.Daata(obb);
//                  break;
//              case 51:
//                  show so2 = new show();
//                  so2.search(obb);
//                  break;
//              case 52:
//                  update objj = new update();
//                  objj.update(obb);
//                  break;
//              default:
//                  System.out.println("WRONG CHOICE");
//          }
//      }
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
