public class row_sum{
   public static void main(String[] args) {
    int[][] value={{1,2,3},{4,5,6},{7,8,9}};
    int i,j,sum=0;
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            sum=sum+value[i][j];
        }
        System.out.println(sum);
        sum=0;
    }

}
}