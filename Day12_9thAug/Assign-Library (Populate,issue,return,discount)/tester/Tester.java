package tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.app.core.Library;

import custom_exception.LibraryHandlingException;

import static com.app.core.Library.sdf;
import static utils.CollectionUtils.*;
public class Tester {

	public static void main(String[] args) {

try (Scanner sc= new Scanner(System.in)){
	
	ArrayList<Library> lib=populatelibrary();
	boolean exit= false;
	while (!exit) {
		System.out.println("1:ViewAll 2:Issue Book 3:Return Book 4:Discounted List 100:exit");
		try {
			switch (sc.nextInt()) {
			
			case 1:
				System.out.println("All Library Details are");
				for(Library l :lib)
					System.out.println(l);
				break;
				
			
			case 2:
				System.out.println("Enter isbn Number of Req book");
				int issue =sc.nextInt();
				System.out.println("Enter Quantity");
				int quant =sc.nextInt();
				
				int index=lib.indexOf(new Library(issue));
				if (index == -1)
					throw new LibraryHandlingException("Invalid isbn Number");
				Library l = lib.get(index);
				l.setQuantity(l.getQuantity()-quant);
				System.out.println("Updated Details of Libarary");
				for(Library l1 : lib)
					System.out.println(l1);
				break;
				
			
			case 3:
				System.out.println("Enter isbn Number of The Book");
				int issue1 =sc.nextInt();
				System.out.println("Enter Quantity You are returning");
				int quant1 =sc.nextInt();
				
				int index1=lib.indexOf(new Library(issue1));
				if (index1 == -1)
					throw new LibraryHandlingException("Invalid isbn Number");
				Library l1 = lib.get(index1);
				l1.setQuantity(l1.getQuantity()+quant1);
				System.out.println("Updated Details of Libarary");
				for(Library l11 : lib)
					System.out.println(l11);
				break;
			
			
			case 4:
				Date oldbook = sdf.parse("01-01-2000");
				for (Library l2 : lib)
					if (l2.getPublish_date().before(oldbook))
						l2.setPrice(l2.getPrice()*0.90);
				System.out.println("Discounted List are: ");
				for (Library l3 : lib)
					System.out.println(l3);
				break;
			
			
			case 100:
				exit=true ;
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
} catch (Exception e) {
	// TODO: handle exception
}

	}

}
