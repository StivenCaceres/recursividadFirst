import java.io.*;

public class recursividad 
{
	public static void main (String[] args)
	{
		int[] array = {2,3,6,3,8,4,5,0};
		int n = 0;
		/**
		array = ordenar(array,n);
		for (int i = 0 ; i < array.length; i++)
		{
			System.out.print(array[i]+ "  ");
		}
		**/
		System.out.println(sumaPares(4));
	}
	
	public static int fibonacci(int f1,int f2, int n) 
	{
		if (n != 0)
		{
			return fibonacci(f2,f1+f2,n-1);
		}
		return f1;
	}
	public static int eleccion(int r, int n) 
	{
		return (factorial(n) /(factorial(r) * factorial(n-r)));
	}
	public static int factorial(int n)
	{
		if (n != 0)
		{
			return factorial(n-1)*n;
		}
		return 1;
	}
	public static int[] ordenar(int[] array,int n)
	{
		if (array.length == 1)
		{
			return array;
		}else{
			if(n == array.length-1)
			{
				return array;
			}else {
				for (int i = n+1 ; i < array.length;i++)
				{
					if(array[i] < array[n])
					{
						int menor = array[i];
						array[i] = array[n];
						array[n] = menor;
					}
				}
				return ordenar(array,n+1);
			}
		}
	}
	
	public static int sumaFirst(int n)
	{
		if(n != 0)
		{
			return sumaFirst(n-1)+n; 
		}
		return 0;
	}
	
	public static int sumaPares(int n)
	{
		if(n != 0){
			if(n % 2 == 0){
				return sumaPares(n-2)+n;
			}else {
				return -1;
			}
		}
		return 0;
	}
}
