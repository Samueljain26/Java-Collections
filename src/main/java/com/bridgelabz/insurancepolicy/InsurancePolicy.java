package com.bridgelabz.insurancepolicy;

public class InsurancePolicy {
    private String policyNumber;
    private String policyholderName;
    private String expiryDate;

    // Constructor
    public InsurancePolicy(String policyNumber, String policyholderName, String expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
    }

    // Getters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    // ToString method for easy display
    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Holder: " + policyholderName + ", Expiry: " + expiryDate;
    }
}
