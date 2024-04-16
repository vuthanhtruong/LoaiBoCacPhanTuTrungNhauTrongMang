
public class truongcodene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[]=new int[] {8,8,8,9,1,3,5,2,4,2,5, 100, 99, 100};
		int N[]=new int[M.length];
		int k=0;
		for(int i=0;i<M.length;i++) {
			int count=0;
			for(int j=i+1;j<M.length;j++) {
				if(M[i]==M[j]) {
					count++;
				}
			}
			if(count==0) {
				N[k++]=M[i];
			}
		}
		System.out.println("-------------------");
		for(int i=0;i<k;i++) {
			System.out.print(N[i]+" ");
		}
	}

}
