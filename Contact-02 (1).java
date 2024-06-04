import java.util.*;
class Example{
	public static String [] Idarry= new String[1];
	public static String [] Name= new String[0];
	public static String [] CName= new String[0];
	public static String [] PNumber= new String[0];
	public static double [] sal =new double [0];
	
	public static boolean validate(String num){
		boolean t=false;
		
		if(num.length()!=10){return t=true;}
		if(num.charAt(0)!='0'){return t=true;}
		return t;
		}
	public static int[] sort(int[] ar2){
		int []ar=new int[ar2.length];
		for(int i=0;i<ar.length; i++){
			ar[i]=ar2[i];
			}
		for(int i=0;i<ar.length; i++){
			for(int j=0; j<i; j++){
				if(ar[i]<ar[j]){
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
					}
				
				}
			}
	return ar;
	}

	public static int[] SortByName(){
		System.out.println("+----------------------------------------------------------+");
		System.out.println("|                   List contsct by name                   |");
		System.out.println("+----------------------------------------------------------+\n\n");
		int [] first=new int [Name.length];
		int[] index=new int[Name.length];
		for(int i=0; i<Name.length; i++){
			int t=Name[i].charAt(0);
			first[i]=t;
			}
		int[] t=sort(first);
		
		for(int i=0;i<t.length; i++){
			for(int j=0; j<t.length; j++){
				if(t[i]==first[j]){index[i]=j;}
				}
			}
		return index;
		}
	public static int[] SortBySalary(){
		System.out.println("+----------------------------------------------------------+");
		System.out.println("|                 List contsct by salary                   |");
		System.out.println("+----------------------------------------------------------+\n\n");
		int[] salIndex=new int[sal.length];
		double[] temp=new double[sal.length];
		for(int i=0; i<sal.length; i++){
			temp[i]=sal[i];
			}
		for(int j=0; j<temp.length; j++){
		for(int i =0; i<temp.length-1; i++){
			if(temp[i]>temp[i+1]){
				double t=temp[i];
				temp[i]=temp[i+1];
				temp[i+1]=t;
				}
			}
		}
		for(int j=0; j<temp.length; j++){
		for(int i=0; i<temp.length; i++){
			if(temp[j]==sal[i]){salIndex[j]=i;}
			}
		}

		
		return salIndex;
		}
		
		public static String createId(String st){
		int x1=(int)st.charAt(4);
		x1=x1-48;
		int x2=(int)st.charAt(3);
		x2=x2-48;
		int x3=(int)st.charAt(2);
		x3=x3-48;
		int x4=(int)st.charAt(1);
		x4=x4-48;
		x1++;
		if(x1>9){x1=0; x2++;}
		if(x2>9){x2=0; x3++;}
		if(x3>9){x3=0; x4++;}
		String Id="C"+x4+x3+x2+x1;
		return Id;
		}
	public static boolean chechString(String x,String y){
		if(x.length()!=y.length()){return false;}
		for(int i=0; i<x.length(); i++){
			if(x.charAt(i)!=y.charAt(i)){return false;}
			}
			return true;
		}


	public static int searchIndex(String st,String [] name,String [] phone){
		
		for(int i=0; i<name.length; i++){
			if(chechString(name[i],st)){return i;}
			}
		for(int i=0; i<phone.length; i++){
			if(chechString(phone[i],st)){return i;}
			}
		return -1;
		}
	public static boolean validateSalary(double Salary){
		if(Salary<0){return true;}
		return false;
		}

