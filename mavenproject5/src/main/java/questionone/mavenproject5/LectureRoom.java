/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questionone.mavenproject5;

/**
 *
 * @author CLIENT
 */
public class LectureRoom {
    private int students;
    private final boolean[] lights;

    public LectureRoom() {
        students = 0;
        lights = new boolean[3]; // Assuming 3 lights
    }

    public void addStudents(int count) {
        students += count;
        System.out.println(count + " students added. Total students: " + students);
    }

    public void removeStudents(int count) {
        if (count > students) {
            students = 0;
        } else {
            students -= count;
        }
        System.out.println(count + " students removed. Total students: " + students);
    }

    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " turned on.");
        } else {
            System.out.println("Invalid light number.");
        }
    }

    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " turned off.");
        } else {
            System.out.println("Invalid light number.");
        }
    }

    public void displayStatus() {
        System.out.println("Total students: " + students);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + ": " + (lights[i] ? "On" : "Off"));
        }
    }
}

