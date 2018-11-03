
public class BubbleSort {
	
	public Integer[] bubbleSort(Integer[] array){
		//Integer[] sortedarray = new Integer[x];
	if (array!= null){
		int tmp =0;
		for (int i =0; i<array.length-1; i++){
			for (int j =0; j<array.length; j++){
				if(array[i]!=null && array[j]!=null){
					if (array[i] < array[j]){
						tmp =array[j];
						array[j] = array[i];
						array[i] =tmp;
					}
				}
			}
		}
	}
				
		return array;
	}
	
	
	public Integer[] selectionSort(Integer[] arr){
		int n =arr.length;
		int i, j, min_indx;
		int tmp =0;
		for (i=0; i<n-1;i++){
			min_indx=i;
			for(j=i+1;j<n;j++){
				if(arr[j]!= null&& arr[min_indx]!=null){
				if(arr[j]<arr[min_indx]){
					min_indx=j;
				}
				
				tmp=arr[min_indx];
				arr[min_indx] = arr[i];
				arr[i] =tmp;
				}
				}
		}
		return arr;
	}
	
	public Integer[] insertioinSort(Integer[] arr){
		
		int n=arr.length;
		for (int i=1;i<n; ++i){
			if(arr[i] != null ){
			int key =arr[i];
			int j=i-1;
			
			while(j>0&& arr[j] > key){
				if(arr[j+1] != null && arr[j]!= null){
				arr[j+1] =arr[j];
				j=j-1;
			}
				}
			arr[j+1] =key;
		
			}
			}
		return arr;
	}
	void merge(Integer arr[], int l, int m, int r){
		int i,j,k;
		int n1 = m-l+1;
		int n2 = r-m;
		
		Integer Lef[] = new Integer[n1];
		Integer Rig[]= new Integer[n2];
		
		
		for(i =0; i<n1;i++)
			Lef[i]=arr[l+1];
		for(j=0; j<n2;j++)
			Rig[j]= arr[m+1+j];
		
		i=0;
		j=0;
		k=l;
		while(i<n1 && j<n2){
			if(Lef[k]<=Rig[j]){
				arr[k] =Lef[i];
				i++;
			}
			else {
				arr[k]=Rig[j];
				j++;
			}
			k++;
		}
		while(l<n1){
			arr[k]=Lef[i];
			i++;
			k++;
			}
		while(j<n2){
			arr[k]=Rig[j];
			j++;
			k++;
			}
		}
	
	Integer[] mergeSort(Integer[] arr, int l, int r){
		if(l<r)
		{
			int m=l+(r-l)/2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			
			merge(arr, l, m, r);
		}
		return arr;
	}
	
	   void printArray(Integer[] arr)
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	
	public static void main(String args[]){
		Integer[] arr = new Integer[7];
		arr[0]=10;
		arr[1]=6;
		arr[2]=7;
		arr[3]=8;
		arr[4]=9;
		arr[5]=3;
		arr[6]= 2;
		
		
		String s = "i am the maximous"; 
		char[] cs =s.toCharArray();
		String temp ="";
		for(int i=cs.length-1; i>=0;i-- ){
			temp = temp + cs[i];
		}
		System.out.println(s);
		System.out.println(temp);
		
		for(int i=0; i< arr.length; i++){
			System.out.println(arr[i]);
		}

		
		BubbleSort bs = new BubbleSort();
		arr=bs.bubbleSort(arr);
		bs.printArray(arr);
		System.out.println("________________________bubble sort complete _____________________");
		
		arr=bs.selectionSort(arr);
		bs.printArray(arr);
		System.out.println("________________________Insertion sort complete _____________________");
		
		arr=bs.insertioinSort(arr);
		bs.printArray(arr);
		System.out.println("________________________Merge sort complete _____________________");
		
		if(arr[0]!= null && arr[arr.length-1]!= null){
		arr=bs.mergeSort(arr, arr[0],arr[arr.length-1]);
		bs.printArray(arr);
		}
		System.out.println("________________________Insertion sort complete _____________________");
	}
	
	

}
