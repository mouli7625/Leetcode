class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                pos=i;
            }
        }
        if(pos!=-1)
        {
            return pos;
        }
        else
        {
            int size=0;
            size=nums.length+1;
           List<Integer> l= new ArrayList<Integer>(size);
            l.add(target);
            for(int i=0;i<nums.length;i++)
            {
                l.add(nums[i]);
            }
            Collections.sort(l);
            int index=l.indexOf(target);
            return index;
        }
        
    }
}