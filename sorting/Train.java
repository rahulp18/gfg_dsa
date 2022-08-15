package sorting;

import java.util.Arrays;

public class Train {
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        System.out.println(findPlatform(arr, dep, arr.length));
    }

    public static int findPlatform(int arr[], int dep[], int n) {
        // add your code here
        Time[] res = new Time[n];
        for (int i = 0; i < n; i++) {
            res[i] = new Time(arr[i], dep[i]);
        }
        Arrays.sort(res);
        int platform = 0;
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (res[platform].dispature > res[i].arrival) {
                // res[platform].dispature = Math.max(res[platform].dispature,
                // res[i].dispature);
                // res[platform].arrival = Math.max(res[platform].arrival, res[i].arrival);
                ans++;
            } else {
                platform++;
                res[platform] = res[i];
            }
        }
        return ans;
    }

}

class Time implements Comparable<Time> {
    int arrival;
    int dispature;

    Time(int arrival, int dispature) {
        this.arrival = arrival;
        this.dispature = dispature;

    }

    public int compareTo(Time a) {
        return this.arrival - a.arrival;
    }
}
