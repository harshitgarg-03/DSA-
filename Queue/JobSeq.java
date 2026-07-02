import java.util.*;

public class JobSeq {

    static class Job implements Comparable<Job> {
        int jobID;
        int profit;
        int deadLine;

        public Job(int jobID, int deadLine, int profit) {
            this.jobID = jobID;
            this.deadLine = deadLine;
            this.profit = profit;
        }

        @Override
        public int compareTo(Job that) {
            return that.profit - this.profit; // Descending
        }
    }

    public static void main(String[] args) {

        ArrayList<Job> list = new ArrayList<>();

        list.add(new Job(1, 4, 20));
        list.add(new Job(2, 1, 30));
        list.add(new Job(3, 1, 10));
        list.add(new Job(4, 1, 40));

        Collections.sort(list);
        
        int maxDeadline = 0;

        for (Job j : list) {
            maxDeadline = Math.max(maxDeadline, j.deadLine);
        }

        int[] slots = new int[maxDeadline + 1];
        int totalProfit = 0;

        for (Job j : list) {

            for (int k = j.deadLine; k >= 1; k--) {

                if (slots[k] == 0) {

                    slots[k] = j.jobID;
                    totalProfit += j.profit;

                    System.out.println("Job ID: " + j.jobID);

                    break;
                }
            }
        }

        System.out.println("Total Profit = " + totalProfit);
    }
}