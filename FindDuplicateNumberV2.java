package com.irinaserova;
// Find duolicated number

import java.util.HashSet;
import java.util.Set;

class FindDuplicateNumberV2 {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
}