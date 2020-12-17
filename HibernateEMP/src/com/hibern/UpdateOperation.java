package com.hibern;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UpdateOperation {
	public static void update() throws Exception {
		Session se=Config.config();
		Scanner sc = new Scanner(System.in);
		int choice = 0,a = 0;
		String option = "";
		do {
			Transaction tx=se.beginTransaction();
			System.out.println(
					"Select your option\n 1. update name  \n 2. update department \n 3. update designation \n 4. update salary");
			choice=sc.nextInt();
			if (choice == 1) {
				Query qr=se.createQuery("update Employee e set e.name=:x where e.id=:y");
				System.out.println("Enter new name:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which name to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 2) {
				Query qr=se.createQuery("update Employee e set e.department=:x where e.id=:y");
				System.out.println("Enter new department:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which department to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 3) {
				Query qr=se.createQuery("update Employee e set e.designation=:x where e.id=:y");
				System.out.println("Enter new designation:");
				qr.setParameter("x", sc.next());
				System.out.println("enter the id to which designation to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			} else if (choice == 4) {
				Query qr=se.createQuery("update Employee e set e.salary=:x where e.id=:y");
				System.out.println("Enter new salary:");
				qr.setParameter("x", sc.nextInt());
				System.out.println("enter the id to which salary to be updated: ");
				qr.setParameter("y", sc.nextInt());
				a = qr.executeUpdate();
				if (a == 1)
					System.out.println("Record updated");
			}
			tx.commit();
			System.out.println("Do you want to continue (y/n)");
			option = sc.next();
		} while (option.equalsIgnoreCase("y"));
		se.close();
	}
}

