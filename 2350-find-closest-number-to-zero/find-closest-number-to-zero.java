class Solution {
        public int findClosestNumber(int[] nums) {
                int closest = nums[0];
                        
                                for (int i = 1; i < nums.length; i++) {
                                            int currentNum = nums[i];
                                                        
                                                                    if (Math.abs(currentNum) < Math.abs(closest)) {
                                                                                    closest = currentNum;
                                                                                                } 
                                                                                                            else if (Math.abs(currentNum) == Math.abs(closest) && currentNum > closest) {
                                                                                                                            closest = currentNum;
                                                                                                                                        }
                                                                                                                                                }
                                                                                                                                                        
                                                                                                                                                                return closest;
                                                                                                                                                                    }
                                                                                                                                                                    }

