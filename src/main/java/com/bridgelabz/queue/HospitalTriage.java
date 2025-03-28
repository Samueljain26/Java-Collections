package com.bridgelabz.queue;

import java.util.*;

public class HospitalTriage {


        public static void main(String[] args) {

            PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of patients: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter patient number (ID) and severity: ");
                int id = sc.nextInt();
                int severity = sc.nextInt();
                queue.add(new int[]{id, severity});
            }

            System.out.println("\nTreatment Order (Patient ID - Severity):");
            while (!queue.isEmpty()) {
                int[] patient = queue.poll();
                System.out.println("Patient " + patient[0] + " - Severity: " + patient[1]);
            }

            sc.close();
        }
    }


