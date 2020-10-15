package application;
import java.util.Scanner;
import entities.Rooms;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("HOW MANNY ROOMS WILL BE RENTED? ");
		int n = sc.nextInt();
		Rooms[] vect = new Rooms[10];

		for (int i = 0; i < n; i++) {
			System.out.println("RENT #" + i);
			System.out.print("NAME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("EMAIL: ");
			String email = sc.nextLine();
			System.out.print("ROOM: ");
			int room = sc.nextInt();
			vect[room] = new Rooms(name, email, room);
		}
		System.out.println();
		System.out.println("BUSY ROOMS:");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		sc.close();
	}

}
