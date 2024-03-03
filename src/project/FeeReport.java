package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FeeReport {

	private static List<Accountant> accountants = new ArrayList<>();
	private static List<Student> students = new ArrayList<>();
	private static int uniquelyIdAccountant = 1;
	private static int uniquelyIdStudent = 1;
	private static Accountant loggedIdAccountant = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wel-Come");
		feeReport(scanner);
	}

	public static void feeReport(Scanner scanner) {
		for (;;) {
			System.out.println("1.Admin Login \n2.Accountant Login \n3.Exit");

			switch (scanner.nextInt()) {
			case 1: {
				System.out.println("Name :admin \nPassword :admin123");
				adminLogin(scanner);

				break;
			}
			case 2: {
				accountantLogin(scanner);
				break;
			}
			case 3: {
				System.out.println("Exit Successfully...!");
				System.exit(1);
				break;
			}
			default:
				System.out.println("Invalid credentials...!");
				break;
			}

		}

	}

	public static void adminSection(Scanner scanner) {
		System.out.println("1.Add Accountant \n2.View Accountant \n3.Logout");
		for (;;) {
			switch (scanner.nextInt()) {
			case 1: {
				addAccountant(scanner);
				break;
			}
			case 2: {
				viewAccountant();
				adminSection(scanner);
				break;
			}
			case 3: {
				System.out.println("Logout Successfully...!");
				feeReport(scanner);
				break;
			}
			default:
				System.out.println("Invalid credentials...!");

				break;
			}
		}
	}

	public static void adminLogin(Scanner scanner) {

		System.out.println("Enter the Name :");
		String name = scanner.next();
		System.out.println("Enter the password :");
		String password = scanner.next();
		if (name.equals("admin") || password.equals("admin123")) {
			System.out.println("Login Successfuly......!");
			adminSection(scanner);

		} else {
			System.out.println("Invalid credentials ");
		}
	}

	public static void addAccountant(Scanner scanner) {
		System.out.println("Enter Your Name :");
		String name = scanner.next();
		System.out.println("Enter Your Password :");
		String password = scanner.next();
		System.out.println("Enter Your Email :");
		String email = scanner.next();
		System.out.println("Enter Your Contact No :");
		long contact_no = scanner.nextLong();
		int id = uniquelyIdAccountant++;
		Accountant dbAccountant = new Accountant(id, name, password, email, contact_no);
		accountants.add(dbAccountant);
		System.out.println("Accountant Add Successfully...!");
		System.out.println("Generted Accountant ID :" + id);
		adminSection(scanner);

	}

	public static void viewAccountant() {
		if (accountants.isEmpty()) {
			System.out.println("No Accountant in the system");
		} else {
			for (Accountant accountant : accountants) {
				System.out.println(accountant);

			}
		}
	}

	private static void accountantLogin(Scanner scanner) {
		System.out.println("Enter Your Email :");
		String email = scanner.next();
		System.out.println("Enter Your Password :");
		String password = scanner.next();
		System.out.println(accountants);
		if (accountants.isEmpty()) {
			System.out.println("Email OR Password is not present.....try again");
		} else {
			for (Accountant accountant : accountants) {
				if (accountant.getEmail().equals(email) || accountant.getPassword().equals(password)) {
					loggedIdAccountant = accountant;
					System.out.println("Login Successfully....!");
					accountantSection(scanner);
				}
			}
		}

	}

	private static void accountantSection(Scanner scanner) {
		System.out.println("1.Add Student \n2.Veiw Student \n3.Update Student \n4.Due Fee \n5.Logout");
		switch (scanner.nextInt()) {
		case 1: {
			addStudent(scanner);
			accountantSection(scanner);

			break;
		}
		case 2: {
			veiwStudent();
			accountantSection(scanner);
			break;
		}
		case 3: {
			updateStudent(scanner);
			accountantSection(scanner);
			break;
		}
		case 4: {
			dueFee();
			accountantSection(scanner);
			break;
		}
		case 5: {
			System.out.println("Logout Successfully....!");
			feeReport(scanner);
			break;
		}
		default:
			System.out.println("Invalid credentials...!");
			break;
		}

	}

	public static void addStudent(Scanner scanner) {
		System.out.println("Enter Your First Name :");
		String first_name = scanner.next();
		System.out.println("Enter Your Last Name :");
		String last_name = scanner.next();
		System.out.println("Enter Your Email :");
		String email = scanner.next();
		System.out.println("Enter Your Course :");
		String course = scanner.next();
		System.out.println("Enter Total Fee  :");
		double fee = scanner.nextDouble();
		System.out.println("Enter You paid fee  :");
		double paid = scanner.nextDouble();
		double due = fee - paid;
		scanner.nextLine();
		System.out.println("Enter Your Address :");
		String address = scanner.nextLine();
		System.out.println("Enter Your City :");
		String city = scanner.nextLine();
		System.out.println("Enter Your State :");
		String state = scanner.nextLine();
		System.out.println("Enter Your Country :");
		String country = scanner.nextLine();
		System.out.println("Enter Your Contact NO :");
		long phone_no = scanner.nextLong();

		int id = uniquelyIdStudent++;
		Student dbStudent = new Student(id, first_name, last_name, course, fee, paid, due, address, city, state,
				country, phone_no);
		students.add(dbStudent);
		System.out.println("Student Add Successfully...!");
		System.out.println("Generted Student ID :" + id);

	}

	public static void veiwStudent() {
		if (students.isEmpty()) {
			System.out.println("No Student in the System");
		} else {
			for (Student student : students) {
				System.out.println(student);
			}
		}
	}

	public static void updateStudent(Scanner scanner) {
		System.out.println("Enter the  ID to Update :");
		int id = scanner.nextInt();
		scanner.nextLine();
		boolean found = false;
		for (Student student : students) {
			if (student.getId() == id) {
				found = true;
				System.out.println("Enter Your First Name :");
				String first_name = scanner.next();
				System.out.println("Enter Your Last Name :");
				String last_name = scanner.next();
				System.out.println("Enter Your Email :");
				String email = scanner.next();
				System.out.println("Enter Your Course :");
				String course = scanner.next();
				System.out.println("Enter Total Fee  :");
				double fee = scanner.nextDouble();
				System.out.println("Enter You paid fee  :");
				double paid = scanner.nextDouble();
				double due = fee - paid;
				scanner.nextLine();
				System.out.println("Enter Your Address :");
				String address = scanner.nextLine();
				System.out.println("Enter Your City :");
				String city = scanner.nextLine();
				System.out.println("Enter Your State :");
				String state = scanner.nextLine();
				System.out.println("Enter Your Country :");
				String country = scanner.nextLine();
				System.out.println("Enter Your Contact NO :");
				long phone_no = scanner.nextLong();
				student.setFirst_name(first_name);
				student.setLast_name(last_name);
				student.setCourse(course);
				student.setFee(fee);
				student.setPaid(paid);
				student.setDue(due);
				student.setAddress(address);
				student.setCity(city);
				student.setState(state);
				student.setCountry(country);
				student.setPhone_no(phone_no);

				System.out.println("Student Update Successfully...!");
				break;
			}
		}
		if (!found) {
			System.out.println("Student With Given Id Not Found");
		}

	}

	public static void dueFee() {
		boolean found = false;
		for (Student student : students) {
			if (student.getDue() > 0) {
				found = true;
				System.out.println(student);
			}
		}
		if (!found) {
			System.out.println("No Student With Due Fee");
		}
	}

}
