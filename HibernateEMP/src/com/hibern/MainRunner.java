package com.hibern;

import java.util.Scanner;

public class MainRunner {
	

		public static void main(String[] args) throws Exception {
			Scanner sc=new Scanner(System.in);
			int choice=0;
			do {
				System.out.println("Select your option\n 1. Insert\n 2. Display\n 3. Update\n 4. Delete\n 5. Exit");
				choice=sc.nextInt();
				if(choice == 1) {
					InsertOperation.insert();
				}else if(choice == 2) {
					DisplayOperation.display();
				}else if(choice == 3) {
					UpdateOperation.update();
				}else if(choice == 4) {
					DeleteOperation.delete();
				}
			}while(choice!=5);
		}

	}

