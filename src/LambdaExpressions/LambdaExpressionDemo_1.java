package src.LambdaExpressions;

import src.SynchronizedDemo.Display;

public class LambdaExpressionDemo_1 {

	public static void main(String[] args) {
		int width = 50;
		
		//Using Anonymous class
		Display d1=new Display() {
			@Override
			public void show()
			{
				System.out.println("Show method of display interface: " + width);
			}
		};
		
		d1.show();
		
		//Using Lambda Expression 
		
		Drawable d = () -> {
			System.out.println("Draw method of drawable interface: " + width);
		};
			
		d.draw();
	}

}
