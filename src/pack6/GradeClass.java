package pack6;

public class GradeClass {

    public int minValue(int [] a,int n){
        int i;
        int min1=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]<min1)
            {
                min1=a[i];
            }
        }
        return min1;


}
public int maxValue(int [] a,int n){
    int i;
    int max1=a[0];
    for(i=0;i<n;i++)
    {
        if(a[i]>max1)
        {
            max1=a[i];
        }
    }
    return max1;


}

public float  avgValue(int [] a,int n){
    int i;
    int sum=0;
    for(i=0;i<n;i++)
    {
       sum=sum+a[i];
    }
    float avg;
    avg=(float) sum/n;
    return avg;



}
}
