
public class RottenOrn {

	public static void main(String[] args) {
		int[][] arr= {{2,1,0,2,1},{1,0,1,0,1},{1,0,0,2,1}};
		int m=3;
		int n=5;
		int p=m-1;
		int q=n-1;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]==0)
				{
					arr[i][j]=7;
				}
			}
		}
//		while(true)
//		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(arr[i][j]==2)
					{
						
						if(arr[0][0]==1)
						{
							arr[0][1]=2;
							arr[1][0]=2;
						}
						else if(arr[p][q]==1)
						{
							System.out.println("hi");
							arr[p][q-1]=2;
							arr[p-1][q]=2;
						}
						else if(arr[0][q]==1)
						{
							arr[0][q-1]=2;
							arr[1][q]=2;
						}
						else if(arr[p][0]==1)
						{
							arr[p-1][0]=2;
							arr[p][1]=2;
						}
						else if(arr[0][j]==1)
						{
							arr[0][j-1]=2;
							arr[0][j+1]=2;
							arr[1][j]=2;
						}
						else if(arr[i][0]==1)
						{
							arr[i-1][0]=2;
							arr[i+1][0]=2;
							arr[i][1]=2;
						}
						else if(arr[i][q]==1)
						{
							arr[i-1][q]=2;
							arr[i+1][q]=2;
							arr[i][q-1]=2;
						}
						else if(arr[m][j]==1)
						{
							arr[p][j-1]=2;
							arr[p][j+1]=2;
							arr[p-1][j]=2;
						}
					}
				}
			}
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
//		}
	}

}
