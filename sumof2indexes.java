int a[] = {10,-20,10,30,-10};
			int k=0;
			for(int i=0,j=i+1,m=a.length-1,n=m-1;i<a.length-1;i++,j++,m--,n--)
			{	
				if(a[i]+a[j]==-10 ||a[m]+a[n]==-10 ) {
					k++;
				}
			}
			System.out.println(k);
