import java.io.*;

public class recursividad 
{
	public static BufferedReader br=new BufferedReader
			(new InputStreamReader(System.in));
	
	public static void main (String[] args) throws NumberFormatException, IOException
	{
		int menu;
		System.out.println("WELCOME\n\n"
				+ "Este programa realizara algunas operasiones\n"
				+ "matematicas pero de forma recursiva");
		do{
			System.out.println("\nSeleciona la operacion que deseas realizar\n"
				+ "1. fibonacci\n"
				+ "2. Elecciones\n"
				+ "3. Ordenar\n"
				+ "4. sumatoria\n"
				+ "5. Suma pares\n"
				+ "6. MCD\n"
				+ "7. Entero a Binario\n"
				+ "8. Binarion a Entero\n"
				+ "9. Suma de un arreglo\n"
				+ "10. Invertir arreglo\n"
				+ "11. Reultado de una funcion espeifica\n"
				+ "12. Palabra palindrome\n"
				+ "13. Tipos de sumas\n"
				+ "0. Terminar");
			do {	
				menu = Integer.parseInt(br.readLine());
				if (menu > 13 || menu < 0)
					System.out.println("Numero no valido ingresalo de nuevo");
			}while (menu > 13 || menu < 0);
			
			switch (menu)
			{
				case 0:
					System.out.println("\nGood-bye\n");
				break;
				case 1:
					int limit;
					System.out.println("Te mostrare el numero de la posicion que quieras\n"
							+ "Escribe la posicion para enseñarte el numero");
					do {
						limit = Integer.parseInt(br.readLine());
						if (limit == 0)
							System.out.println("numero no valido");
					}while (limit == 0);
					System.out.println("R://\t" + fibonacci(1,1,limit)+ "\n");
				break;
				case 2:
					int r,n;
					System.out.println("Te dire cuantas maneras diferentes tienes para\n"
									 + "elegir \"r\" cosas distintas en un conjunto de \n"
									 + "\"n\" cosas\n");
					do {
						System.out.println("ingrse el numero de \"r\":");
						r = Integer.parseInt(br.readLine());
					}while(r < 0);
					do {
						System.out.println("ingrse el numero de \"n\":");
						n = Integer.parseInt(br.readLine());
					}while(n < 0);
						System.out.println("R://\t" + eleccion(r,n));
				break;
				case 3:
					System.out.println("Te ordenare la secuensa de numeros que quieras\n"
							+ "Escribe una secuensia de numeros separados por comas \",\"");
					
					String read = br.readLine() ;
					String[] read2 = read.split(",");
					int [] numbers = new int[read2.length];
					for (int i = 0; i < read2.length; i++)
						numbers[i] = Integer.parseInt(read2[i]);

					System.out.print("R://\t");
					numbers = ordenar(numbers,0);
					for (int i = 0; i <read2.length; i++)
						System.out.print("[" + numbers[i] + "] ");
				break;
				case 4:
					System.out.println("Te debolvere el resultado de la sumatoria\n"
							+ "Escribe el numero:");
					int suma = Integer.parseInt(br.readLine());
					System.out.println("R://\t" + sumaFirst(suma));
				break;
				case 5:
					System.out.println("Te sumare los numero pares\n"
							+ "Escribe un numero PAR: ");
					int sumaPar = Integer.parseInt(br.readLine());
					int result = sumaPares(sumaPar);
					if (result == -1)
						System.out.println("ERROR\n(tiene que ser un numero par)");
					else
						System.out.println("R://\t" + result);
				break;
				case 6:
					System.out.println("Te dire el maximo comun divisor entre dos numeros\n"
							+ "Escribe el primer numero");
					int num1 = Integer.parseInt(br.readLine());
					System.out.println("Ecribe el segundo numero");
					int num2 = Integer.parseInt(br.readLine());
					if(num1>num2)
						System.out.println("R://\t"+MCD(num1, num2));
					else
						System.out.println("R://\t"+MCD(num2, num1));
				break;
				case 7:
					String numBin = "";
					System.out.println("Te transformare un numero entero a binario\n"
							+ "ingresa el numero  que quieres transformar");
					int bin = Integer.parseInt(br.readLine());
					System.out.print("R://\t");
					BIN(bin, numBin);
				break;
				case 8:
					System.out.println("Te transformare un numero Binario a Entero\n"
							+ "ingrea el numero binario");
					boolean verifyBin = false;
					boolean verify2 = true;
					int[] arrayBin; 
					do {
						String numBinario = br.readLine();
						String[] stringBin = new String [numBinario.length()];
						arrayBin = new int [numBinario.length()];
						numBinario += "";
						stringBin = numBinario.split("");
						for(int i = 0; i < stringBin.length; i++) {
							if (stringBin[i].equals("1") || stringBin[i].equals("0"))
								arrayBin[i] = Integer.parseInt(stringBin[i]);
							else {
								System.out.println("El numero "+ stringBin[i] +" no es valido\n"
										+ "ingresa el numero otra vez");
								verify2 = false;
								i = stringBin.length;
							}
						}
						if (verify2 != true);
							System.out.println(verify2);
							verifyBin = true;
					}while(verifyBin == false);
					int resultBin = entero(arrayBin,arrayBin.length-1);
					System.out.println("R://\t" + resultBin);
				break;
				case 9:
					System.out.println("Te sumare todos los numeros que ingreses en un arreglo\n"
							+ "ingrea el arreglo con numeros separados por comas");
					String sum = br.readLine();
					String[] arraySum = sum.split(",");
					int[] intArraySum = new int [arraySum.length];
					for (int i = 0;i < arraySum.length;i++)
						intArraySum[i] = Integer.parseInt(arraySum[i]);
					int resultSumArray = sumArray(intArraySum,intArraySum.length-1);
					System.out.println("R://\t" + resultSumArray);
				break;
				case 10:
					System.out.println("Te invertire de sitio todos los numeros que ingreses en un arreglo\n"
							+ "ingrea el arreglo con numeros separados por comas");
					String invert = br.readLine();
					String[] arrayInvert = invert.split(",");
					int[] intArrayInvert = new int [arrayInvert.length];
					for (int i = 0;i < arrayInvert.length;i++)
						intArrayInvert[i] = Integer.parseInt(arrayInvert[i]);
					intArrayInvert = ArrayInvert(intArrayInvert,0,intArrayInvert.length-1);
					System.out.print("R//\t");
					for (int i = 0;i < arrayInvert.length;i++)
						System.out.print("[" + intArrayInvert[i] + "]  ");
				break;
				case 11:
					System.out.println("Te dare el reultado de una funsion espesifica\n"
							+ "ingresa un numero");
					int numF = Integer.parseInt(br.readLine());
					numF = f(numF);
					System.out.println("R://\t" + numF);
				break;
				case 12:
					System.out.println("Te dire su la palabra que escribiste es palindromo o no\n"
							+ "ingresa una palabra");
					String word = br.readLine();
					System.out.println(palindromo(word,0,word.length()-1));
				break;
				case 13:
					System.out.println("Te imprimire los tipos de sumas que puesdes hacer de un numero\n"
							+ "ingresa el numero: ");
					int tiposSum = Integer.parseInt(br.readLine());
					tiposSuma(tiposSum,1);
				break;
			}
		}while (menu <= 13 && menu >= 1);
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
		return (factorial(n) * (factorial(r) * factorial(n-r)));
	}
	public static int factorial(int n)
	{
		if ( n == 0)
			return 1;
		if (n > 0)
			return factorial(n-1)*n;
		else
			return factorial(n+1)*n;
	}
	public static int[] ordenar(int[] array,int n)
	{
		if (array.length == 1)
			return array;
		else{
			if(n == array.length - 1)
				return array;
			else {
				for (int i = n+1 ; i < array.length; i++)
					if(array[i] < array[n])
					{
						int menor = array[i];
						array[i] = array[n];
						array[n] = menor;
					}
				return ordenar(array,n + 1);
			}
		}
	}	
	public static int sumaFirst(int n)
	{
		if(n != 0)
			if ( n > 0)
				return sumaFirst(n-1)+n; 
			else
				return sumaFirst(n+1)+n;
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
	public static int MCD (int n, int m)
	{
		if (m == 0)
			return n;
		else
			return MCD(m, m % n);
	}
	public static void BIN (int n , String numBin)
	{
		if (n < 2){
			if (n == 1)
				numBin += "1";
			else
				numBin += "0";
			for (int i = numBin.length() - 1; i >=0; i--)
				System.out.print(numBin.charAt(i));
			return;
		}
		else {
			int result = n%2;
			if (result==1)
				numBin += "1";
			else
				numBin += "0";
			BIN(n/2, numBin);
		}
	}
	public static int decimalValue = 0;
	public static int entero (int[] n,int index)
	{
		if (index >= 0)
		{
			if (n[index] == 1)
			{
				decimalValue += (Math.pow(2,((n.length-1)-index)));
				entero (n,index-1);
			}
			else
				entero (n,index-1);
		}
		return decimalValue;
	}
	public static int sumaArreglo = 0;
	public static int sumArray(int[] n,int index)
	{
		if (index >= 0) {
			sumaArreglo += n[index];
			sumArray(n,index-1);
		}
		return sumaArreglo;
	}
	public static int[] ArrayInvert (int n [],int index,int index2)
	{
		int swich;
		if (index < n.length/2) {
			swich = n[index2];
			n[index2] = n[index];
			n[index] = swich;
			ArrayInvert(n,index + 1,index2 -1);
		}
		return n;
	}
	public static int f(int x)
	{
		if (x >100)
			return (x-10);
		else
			return(f(f(x+11)));
	}
	public static boolean palindromo(String n,int index,int index2)
	{
		if (index < index2)
		{
			if (n.charAt(index) == n.charAt(index2)) {
				palindromo(n,index + 1,index2 - 1);
				return true;
			}
			return false;
		}
		return false;
	}
	public static void tiposSuma(int num, int operador)
	{
		int sum = num - operador;
		if(sum >= operador)
		{
			System.out.println(num +" = " + sum + " + " + operador);
			tiposSuma(num, ++operador);
		}
	}
}
