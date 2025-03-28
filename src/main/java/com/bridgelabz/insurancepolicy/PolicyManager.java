package com.bridgelabz.insurancepolicy;

import java.util.*;

public class PolicyManager {
    private Map<String, InsurancePolicy> policies;

    public PolicyManager() {
        policies = new LinkedHashMap<>();
    }

    // Add a new policy
    public void addPolicy(InsurancePolicy policy) {
        policies.put(policy.getPolicyNumber(), policy);
    }

    // Retrieve a policy by policy number
    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policies.get(policyNumber);
    }

    // Retrieve all policies
    public List<InsurancePolicy> getPoliciesByHolder(String policyholderName) {
        List<InsurancePolicy> result = new LinkedList<>();
        for (InsurancePolicy policy : policies.values()) {
            if (policy.getPolicyholderName().equals(policyholderName)) {  // Removed equalsIgnoreCase
                result.add(policy);
            }
        }
        return result;
    }

    // Display
    public void displayAllPolicies() {
        if (policies.isEmpty()) {
            System.out.println("No policies found.");
            return;
        }
        for (InsurancePolicy policy : policies.values()) {
            System.out.println(policy);
        }
    }
}
