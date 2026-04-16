package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals and return an array of the non-overlapping intervals
//Input : intervals=[[1,3],[2,6],[8,10],[15,18]]
//Output : [[1,6],[8,10],[15,18]]
//Explanation : Since intervals [1,3] and [2,6] are overlapping we can merge them to form [1,6] intervals.

//hint : interval[0] > last.end → NO overlap
//interval[0] <= last.end → overlap

//time : O(nlogn)-> for traversal & sorting  space :O(n) -> for result
public class MergeIntervals {
    public static int[][] merge(int[][] intervel){
        Arrays.sort(intervel,(a, b)-> a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        for(int[] intervels: intervel){
            if(result.isEmpty() || intervels[0] > result.get(result.size()-1)[1]){
                result.add(intervels);
            }else{
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1],intervels[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {

        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result1 = merge(intervals1);

        System.out.println("Output 1:");
        print(result1);

        int[][] intervals2 = {{1,4},{4,5}};
        int[][] result2 = merge(intervals2);

        System.out.println("Output 2:");
        print(result2);
    }

    public static void print(int[][] arr) {
        for (int[] interval : arr) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
        System.out.println();
    }
}
