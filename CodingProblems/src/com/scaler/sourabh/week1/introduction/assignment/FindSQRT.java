package com.scaler.sourabh.week1.introduction.assignment;

/**
 * You have to follow the following steps to find the sqrt of an integer N.
 *
 * Consider L = 1, R = N, and cnt = 0
 *
 * STEP 1: MID = (floor)(L+R)/2 and cnt += 1
 *
 * STEP 2: if ((MID * MID) == N), then go to STEP 5 else go to STEP 3.
 *
 * STEP 3: if ((MID * MID) < N), then L = MID+1 and go to STEP 1 else STEP 4.
 *
 * STEP 4: if ((MID * MID) > N), then R = MID - 1 and go to STEP 1.
 *
 * STEP 5: PRINT MID.
 *
 * If the value of N is 36, what will be the value of cnt?
 */
public class FindSQRT {
    public static void main(String[] args) {
        findCnt(36);
    }

    public static void findCnt(int n){
        int l = 1;
        int r = n;
        int cnt = 0;
        while (l<r) {
            int mid = (int) Math.floor((l + r) / 2);
            cnt +=1;
            if (mid * mid == n) {
                System.out.println(mid);
                break;
            }
            else if (mid * mid < n) l = mid + 1;
            else if (mid * mid > n) r = mid - 1;
        }
        System.out.println("Ans cnt->" + cnt);
    }
}
