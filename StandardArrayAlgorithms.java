import java.util.Arrays;

/*
 * Activity 3.6.4
 */
public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    

    //Sum and average
    int sum = 0;
    for (int i = 0; i < goals.length; i++)
      sum += goals[i];
    double average = ((double) sum)/((double) goals.length);
    System.out.println("All goals: " + sum);
    System.out.println("Average goals: " + average);

    int max = goals[0];
    int min = goals[0];
    for (int i = 0; i < goals.length; i++) {
        if (goals[i] > max) {
            max = goals[i];
        }
        if (goals[i] < min) {
            min = goals[i];
        }
    }
    System.out.println("Max goals: " + max);
    System.out.println("Max goals: " + min);



    //find mode
    int[] goalCounter = new int[10];
    for (int g: goals) {
        goalCounter[g]++;
    }
    int mode = 0;
    int modeMax = goalCounter[0];
    for (int i = 0; i < goalCounter.length; i++) {
        if (goalCounter[i] > modeMax) {
            modeMax = goalCounter[i];
            mode = i + 1;
        }
    }
    System.out.println("Mode: " + mode);

       


    Player[] players = {new Player("Alex", 12), new Player("Aiden", 13),
                    new Player("Bobbie", 18), new Player("Blaine", 20),
                    new Player("Chris", 15), new Player("Charlie", 15) };

    boolean hasValue = false;

    int p = 0;
    while ((hasValue == false) && (p < players.length)) {
        if (players[p].getAge() >= 18) {
            hasValue = true;
        }
        p++;
    }
    System.out.println("18 or older found: " + hasValue);

    boolean allHaveValue = true;
    p = 0;
    while ((allHaveValue == true) && (p < players.length)) {
        if (players[p].getAge() >= 21) {
            allHaveValue = false;
        }
        p++;
        
    }
    System.out.println("All younger than 21: " + allHaveValue);

    int numFifteen = 0;
    for (Player player : players) {
        if (player.getAge() == 15) {
            numFifteen++;
        }
    }
    System.out.println("Number of 15 year old players: " + numFifteen);

    for (int i = 0; i < players.length; i += 2) {
        String names = players[i].getName() + " and " + players[i+1].getName();
        System.out.println(names);
    }
    
    //moves f to front of array
    String[] arr = {"A", "B", "C", "D", "E", "F"};
    for (int i = arr.length; i > 1; i--) {
        String tmp = arr[i-1];
        arr[i-2] = arr[i-1];
        arr[i-1] = tmp;
    }
    //reverses the elements in the array
    String[] arr2 = {"A", "B", "C", "D", "E", "F"};
    for (int i = 0; i < arr2.length/2; i++) {
        String tmp = arr[i];
        arr[i] = arr[arr2.length-i-1];
        arr[arr2.length-i-1] = tmp;
    }


  }
  
}