	public static void homePage(){
	Scanner input=new Scanner (System.in);
	System.out.println("\n\n		/$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$");
	System.out.println("		|__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
	System.out.println("		 /$$| $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
	System.out.println("		| $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
	System.out.println("	        | $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
	System.out.println("	        | $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
	System.out.println("	        | $$| $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
	System.out.println("	        |__/|__/      |__/  |__/|______/|________/|__/  \\__/|_______/\n\n");
	System.out.println("   _____            _             _          ____                        _     ");
	System.out.println("  / ____|          | |           | |        / __ \\                      (_)");
	System.out.println(" | |     ___  _ __ | |_ __ _  ___| |_ ___  | |  | |_ __ __ _  __ _ _ __  _ _______ _ __ ");
	System.out.println(" | |    / _ \\| '_ \\| __/ _` |/ __| __/ __| | |  | | '__/ _` |/ _` | '_ \\| |_  / _ \\ '__|");
	System.out.println(" | |___| (_) | | | | || |_| | |__| |_\\__ \\ | |__| | | | |_| | |_| | | | | |/ /  __/ |");
	System.out.println("  \\_____\\___/|_| |_|\\__\\__,_|\\___|\\__|___/  \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|");
	System.out.println("                                                        __/ |    ");
	System.out.println("                                                       |___/  \n\n");
	System.out.println("========================================================================================\n\n");
	System.out.println("	[01] ADD Contacts");
	System.out.println("	[02] UPDATE Contacts");
	System.out.println("	[03] DELETE Contacts");
	System.out.println("	[04] SEARCH Contacts");
	System.out.println("	[05] LIST Contacts");
	System.out.println("	[06] EXIT\n\n");
	System.out.print("Enter an option to continue -> ");
	int choice =input.nextInt();
	
	if(choice==1){addContact();}
	if(choice==2){updateContact();}
	if(choice==3){deleteContact();}
	if(choice==4){searchContact();}
	if(choice==5){listContact();}
	if(choice==6){exitContact();}

		}
		public static void main(String args[]){
		homePage();
	}
		
//---------------1--------------------------
		public static void addContact(){
			Scanner input=new Scanner (System.in);
			L3:do{
				System.out.println("+----------------------------------------------------------+");
				System.out.println("|                    ADD CONTACT LIST                      |");
				System.out.println("+----------------------------------------------------------+\n\n");

				
					Idarry[0]="C0000";
	while(true){
		String [] temp= new String[Idarry.length+1];
		for(int i=0; i<Idarry.length; i++){
			temp[i]=Idarry[i];
			}
		Idarry=temp;
		String Id =createId(Idarry[Idarry.length-2]);
		
		Idarry[Idarry.length-1]=Id;
		System.out.println(Idarry[Idarry.length-2]);
		System.out.println("=====");
		System.out.print("Name         : ");
		String name =input.next();
		String [] tmp2=new String[Name.length+1];
		for(int i=0; i<Name.length;i++){
			tmp2[i]=Name[i];
			}
			Name=tmp2;
			Name[Name.length-1]=name;
			
		boolean y =true;
		L2:while(y){System.out.print("Phone number : ");
		String pNumber=input.next();
		String num=pNumber;
		if(validate(pNumber)){
			System.out.println("\n            Invalid phone number.....\n\n");
			System.out.print("\ndo you want to enter phone number again(Y/N)-> ");
			char cho2=input.next().charAt(0);
			if(cho2=='Y'||cho2=='y'){continue L2;}
			else if(cho2=='N'||cho2=='n'){homePage();}
			}
			y=false;
			String [] tmp3=new String[PNumber.length+1];
		for(int i=0; i<PNumber.length;i++){
			tmp3[i]=PNumber[i];
			}
			PNumber=tmp3;
			PNumber[PNumber.length-1]=num;
			}
		
			
		System.out.print("Company Name : ");
		String Cname =input.next();
		String [] tmp4=new String[CName.length+1];
		for(int i=0; i<CName.length;i++){
			tmp4[i]=CName[i];
			}
			CName=tmp4;
			CName[CName.length-1]=Cname;
		boolean a =true;
		L2:while(a){
		System.out.print("Salary       : ");
		int Salary=input.nextInt();
		if(validateSalary(Salary)){
			System.out.println("\n            Invalid salary input.....\n\n");
			System.out.print("\ndo you want to enter salaey again(Y/N)-> ");
			char cho2=input.next().charAt(0);
			if(cho2=='Y'||cho2=='y'){continue L2;}
			else if(cho2=='N'||cho2=='n'){homePage();}
			}
			a=false;
		double [] tmp5=new double[sal.length+1];
		for(int i=0; i<sal.length;i++){
			tmp5[i]=sal[i];
			}
			sal=tmp5;
			sal[sal.length-1]=Salary;}
		
		System.out.println("\n     Contact has been added successfully...");
		System.out.print("\nDo you want to add another contact (Y/N) ->");
		char cho=input.next().charAt(0);
		if(cho=='Y'||cho=='y'){continue L3;}
			else if(cho=='N'||cho=='n'){homePage();}
		
		}

				
				}while(true);}
//----------------2----------------------
		public static void updateContact(){
			Scanner input=new Scanner (System.in);
			L2:do{
				System.out.println("+----------------------------------------------------------+");
				System.out.println("|                    UPDATE CONTACTS                       |");
				System.out.println("+----------------------------------------------------------+\n\n");

				System.out.print("Search contact by Name or phone number : ");
				String serch =input.next();
				int ser =searchIndex(serch,Name,PNumber);
				
				if(ser==-1){
					System.out.println("\n\nNo contact found regarding \""+serch+"\"");
					System.out.print("\nDo you want to update another contact (Y/N) ->");
					char cho2=input.next().charAt(0);
					if(cho2=='Y'||cho2=='y'){continue L2;}
					else if(cho2=='N'||cho2=='n'){homePage();}
					}
				
				System.out.print("\n\nContact ID   : ");
				System.out.println(Idarry[ser]);
				System.out.print("Name         : ");
				System.out.println(Name[ser]);
				System.out.print("Phone Number : ");
				System.out.println(PNumber[ser]);
				System.out.print("Company Name : ");
				System.out.println(CName[ser]);
				System.out.print("salary       : ");
				System.out.println(sal[ser]);
				
				System.out.println("\nWhat do you want to update...\n\n");
				System.out.println("[01] Name");
				System.out.println("[02] Phone Number");
				System.out.println("[03] Company Name");
				System.out.println("[04] Salary\n\n");
				System.out.print("Enter an option to continue -> ");
				int op =input.nextInt();
				if(op==1){
					System.out.println("Update Name");
					System.out.println("===========\n\n");
					System.out.print("input new name : ");
					String NewName =input.next();
					Name[ser]=NewName;
					System.out.println("\nContact has been update succesfully...");
					}
				if(op==2){
					System.out.println("Update Phone number");
					System.out.println("===================\n\n");
					boolean y =true;
					L6:while(y){
					System.out.print("input new phone number : ");
					String NewPNumber =input.next();
					if(validate(NewPNumber)){
						System.out.println("\n            Invalid phone number.....\n\n");
						System.out.print("\ndo you want to enter phone number again(Y/N)-> ");
						char cho2=input.next().charAt(0);
						if(cho2=='Y'||cho2=='y'){continue L6;}
						else if(cho2=='N'||cho2=='n'){homePage();}
							}
							y=false;
							
					PNumber[ser]=NewPNumber;
					System.out.println("\nContact has been update succesfully...");
					}}
				if(op==3){
					System.out.println("Update Company name");
					System.out.println("===================\n\n");
					System.out.print("input new company name : ");
					String NewCName =input.next();
					CName[ser]=NewCName;
					System.out.println("\nContact has been update succesfully...");
					}
				if(op==4){
					System.out.println("Update Salary");
					System.out.println("=============\n\n");
					boolean y =true;
					L7:while(y){
					System.out.print("input new salary : ");
					double NewSal =input.nextInt();
					if(validateSalary(NewSal)){
						System.out.println("\n            Invalid salary input.....\n\n");
						System.out.print("\ndo you want to enter salaey again(Y/N)-> ");
						char cho2=input.next().charAt(0);
						if(cho2=='Y'||cho2=='y'){continue L7;}
						else if(cho2=='N'||cho2=='n'){homePage();}
							}
							y=false;
					sal[ser]=NewSal;
					System.out.println("\nContact has been update succesfully...");
					}	}
				
				
				System.out.print("\nDo you want to update another contact (Y/N) ->");
		char cho=input.next().charAt(0);
		if(cho=='Y'||cho=='y'){continue L2;}
			else if(cho=='N'||cho=='n'){homePage();}
				}while(true);} 
//----------------3----------------------
		public static void deleteContact(){
			Scanner input=new Scanner (System.in);
			L3:do{
				System.out.println("+----------------------------------------------------------+");
				System.out.println("|                    DELETE CONTACTS                       |");
				System.out.println("+----------------------------------------------------------+\n\n");

				System.out.print("Search contact by Name or phone number : ");
				String serch =input.next();
				int ser =searchIndex(serch,Name,PNumber);
				
				if(ser==-1){
					System.out.println("\n\nNo contact found regarding \""+serch+"\"");
					System.out.print("\nDo you want to update another contact (Y/N) ->");
					char cho3=input.next().charAt(0);
					if(cho3=='Y'||cho3=='y'){continue L3;}
					else if(cho3=='N'||cho3=='n'){homePage();}
					}
				
				System.out.print("\n\nContact ID   : ");
				System.out.println(Idarry[ser]);
				System.out.print("Name         : ");
				System.out.println(Name[ser]);
				System.out.print("Phone Number : ");
				System.out.println(PNumber[ser]);
				System.out.print("Company Name : ");
				System.out.println(CName[ser]);
				System.out.print("salary       : ");
				System.out.println(sal[ser]);
				
				System.out.println("\nDo you want to want to delete this contact (Y/N) : ");
				char cho=input.next().charAt(0);
				if(cho=='y'||cho=='Y'){
				String [] tempid=new String[Idarry.length-1];
				String [] tempname=new String[Idarry.length-1];
				String [] temppnumber=new String[Idarry.length-1];
				String [] tempcname=new String[Idarry.length-1];
				double [] tempsla=new double[Idarry.length-1];
				int count=0;
				L4:for(int i=0; i<Idarry.length; i++){
					if(i==ser){continue L4;}
					tempid[count]=Idarry[i];
					tempname[count]=Name[i];
					temppnumber[count]=PNumber[i];
					tempcname[count]=CName[i];
					tempsla[count]=sal[i];
					count++;
					}
					Idarry=tempid;
					Name=tempname;
					PNumber=temppnumber;
					CName=tempcname;
					sal=tempsla;
					System.out.println("\n      Customer has been deleted succesfully...");
					}
				if(cho=='n'||cho=='N'){homePage();}
					
				System.out.print("\nDo you want to update another contact (Y/N) ->");
				char cho2=input.next().charAt(0);
					if(cho2=='Y'||cho2=='y'){continue L3;}
					else if(cho2=='N'||cho2=='n'){homePage();}
				}while(true);} 
//----------------4----------------------
		public static void searchContact(){
			
				Scanner input=new Scanner (System.in);
			L5:do{
				System.out.println("+----------------------------------------------------------+");
				System.out.println("|                    SEARCH CONTACTS                       |");
				System.out.println("+----------------------------------------------------------+\n\n");

				System.out.print("Search contact by Name or phone number : ");
				String serch =input.next();
				int ser =searchIndex(serch,Name,PNumber);
				
				if(ser==-1){
					System.out.println("\n\nNo contact found regarding \""+serch+"\"");
					System.out.print("\nDo you want to update another contact (Y/N) ->");
					char cho2=input.next().charAt(0);
					if(cho2=='Y'||cho2=='y'){continue L5;}
					else if(cho2=='N'||cho2=='n'){homePage();}
					}
				
				System.out.print("\n\nContact ID   : ");
				System.out.println(Idarry[ser]);
				System.out.print("Name         : ");
				System.out.println(Name[ser]);
				System.out.print("Phone Number : ");
				System.out.println(PNumber[ser]);
				System.out.print("Company Name : ");
				System.out.println(CName[ser]);
				System.out.print("salary       : ");
				System.out.println(sal[ser]);
				
				System.out.print("\nDo you want to search another contact (Y/N) ->");
				char cho2=input.next().charAt(0);
					if(cho2=='Y'||cho2=='y'){continue L5;}
					else if(cho2=='N'||cho2=='n'){homePage();}
				}while(true);} 
//----------------5----------------------
		public static void listContact(){
			L2:do{
				Scanner input=new Scanner (System.in);
				System.out.println("+----------------------------------------------------------+");
				System.out.println("|                      SORT CONTACTS                       |");
				System.out.println("+----------------------------------------------------------+\n\n");
				System.out.println("	[01] Sorting by name");
				System.out.println("	[02] Sorting by salary");
				System.out.println("	[03] Sorting by birth day\n");
				
				System.out.print("Enter an optiont to continue -> ");
				int select = input.nextInt();
				if(select==1){
					
					int [] temp=SortByName();
					System.out.println("+----------------------------------------------------------------------------------------+");
						System.out.println("|   Contact ID  |      Name     |    Phone Number    |       Company     |     Salary    |");
						System.out.println("+----------------------------------------------------------------------------------------+");
					for(int i=0;i<temp.length;i++){
						System.out.printf("| %-14s| %-14s| %-19s| %-18s| %-14.1f|%s",Idarry[temp[i]],Name[temp[i]],CName[temp[i]],PNumber[temp[i]],sal[temp[i]],"\n");
						}
						System.out.println("+----------------------------------------------------------------------------------------+\n\n");
						System.out.print("Do you want go Home page (Y/N) : ");
						char cho2=input.next().charAt(0);
						if(cho2=='N'||cho2=='n'){continue L2;}
						else if(cho2=='Y'||cho2=='y'){homePage();}
					
					}
				if(select==2){
					
					int[]temp =SortBySalary();
					
						System.out.println("+----------------------------------------------------------------------------------------+");
						System.out.println("|   Contact ID  |      Name     |    Phone Number    |       Company     |     Salary    |");
						System.out.println("+----------------------------------------------------------------------------------------+");
					for(int i=0;i<temp.length;i++){
						System.out.printf("| %-14s| %-14s| %-19s| %-18s| %-14.1f|%s",Idarry[temp[i]],Name[temp[i]],CName[temp[i]],PNumber[temp[i]],sal[temp[i]],"\n");
						}
						System.out.println("+----------------------------------------------------------------------------------------+\n\n");
						System.out.print("Do you want go Home page (Y/N) : ");
						char cho2=input.next().charAt(0);
						if(cho2=='N'||cho2=='n'){continue L2;}
						else if(cho2=='Y'||cho2=='y'){homePage();}
					}
				if(select==3){}
				
				}while(true);}
//----------------6----------------------
		public static void exitContact(){
			L2:do{
				
				return;
				}while(true);}  
	}
  

