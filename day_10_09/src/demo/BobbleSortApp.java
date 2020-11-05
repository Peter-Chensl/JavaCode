package demo;

public class BobbleSortApp{
	public static void main(String[] args) {

        int[] numbers=new int[]{2,8,5,9,10,6,4};
        for(int i=numbers.length-1;i>1;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("从小到大排序后的结果是:");
        for(int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }

}
