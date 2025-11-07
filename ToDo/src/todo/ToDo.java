/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brira
 */
public class ToDo {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<String> pendingTasks = new ArrayList<>();
    private static ArrayList<String> completedTasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Método para agregar una tarea a la lista de pendientes
    public static void addTask(String task) {
        pendingTasks.add(task);
        System.out.println("Tarea '" + task + "' agregada.");
    }

    // Método para marcar una tarea como completada
    public static void completeTask(String task) {
        if (pendingTasks.contains(task)) {
            pendingTasks.remove(task);
            completedTasks.add(task);
            System.out.println("Tarea '" + task + "' completada.");
        } else {
            System.out.println("Tarea '" + task + "' no encontrada en la lista de pendientes.");
        }
    }

    // Método para mostrar las tareas pendientes
    public static void showPendingTasks() {
        if (pendingTasks.isEmpty()) {
            System.out.println("No tienes tareas pendientes.");
        } else {
            System.out.println("Tareas pendientes:");
            for (String task : pendingTasks) {
                System.out.println("- " + task);
            }
        }
    }

    // Método para mostrar las tareas completadas
    public static void showCompletedTasks() {
        if (completedTasks.isEmpty()) {
            System.out.println("No tienes tareas completadas.");
        } else {
            System.out.println("Tareas completadas:");
            for (String task : completedTasks) {
                System.out.println("- " + task);
            }
        }
    }

    // Método principal para mostrar el menú
    public static void menu() {
        while (true) {
            System.out.println("\nTo-Do List:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Completar tarea");
            System.out.println("3. Ver tareas pendientes");
            System.out.println("4. Ver tareas completadas");
            System.out.println("5. Salir");

            System.out.print("Selecciona una opción: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Escribe la tarea: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case "2":
                    System.out.print("Escribe la tarea a completar: ");
                    task = scanner.nextLine();
                    completeTask(task);
                    break;
                case "3":
                    showPendingTasks();
                    break;
                case "4":
                    showCompletedTasks();
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    return; // Salir del método y terminar el programa
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        menu();
    }
    
}
