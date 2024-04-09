package src.LogicalPrograms;

public class AlphabetPrint {

	//A=65..Z=90  a=97...z=122
	
	void p5() {
		System.out.println("Program for alphabet printing");

		
		for (char i=65; i<120; i++)
		{			
			if(i<91 || i>96)
			System.out.println(i);
		}
	}
	
	void p6()
	{
		System.out.println(2+3);
		// Since a string is present before "+" it will act as concatination operator
		System.out.println("Addition = " + 2+3); 
		// Since a string is present after "+" it will act as addition operator
		System.out.println(2+3+" Addition ");
	}
	
	
	void p7()
	{
		System.out.println("String palindrome");
		System.out.println();
		
		String s="ABCDE";
		
		for (int i=0; i<s.length(); i++)
		{
			System.out.println("From start = "+ s.charAt(i));
			System.out.println("From end = "+ s.charAt(s.length()-i-1));
			System.out.println("-------------");
			
			if(s.charAt(i)==s.charAt(s.length()-i-1))
			{
				
				
			}
		}
		
		
	}
	
	void p8()
	{
		System.out.println("Number palindrome");
		System.out.println();
		
		int origNo=12321;
		int tempNo=origNo;
		int newNum=0;
		
		while (origNo>0)
		{
			newNum=newNum*10+(origNo%10);
			origNo=origNo/10;
		}
		System.out.println("Original number = "+tempNo);
		System.out.println("Reverse number = "+newNum);
		if(tempNo==newNum)
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}
	}
	
	void p9()
	{
		System.out.println("ATM");
		System.out.println();
		
		int amount=4700;
		
		int twoThousand=0;
		int fiveHundred=0;
		int twoHundred=0;
		int hundred=0;
		
		System.out.println("Amount =" +amount);
		System.out.println();
		
		twoThousand=amount/2000;
		fiveHundred=(amount-(2000*twoThousand))/500;
		twoHundred=(amount-(2000*twoThousand)-(500*fiveHundred))/200;
		hundred=(amount-(2000*twoThousand)-(500*fiveHundred)-(200*twoHundred))/100;
		
		System.out.println("Two Thousand = " + twoThousand);
		System.out.println("Five Hundred = " + fiveHundred);
		System.out.println("Two Hundred = " + twoHundred);
		System.out.println("Hundred " + hundred );
	}
	
	void p10()
	{
		System.out.println("Prime numbers from 1 to 100");
		
		for (int i=2; i<=100; i++)
		{
			int n=i;
			boolean b=true;
			
			for(int j=2; j<n; j++)
			{
				if(n%j==0)
				{
					b=false;
					break;
				}
			}
			if(b)
			{
				System.out.println(n);
				}
		}
	}
	
}
