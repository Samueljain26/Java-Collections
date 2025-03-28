package com.bridgelabz.insurancepolicy;

import java.util.List;

public class InsuranceSystem {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Adding policies
        manager.addPolicy(new InsurancePolicy("P1", "John", "2025-7-01"));
        manager.addPolicy(new InsurancePolicy("P2", "Alice", "2026-09-16"));
        manager.addPolicy(new InsurancePolicy("P3", "Brad", "2027-01-29"));

        // Retrieve a policy by number
        System.out.println("Policy Details for P1: " + manager.getPolicyByNumber("P1"));

        // Retrieve policies for a specific policyholder
        System.out.println("\nPolicies held by John:");
        List<InsurancePolicy> johnPolicies = manager.getPoliciesByHolder("John");
        for (InsurancePolicy policy : johnPolicies) {
            System.out.println(policy);
        }

        // Display all policies
        System.out.println("\nAll Insurance Policies:");
        manager.displayAllPolicies();

        /*Policy Details for P: Policy Number: P1, Holder: John, Expiry: 2025-7-01

Policies held by John:
Policy Number: P1, Holder: John, Expiry: 2025-7-01

All Insurance Policies:
Policy Number: P1, Holder: John, Expiry: 2025-7-01
Policy Number: P2, Holder: Alice, Expiry: 2026-09-16
Policy Number: P3, Holder: Brad, Expiry: 2027-01-29
         */
    }
}
