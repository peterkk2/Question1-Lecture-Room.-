/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package questionone.mavenproject5;

/**
 *
 * @author CLIENT
 */
import java.util.Scanner;

public class LectureRoomControl {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LectureRoom room = new LectureRoom();
            char choice;
            
            do {
                System.out.println("Main Menu:");
                System.out.println("W - Add students");
                System.out.println("X - Remove students");
                System.out.println("Y - Turn on light");
                System.out.println("Z - Turn off light");
                System.out.println("Q - Quit");
                System.out.print("Enter your choice: ");
                choice = scanner.next().charAt(0);
                
                switch (choice) {
                    case 'W' -> {
                        System.out.print("Enter number of students to add: ");
                        int addCount = scanner.nextInt();
                        room.addStudents(addCount);
                    }
                    case 'X' -> {
                        System.out.print("Enter number of students to remove: ");
                        int removeCount = scanner.nextInt();
                        room.removeStudents(removeCount);
                    }
                    case 'Y' -> {
                        System.out.print("Enter light number to turn on (1-3): ");
                        int lightOn = scanner.nextInt();
                        room.turnOnLight(lightOn);
                    }
                    case 'Z' -> {
                        System.out.print("Enter light number to turn off (1-3): ");
                        int lightOff = scanner.nextInt();
                        room.turnOffLight(lightOff);
                    }
                    case 'Q' -> System.out.println("Quitting program.");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
                
                room.displayStatus();
            } while (choice != 'Q');
        }
    }
}

