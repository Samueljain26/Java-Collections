package com.bridgelabz.votingsystem;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteMap;
    private LinkedHashMap<String, Integer> voteOrderMap;

    public VotingSystem() {
        voteMap = new HashMap<>();
        voteOrderMap = new LinkedHashMap<>();
    }

    // Method to cast a vote
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, voteMap.get(candidate)); // Maintain order
    }

    // Display votes
    public void displayVotesInOrder() {
        System.out.println("Votes in order of casting:");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display results
    public void displaySortedResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteMap);
        System.out.println("Sorted Voting Results:");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner = new Scanner(System.in);

        // Voting process
        System.out.println("Enter votes (type 'exit' to stop):");
        while (true) {
            String candidate = scanner.nextLine();
            if (candidate.equals("exit")) break;
            votingSystem.castVote(candidate);
        }

        scanner.close();

        // Display results
        System.out.println();
        votingSystem.displayVotesInOrder();
        System.out.println();
        votingSystem.displaySortedResults();
    }
}
/*Enter votes (type 'exit' to stop):
2
6
9
exit

Votes in order of casting:
2 -> 1
6 -> 1
9 -> 1

Sorted Voting Results:
2 - 1
6 - 1
9 - 1
 */