package myprojects;

import java.io.*;
import java.util.Scanner;

class stduentdata {
    int roll_no, phone;
    String name, course, cl, email;

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
            System.out.println("IOException Occurred");
        }
    }

    void dataEnter() throws IOException {
        Scanner o = new Scanner(System.in);
        FileWriter foo = new FileWriter("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");

        try {
            int n, i;
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

    void dataseatch(stduentdata seachobj) {
        try {
            Scanner o = new Scanner(System.in);
            int searchrollno;
            System.out.println("Enter the Roll_no You are searching the Student of data :");
            searchrollno = o.nextInt();
            FileReader Readerobj = new FileReader("C:\\Users\\parti\\Desktop\\file\\Shiv.txt");
            try {
                if (searchrollno ==seachobj.roll_no) {
                    System.out.println("Your Name: " + seachobj.name);
                    System.out.println("Your class: " + seachobj.cl);
                    System.out.println("Your course: " + seachobj.course);
                    System.out.println("Your email: " + seachobj.email);
                    System.out.println("Your phone: " + seachobj.phone);
                    System.out.println("Your roll_no: " + seachobj.roll_no);
                } else {
                    System.out.println("Sorry! The Roll_no Data was Not Found");
                }
            } finally {
                Readerobj.close();
            }
        } catch (Exception ee) {
            System.out.println("Error: " + ee.getMessage());
        }
    }
}

public class fstd {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method
        stduentdata dataobject = new stduentdata();
//         dataobject.file_create();
//         dataobject.dataEnter();
        dataobject.datashow();
////        dataobject.dataseatch(dataobject);
    }
}
