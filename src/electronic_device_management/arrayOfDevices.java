package electronic_device_management;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class arrayOfDevices {
	computers cp[] = new computers[100];
	television tev[] = new television[100];
	devices dv[] = new devices[100];
	private int countDv, counttv, countcp,count1=0;
	private double sum1 = 0, sum2 = 0;

	public arrayOfDevices() {
		countDv = 0;
		for (int i = 0; i < 100; i++)
			dv[i] = new devices();
	}

	public void AddDevices(int temp, PrintStream sth) {

		if (countDv > 100)
			System.out.println("Bo nho full, ko the them moi!");
		else {
			if (temp == 1) {
				dv[countDv] = new computers();
				computers comp = new computers();
				comp.input();
				comp.discount = comp.discount();
				cp[countcp] = comp;
				dv[countDv] = cp[countcp];
				sth.println(comp);
				sum1 += comp.discount;
				countcp++;

			} else {
				dv[countDv] = new television();
				television tv = new television();
				tv.input();
				tv.discount = tv.discount();
				tev[counttv]=tv;
				dv[countDv] = tev[counttv];
				sth.println(tv);
				sum2 += tv.discount;
				counttv++;
			}
			countDv=counttv+countcp;
		}
	}

	public void output() throws FileNotFoundException {
		Scanner sc=new Scanner(new File("DEVICES.INP"));
		while (sc.hasNext())
			System.out.println(sc.nextLine());
	}

	public void sort() {
		devices temp = dv[0];
		for (int i = 0; i < countDv - 1; i++) {
			for (int j = i + 1; j < countDv; j++) {
				if (dv[i].discount > dv[j].discount) {
					temp = dv[j];
					dv[j] = dv[i];
					dv[i] = temp;
				}
			}
		}
	}

	public void DS() {
		sort();
		System.out.println("Item have lowest discount: ");
		System.out.println(dv[0].toString());

		System.out.println("Item have highest discount: ");
		System.out.println(dv[countDv - 1].toString());
	}

	public void total() {
		System.out.println("The total of all the discount amount of all the electronic devices: " + (sum1 + sum2));
	}

	public void search(int temp) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Id : ");
		int id = sc.nextInt();
		if (temp == 1) {
			for (int i = 0; i < countcp; i++) {
				if (cp[i].getId() == id) {
					System.out.println(cp[i].toString());
					break;
				}
			}
		} else {
			for (int i = 0; i < counttv; i++) {
				if (tev[i].getId() == id) {
					System.out.println(tev[i].toString());
					break;
				}
			}
		}
	}
	public void count() throws FileNotFoundException {
		Scanner sc=new Scanner(new File("DEVICES.INP"));
		String s1="Computer";
		while(sc.hasNextLine()) {
			StringTokenizer st=new StringTokenizer(sc.nextLine(),":",true);
			while(st.hasMoreTokens()) {
				String temp = st.nextToken();
				if(s1.equals(temp)){
					count1++;
			}
		}
	}
		System.out.println("Number of computer: "+count1);
}
	public void deleteArrCp(int k) {
		System.out.println(countcp);
		int c,i;
		for (c = i = 0; i < countcp; i++) {
	        if (cp[i].getId() != k) {
	            cp[c] = cp[i];
	            c++;
	        }
	    }

		countcp=c;
		System.out.println(countcp);
		countDv=counttv+countcp;

	}
	public void deletecp() throws FileNotFoundException {
		int temp=0;
		PrintStream out =new PrintStream(new File("DEVICES.INP"));
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		for(int i=0;i<countcp;i++) {
			if(cp[i].getId()==id)
			{
				deleteArrCp(id);
			}
		}
		System.out.println(counttv);
		for(int i=0;i<countcp;i++)
		{
			out.println(cp[i]);
		}
		for(int i=0;i<counttv;i++)
		{
			out.println(tev[i]);
		}
		for(int i=0;i<countcp;i++)
		{
			dv[i]=cp[i];
		}
		temp=countcp;
		for(int i=0;i<counttv;i++)
		{
			dv[temp]=tev[i];
			temp++;
		}
			
		for(int i=0;i<countDv;i++)
		{
			System.out.println(dv[i].toString());
		}
	}
	public void sortOut() {
		sort();
		for(int i=0;i<countDv;i++)
		{
			System.out.println(dv[i].toString());
		}
	}
}
