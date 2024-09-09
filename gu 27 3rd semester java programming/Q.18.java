// Problem Statement:
// You are tasked with developing a system to track unique user activities in a social media application. Each user can perform various activities, and you need to ensure that each activity is only logged once per user. Your task is to create a class that maintains user activity logs, ensuring that each activity for a user is unique.

// Description:
// Implement a class UserActivityTracker with methods to add activities and display unique activities.
// Use a Map<String, Set<String>> where the key is the userId and the value is a Set of activities performed by that user.
// Implement the following methods:
// addActivity(String userId, String activity): Adds an activity for the specified user. If the activity already exists for the user, it should not be added again.
// displayActivities(String userId): Displays all unique activities performed by the specified user in a sorted order.

// Input Format:
// The first line contains an integer n, the number of operations.
// Each of the next n lines contains a command followed by the necessary details:
// ADD_ACTIVITY userId activity
// DISPLAY_ACTIVITIES userId
// Output Format:
// For each DISPLAY_ACTIVITIES command, output the list of unique activities for the specified user, each on a new line in sorted order. If the user has no activities, print "No activities found."

// Sample Input:
// 6
// ADD_ACTIVITY user1 login
// ADD_ACTIVITY user1 post
// ADD_ACTIVITY user1 login
// ADD_ACTIVITY user2 login
// DISPLAY_ACTIVITIES user1
// DISPLAY_ACTIVITIES user2
// Sample Output:
// login
// post
// login
  
//==============================================================================================
//-----------
//Source code:
//----------

import java.util.*;

class UserActivityTracker {
    //..... YOUR CODE STARTS HERE .....
    
    private Map<String, Set<String>> userActivities;

    public UserActivityTracker() {
        userActivities = new HashMap<>();
    }

    public void addActivity(String userId, String activity) {
        userActivities.putIfAbsent(userId, new HashSet<>());
        Set<String> activities = userActivities.get(userId);
        activities.add(activity);
    }

    public void displayActivities(String userId) {
        if (!userActivities.containsKey(userId) || userActivities.get(userId).isEmpty()) {
            System.out.println("No activities found.");
            return;
        }

        Set<String> activities = userActivities.get(userId);
        List<String> sortedActivities = new ArrayList<>(activities);
        Collections.sort(sortedActivities);
        for (String activity : sortedActivities) {
            System.out.println(activity);
        }
    }
    
    //..... YOUR CODE ENDS HERE .....
}

public class Main {
    public static void main(String[] args) {
        //..... YOUR CODE STARTS HERE .....
    
    Scanner scanner = new Scanner(System.in);
        UserActivityTracker tracker = new UserActivityTracker();

        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ", 3);

            if (parts[0].equals("ADD_ACTIVITY")) {
                String userId = parts[1];
                String activity = parts[2];
                tracker.addActivity(userId, activity);
            } else if (parts[0].equals("DISPLAY_ACTIVITIES")) {
                String userId = parts[1];
                tracker.displayActivities(userId);
            }
        }
    
        //..... YOUR CODE ENDS HERE .....
    }
}

