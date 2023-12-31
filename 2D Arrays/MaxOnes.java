public class MaxOnes {
    public static void main(String args[]){
        int n=2,m=2,maxcnt=0,max=0;
        int[][] arr={{0,0},{1,1}};
        int i,j;
        for(i=0;i<n;i++){
            int cnt=0;
            for(j=0;j<m;j++){
                if(arr[i][j]==1){
                    cnt++;
                }
            }
            if(cnt>maxcnt)
            maxcnt=cnt;
            max=j;
        }
        System.out.println(max);
    }
}
