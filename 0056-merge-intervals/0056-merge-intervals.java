class Solution {
    public int[][] merge(int[][] intervals) {
        // int n = intervals.length;
        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // List<int[]> ans = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        //     int s = ans.size();
        //     if (ans.isEmpty() || (ans.get(s - 1)[1] < intervals[i][0])) {
        //         ans.add(intervals[i]);
        //     } else {
        //         if (ans.get(s - 1)[1] >= intervals[i][0]) {
        //             ans.get(s - 1)[1] = Math.max(ans.get(s - 1)[1], intervals[i][1]);
        //         }
        //     }
        // }
        // return ans.toArray(new int[ans.size()][]);
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int s=ans.size();
            if(ans.isEmpty()||ans.get(s-1)[1]<intervals[i][0]){
                ans.add(intervals[i]);
            }else{
                if(ans.get(s-1)[1]>=intervals[i][0]){
                    ans.get(s-1)[1]=Math.max(ans.get(s-1)[1],intervals[i][1]);
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}