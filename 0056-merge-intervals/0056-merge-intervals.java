
class Solution {
    public int[][] merge(int[][] intervals) {
        // firstly sort the arrays
        if(intervals.length<2){
            return intervals;
        }

        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->{
            if(a[0]<b[0]){
                return -1;
            }else if(a[0]>b[0]){
                return 1;
            }else{
                return 0;
            }
        });

        int sp=intervals[0][0];
        int ed=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=ed){
                ed=Math.max(ed,intervals[i][1]);
            }else{
                list.add(new int[]{sp,ed});
                sp=intervals[i][0];
                ed=intervals[i][1];
            }
        }
        list.add(new int[]{sp,ed});

        return list.toArray(new int[list.size()][]);
    }
}