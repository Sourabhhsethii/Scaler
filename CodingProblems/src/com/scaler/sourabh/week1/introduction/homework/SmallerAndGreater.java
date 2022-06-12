package com.scaler.sourabh.week1.introduction.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * You are given an Array A of size N.
 *
 * Find for how many elements, there is a strictly smaller element and a strictly greater element.
 *
 *
 *
 * Input Format
 *
 * Given only argument A an Array of Integers.
 * Output Format
 *
 * Return an Integer X, i.e number of elements.
 * Constraints
 *
 * 1 <= N <= 1e5
 * 1 <= A[i] <= 1e6
 * For Example
 *
 * Example Input:
 *     A = [1, 2, 3]
 *
 * Example Output:
 *     1
 *
 * Explanation:
 *     only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.
 *
 *     3 1 2 3
 *     29 913 440 865 72 612 445 101 994 356 91 461 930 583 448 543 170 333 107 425 73 172 416 899 826 659 561 314 25 110
 *     81 953 195 622 805 440 715 497 23 174 942 184 312 382 542 166 752 919 987 454 853 160 174 327 376 583 444 792 789 942 963 687 633 755 135 680 587 150 624 69 208 587 772 768 546 131 247 107 40 583 482 784 814 451 4 149 568 584 657 607 900 341 557 107 422 119 527 33 480 904 556 83 160 174 924 92 826 855 519 359 689 280
 *     4 1 2 3 3
 *     98 293 800 679 34 498 670 551 134 396 225 780 965 550 138 804 693 714 812 584 963 25 992 672 708 39 453 69 985 733 118 946 737 617 114 92 937 381 325 575 592 942 460 532 811 5 188 745 606 370 688 703 913 275 519 853 679 241 559 117 476 111 723 118 580 875 57 434 900 278 559 24 20 47 142 316 293 10 773 111 263 953 908 441 381 689 65 290 59 142 781 752 542 349 981 452 9 144 976
 *
 *   Hint 1
 * The task is to find out the number of elements for which both strictly greater and smaller element exist in the array as well.
 * Can you think of some way in which sorting can help?
 *
 * Hint 2
 *
 * One of the easiest way to solve this problem is,
 * Find the smallest element and the greatest element of the array and then
 * traverse the array and count those elements which are (smallest < A[i] and A[i] < greatest).
 *
 * ans = 0;
 * for(int i : A)
 * {
 * if(smallest < i and i < greatest)
 * ans += 1;
 * }
 */
public class SmallerAndGreater {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input Size");
        int a = input.nextInt();
        ArrayList<Integer> inputArray = new ArrayList<>();

        for (int i = 0; i <a ; i++) {
            inputArray.add(input.nextInt());
        }
        System.out.println(solve2(inputArray));
    }

    // One For Loop => T:C-> O(N) S:C-> O(1)
    public static int solve2(ArrayList<Integer> A) {
        int ans =0;
        Collections.sort(A);
        for (int i = 1; i < A.size(); i++) {
            if(A.get(0) < A.get(i) && A.get(i) <A.get(A.size()-1)){
                ans = ans +1;
            }
        }
        return ans;
    }

    // Approach 2
    public static int solve2(int[] A) {
        int max = 0, min = 1000001;
        for(int i : A){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        int ans = 0;
        for(int i : A){
            if(i > min && i < max)
                ans++;
        }
        return ans;
    }
}
