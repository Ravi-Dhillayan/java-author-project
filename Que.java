package Queue;

import java.util.Scanner;

class Queue{
	int f=-1,r=-1,i,n,item;
	int a[];
	public
	Queue() {
		 System.out.println("What size do you want Queue to be : ");
	        Scanner o = new Scanner(System.in);
	        n = o.nextInt();
	        a = new int[n]; 
	}
	void put() {
		Scanner o=new Scanner(System.in);
		if(f==n-1) {
			System.out.println("Queue is Overflow : ");
		}
		else {
				System.out.println("Enter the new Queue Item :: ");
				item=o.nextInt();
				if(r==-1) {
					f=r=0;
				}
				else {
					f++;
				}
				a[f]=item;
		}
	}
	void get() {
		if(r==-1) {
			System.out.println("Queue is Underflow :: ");
		}
		else {
			item=a[r];
			System.out.println("Delete Item :: ");
			if(r==f) {
				r=f=-1;
			}
			else {
				r++;
			}
		}
	}
	void display() {
		if(r==-1) {
			System.out.println("Queue is Empty :: ");
		}
		else {
			System.out.println("printed the Queue Items :: ");
			for(i=r ;i<=f;i++) {
				System.out.println(a[i]);
			}
		}
	}
}
public class Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue obj=new Queue();
		int user_input;
        boolean B = true;
        Scanner o = new Scanner(System.in);
        System.out.println("What do you want to do in Stack : ");
        while (B == true) {
            System.out.println("1st Put Element is Statck\n2nd Get Element is Stack\n"
                    + "3rd Display Element of Stack\n4 Exit the Program : ");
            user_input = o.nextInt();
            switch(user_input) {
            case 1:
            	obj.put();
            	break;
            case 2:
            	obj.get();
            	break;
            case 3:
            	obj.display();
            	break;
            case 4:
            	B=false;
            	default:
            		System.out.println("Wrong Input !!! Please Enter a Valid Input::");
            }
        }
	}

}
