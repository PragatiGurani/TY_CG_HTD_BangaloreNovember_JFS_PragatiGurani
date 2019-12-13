package com.capgemini.phoneapplication.appcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.phoneapplication.appbean.PhoneBean;
import com.capgemini.phoneapplication.appfactory.AppFactory;
import com.capgemini.phoneapplication.appservices.ContactServices;

public class ManagementMain 
{
	public static void main(String[] args) 
	{
		ContactServices services = AppFactory.instanceOfContactServicesImpl();
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Insert\n 2.Delete \n 3.Update \n 4.Getall contact");
			int choice = sc.nextInt();

			switch(choice) 
			{
			case 1:
				System.out.println("Enter Contact Name");
				String name = sc.next();
				System.out.println("Enter Contact Number");
				int number = sc.nextInt();
				System.out.println("Enter Group Name");
				String groupname = sc.next();

				PhoneBean p1 = new PhoneBean();
				p1.setName(name);
                p1.setNumber(number);
                p1.setGroupname(groupname);

				boolean b = services.insert(p1);
				if(b) 
				{
					System.out.println("Contact inserted");
				}
				else
				{
					System.err.println("something went wrong"); 
				}

				break;

			case 2:
				System.out.println("Enter Contact Name");
				String name1 = sc.next();
				System.out.println("Enter Contact Number");
				int number1 = sc.nextInt();

				boolean b1 = services.delete(name1, number1);
				if(b1) 
				{
					System.out.println("Contact Deleted");
				}
				else 
				{
					System.err.println("Contact not deleted");
				}
				break;

			case 3:
				System.out.println("Enter Contact Name");
				String name2 = sc.next();
				System.out.println("Enter Contact Number");
				int number2 = sc.nextInt();

				PhoneBean p2 = new PhoneBean();
				p2.setName(name2);
                p2.setNumber(number2);
                
				boolean b2 = services.update(name2, number2);
				if(b2) 
				{
					System.out.println("Contact updated");
				}
				else 
				{
					System.err.println("Contact not update");
				}
				break;

			case 4: 
				List<PhoneBean> l1 = new ArrayList<PhoneBean>();
				System.out.println(l1);
			default:
				System.out.println("Wrong choice");
			}	
		}
	}
}