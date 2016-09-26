

import java.util.Scanner;

class Main {
    public static void main (String[] args)
	{
        Scanner input = new Scanner (System.in);

        System.out.println ("specify size");
        int num = input.nextInt();
        int numbers[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println ("number" + i + ":");
            numbers[i] = input.nextInt();
			
        }

        for (int temp : numbers)
		{
		if (temp==42)
			{
				break;
			}
			
            System.out.print (temp + " ");
        }
    }
}

