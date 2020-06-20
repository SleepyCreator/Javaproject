package electronic_device_management;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class managerDV {
	public static void main(String[] args) throws IOException {
		PrintStream out =new PrintStream(new File("DEVICES.INP"));
		arrayOfDevices lgd = new arrayOfDevices();
		Scanner in = new Scanner(System.in);
	int x;
	do {
		System.out.println("\n\t\t----------------------------------");

		System.out.println("\t\t|0. Exit\t\t\t\t |");
		System.out.println("\t\t|1. Add Computer\t\t\t\t |");
		System.out.println("\t\t|2. Add Television\t\t\t |");
		System.out.println("\t\t|3. Display all the information of the electronic devices \t\t |");
		System.out.println("\t\t|4. The highest or lowest discount\t\t |");
		System.out.println("\t\t|5. Total\t\t |");
		System.out.println("\t\t|6. Search computer from id\t\t |");
		System.out.println("\t\t|7. Counts computer \t\t |");
		System.out.println("\t\t|8. Delete all the information of an electronic device(Computer) \t\t |");
		System.out.println("\t\t|9. Sort \t\t |");
		System.out.println("\t\t--------------------------------------");
		x = in.nextInt();
		switch (x) {
		case 1:
			lgd.AddDevices(1,out);;
			break;
		case 2:
			lgd.AddDevices(2,out);
			break;
		case 3:
			lgd.output();
			break;
		case 4:
			lgd.DS();
			break;
		case 5:
			lgd.total();
			break;
		case 6:
			lgd.search(1);;
			break;
		case 7:
			lgd.count();
			break;
		case 8:
			lgd.deletecp();
			break;
		case 9:
			lgd.sortOut();
			break;
		}
	} while (x != 0);
	System.out.println("");
	out.close();
}
}
