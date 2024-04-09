package src.LogicalPrograms;

public class Calender {

		int d,start,end;
		String[] weekDays = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };

		void one() {
			
			 start=2;
			 d=1;
			 end=0;;
			
			System.out.println();
			System.out.println("\t \t \t \t" + "JANUARY");
			System.out.println();

			// Loop for printing the name of weekdays
			for (int k = 0; k < weekDays.length; k++) {
				System.out.print("\t" + weekDays[k]);
			}

			System.out.println();

			// Loop for printing the dates of month
			// Outer for-loop is for printing 5 rows
			// and inner for loop is for printing till 7 weekdays

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					
					if (d <= 31) {//outer if starts
						if(j<start)//inner if starts
						{
							System.out.print("\t" + " ");
							if(j==start-1)
							{
								start=0;
							}
						}// inner if ends
						else
						{//else starts
							System.out.print("\t" + d);
							d++;
							end=j;
						}//else ends
						
					} //outer if ends
				} //inner for ends
				System.out.println();
			}//outer for ends
			
			System.out.println();
			start=end+1;
			if(start==6) start=0;
		}//method one ends

		
	void two() {
			
			
			int d=1;
			int end=0;;
			
			System.out.println();
			System.out.println("\t \t \t \t" + "FEBRUARY");
			System.out.println();

			// Loop for printing the name of weekdays
			for (int k = 0; k < weekDays.length; k++) {
				System.out.print("\t" + weekDays[k]);
			}

			System.out.println();

			// Loop for printing the dates of month
			// Outer for-loop is for printing 5 rows
			// and inner for loop is for printing till 7 weekdays

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					
					if (d <= 28) {//outer if starts
						if(j<start)//inner if starts
						{
							System.out.print("\t" + " ");
							if(j==start-1)
							{
								start=0;
							}
						}// inner if ends
						else
						{//else starts
							System.out.print("\t" + d);
							d++;
							end=j;
						}//else ends
						
					} //outer if ends
				} //inner for ends
				System.out.println();
			}//outer for ends
			
			System.out.println();
			start=end+1;
			if(start==6) start=0;
		}//method TWO ends

	void three() {
			
		int d=1;
		int end=0;;
		
		System.out.println();
		System.out.println("\t \t \t \t" + "MARCH");
		System.out.println();

		// Loop for printing the name of weekdays
		for (int k = 0; k < weekDays.length; k++) {
			System.out.print("\t" + weekDays[k]);
		}

		System.out.println();

		// Loop for printing the dates of month
		// Outer for-loop is for printing 5 rows
		// and inner for loop is for printing till 7 weekdays

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				if (d <= 31) {//outer if starts
					if(j<start)//inner if starts
					{
						System.out.print("\t" + " ");
						if(j==start-1)
						{
							start=0;
						}
					}// inner if ends
					else
					{//else starts
						System.out.print("\t" + d);
						d++;
						end=j;
					}//else ends
					
				} //outer if ends
			} //inner for ends
			System.out.println();
		}//outer for ends
		
		System.out.println();
		start=end+1;
		if(start==6) start=0;
	}//method THREE ends

	void four() {
		
		int d=1;
		int end=0;;
		
		System.out.println();
		System.out.println("\t \t \t \t" + "APRIL");
		System.out.println();

		// Loop for printing the name of weekdays
		for (int k = 0; k < weekDays.length; k++) {
			System.out.print("\t" + weekDays[k]);
		}

		System.out.println();

		// Loop for printing the dates of month
		// Outer for-loop is for printing 5 rows
		// and inner for loop is for printing till 7 weekdays

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				if (d <= 30) {//outer if starts
					if(j<start)//inner if starts
					{
						System.out.print("\t" + " ");
						if(j==start-1)
						{
							start=0;
						}
					}// inner if ends
					else
					{//else starts
						System.out.print("\t" + d);
						d++;
						end=j;
					}//else ends
					
				} //outer if ends
			} //inner for ends
			System.out.println();
		}//outer four ends
		
		System.out.println();
		start=end+1;
		if(start==6) start=0;
	}//method one ends

	void five() {
		
		int d=1;
		int end=0;;
		
		System.out.println();
		System.out.println("\t \t \t \t" + "MAY");
		System.out.println();

		// Loop for printing the name of weekdays
		for (int k = 0; k < weekDays.length; k++) {
			System.out.print("\t" + weekDays[k]);
		}

		System.out.println();

		// Loop for printing the dates of month
		// Outer for-loop is for printing 5 rows
		// and inner for loop is for printing till 7 weekdays

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				if (d <= 31) {//outer if starts
					if(j<start)//inner if starts
					{
						System.out.print("\t" + " ");
						if(j==start-1)
						{
							start=0;
						}
					}// inner if ends
					else
					{//else starts
						System.out.print("\t" + d);
						d++;
						end=j;
					}//else ends
					
				} //outer if ends
			} //inner for ends
			System.out.println();
		}//outer for ends
		
		System.out.println();
		start=end+1;
		if(start==6) start=0;
	}//method five ends

	void six() {
		
		int d=1;
		int end=0;;
		
		System.out.println();
		System.out.println("\t \t \t \t" + "JUNE");
		System.out.println();

		// Loop for printing the name of weekdays
		for (int k = 0; k < weekDays.length; k++) {
			System.out.print("\t" + weekDays[k]);
		}

		System.out.println();

		// Loop for printing the dates of month
		// Outer for-loop is for printing 5 rows
		// and inner for loop is for printing till 7 weekdays

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				if (d <= 30) {//outer if starts
					if(j<start)//inner if starts
					{
						System.out.print("\t" + " ");
						if(j==start-1)
						{
							start=0;
						}
					}// inner if ends
					else
					{//else starts
						System.out.print("\t" + d);
						d++;
						end=j;
					}//else ends
					
				} //outer if ends
			} //inner for ends
			System.out.println();
		}//outer for ends
		
		System.out.println();
		start=end+1;
		if(start==6) start=0;
	}//method six ends

	void seven() {
		
		int d=1;
		int end=0;;
		
		System.out.println();
		System.out.println("\t \t \t \t" + "JULY");
		System.out.println();

		// Loop for printing the name of weekdays
		for (int k = 0; k < weekDays.length; k++) {
			System.out.print("\t" + weekDays[k]);
		}

		System.out.println();

		// Loop for printing the dates of month
		// Outer for-loop is for printing 5 rows
		// and inner for loop is for printing till 7 weekdays

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				if (d <= 31) {//outer if starts
					if(j<start)//inner if starts
					{
						System.out.print("\t" + " ");
						if(j==start-1)
						{
							start=0;
						}
					}// inner if ends
					else
					{//else starts
						System.out.print("\t" + d);
						d++;
						end=j;
					}//else ends
					
				} //outer if ends
			} //inner for ends
			System.out.println();
		}//outer for ends
		
		System.out.println();
		start=end+1;
		if(start==6) start=0;
	}//method seven ends

	void eight() {
		
		int d=1;
		int end=0;;
		
		System.out.println();
		System.out.println("\t \t \t \t" + "AUGUST");
		System.out.println();

		// Loop for printing the name of weekdays
		for (int k = 0; k < weekDays.length; k++) {
			System.out.print("\t" + weekDays[k]);
		}

		System.out.println();

		// Loop for printing the dates of month
		// Outer for-loop is for printing 5 rows
		// and inner for loop is for printing till 7 weekdays

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				if (d <= 31) {//outer if starts
					if(j<start)//inner if starts
					{
						System.out.print("\t" + " ");
						if(j==start-1)
						{
							start=0;
						}
					}// inner if ends
					else
					{//else starts
						System.out.print("\t" + d);
						d++;
						end=j;
					}//else ends
					
				} //outer if ends
			} //inner for ends
			System.out.println();
		}//outer for ends
		
		System.out.println();
		start=end+1;
		if(start==6) start=0;
	}//method eight ends

	void nine() {
		
		int d=1;
		int end=0;;
		
		System.out.println();
		System.out.println("\t \t \t \t" + "SEPTEMBER");
		System.out.println();

		// Loop for printing the name of weekdays
		for (int k = 0; k < weekDays.length; k++) {
			System.out.print("\t" + weekDays[k]);
		}

		System.out.println();

		// Loop for printing the dates of month
		// Outer for-loop is for printing 5 rows
		// and inner for loop is for printing till 7 weekdays

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				if (d <= 30) {//outer if starts
					if(j<start)//inner if starts
					{
						System.out.print("\t" + " ");
						if(j==start-1)
						{
							start=0;
						}
					}// inner if ends
					else
					{//else starts
						System.out.print("\t" + d);
						d++;
						end=j;
					}//else ends
					
				} //outer if ends
			} //inner for ends
			System.out.println();
		}//outer for ends
		
		System.out.println();
		start=end+1;
		if(start==6) start=0;
	}//method nine ends

	void ten() {
		
		int d=1;
		int end=0;;
		
		System.out.println();
		System.out.println("\t \t \t \t" + "OCTOBER");
		System.out.println();

		// Loop for printing the name of weekdays
		for (int k = 0; k < weekDays.length; k++) {
			System.out.print("\t" + weekDays[k]);
		}

		System.out.println();

		// Loop for printing the dates of month
		// Outer for-loop is for printing 5 rows
		// and inner for loop is for printing till 7 weekdays

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				if (d <= 31) {//outer if starts
					if(j<start)//inner if starts
					{
						System.out.print("\t" + " ");
						if(j==start-1)
						{
							start=0;
						}
					}// inner if ends
					else
					{//else starts
						System.out.print("\t" + d);
						d++;
						end=j;
					}//else ends
					
				} //outer if ends
			} //inner for ends
			System.out.println();
		}//outer for ends
		
		System.out.println();
		start=end+1;
		if(start==6) start=0;
	}//method ten ends

	void eleven() {
		
		int d=1;
		int end=0;;
		
		System.out.println();
		System.out.println("\t \t \t \t" + "NOVEMBER");
		System.out.println();

		// Loop for printing the name of weekdays
		for (int k = 0; k < weekDays.length; k++) {
			System.out.print("\t" + weekDays[k]);
		}

		System.out.println();

		// Loop for printing the dates of month
		// Outer for-loop is for printing 5 rows
		// and inner for loop is for printing till 7 weekdays

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				if (d <= 30) {//outer if starts
					if(j<start)//inner if starts
					{
						System.out.print("\t" + " ");
						if(j==start-1)
						{
							start=0;
						}
					}// inner if ends
					else
					{//else starts
						System.out.print("\t" + d);
						d++;
						end=j;
					}//else ends
					
				} //outer if ends
			} //inner for ends
			System.out.println();
		}//outer for ends
		
		System.out.println();
		start=end+1;
		if(start==6) start=0;
	}//method eleven ends

	void twelve() {
		
		int d=1;
		int end=0;;
		
		System.out.println();
		System.out.println("\t \t \t \t" + "DECEMBER");
		System.out.println();

		// Loop for printing the name of weekdays
		for (int k = 0; k < weekDays.length; k++) {
			System.out.print("\t" + weekDays[k]);
		}

		System.out.println();

		// Loop for printing the dates of month
		// Outer for-loop is for printing 5 rows
		// and inner for loop is for printing till 7 weekdays

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				
				if (d <= 31) {//outer if starts
					if(j<start)//inner if starts
					{
						System.out.print("\t" + " ");
						if(j==start-1)
						{
							start=0;
						}
					}// inner if ends
					else
					{//else starts
						System.out.print("\t" + d);
						d++;
						end=j;
					}//else ends
					
				} //outer if ends
			} //inner for ends
			System.out.println();
		}//outer for ends
		
		System.out.println();
		start=end+1;
		if(start==6) start=0;
	}//method twelve ends

	void displayCalender()
	{
		one();
		two();
		three();
		four();
		five();
		six();
		seven();
		eight();
		nine();
		ten();
		eleven();
		twelve();
	}


	
}
