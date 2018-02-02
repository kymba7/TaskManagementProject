package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
public static int max =30;
public static int workmax =50;
public static int workabil = 5;
ArrayList<Worker>workerList=new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String UserYN = "Y";
        double taskPts = random.nextInt(max) + 1;
        Task project = new Task(taskPts);

        while (UserYN.equalsIgnoreCase("Y")) {

            double workerAbil = random.nextInt(workabil) + 1;
            double taskHrs = Math.ceil(taskPts / workerAbil);
            Worker projectWorker = new Worker(workerAbil);
            System.out.println("Your Task with " + project.points + " points, will take " + taskHrs
                    + " hours to complete with Worker " + projectWorker.empNum + ", who has a abilty rating of " + projectWorker.ability + ".");
            System.out.println("Would you like to add another worker to the task?");
            UserYN = sc.nextLine();


        }
    }
}
