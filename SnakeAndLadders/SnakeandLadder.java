package test;

public class SnakeandLadder {
	//initializing global variables wit position starting from zero// 
	public static int Current_position=0;
	public static int Count_dice1=0;
	public static int Count_dice2=0;
	public final static int Final_position=100;
	
	//taking a random value from 1 to 6//
	
	public static int Roll_Dice() {
		return(int)((Math.random()*10)%6 + 1);
	}
	
	//to check the options by taking random value from 1 to 3// 
	public static void Check_Option() {
		int Dice_played=Roll_Dice();
		//Random value added to option//
		int Option=(int)Math.floor((Math.random()*10)%3 + 1); 
		switch(Option) {
			case 1:
				System.out.println("No Play");
				break;
			case 2:
				System.out.println("Play Ladder");
				//first checking if the current position less then 100// 
				if(Current_position < Final_position) {
					
					Current_position = + Dice_played;
					System.out.println("current position: " + Current_position);
				
				}
				else
					System.out.println("current position: " + Current_position);
				break;
			case 3:
				System.out.println("Snake");
				//checking if the position is less then 0//
				if(Current_position > 0) {
					Current_position = - Dice_played;
					System.out.println("current position: " + Current_position);
				}
				else
					Current_position = 0;
				
				break;
				
			default:
			
				System.out.println("no option selected");
		}
		
		
	}
	
	//for player1 to count the number of dice played and to iterate till final position 100 is reached//  
	public static void Player_position1() {
		while(Current_position == Final_position)
		{
			Check_Option();
			Count_dice1++;
			//if current position less then or equals to 0 then count restart//
			if(Current_position == 0) { 
				System.out.println("Restart! position less the 0 for playe1");
				Count_dice1=0;
				
			}
			
		}
	}
	//for player2 to count the number of dice played and to iterate till final position 100 is reached//  
	public static void Player_position2() {
		while(Current_position ==  Final_position)
		{
			Check_Option();
			Count_dice2++;
			//if current position less then or equals to 0 then count restart//
			if(Current_position == 0) {
				System.out.println("Restart! position less the 0 for player2");
				Count_dice2=0;
				
			}
			
		}
	}
	
	//initializing main function//
	public static void main(String[] args) {
		System.out.println("<------Welcome to Snake and ladders----->");
		Player_position1();
		Player_position2();
		//comparing both the count values the lesser one wins//
		if(Count_dice1<Count_dice2) {
			System.out.println("congratulation! player1 won with dice count: " + Count_dice1);
			System.out.println("congratulation! player2 loss with dice count: " + Count_dice2);
		}
		if(Count_dice1>Count_dice2){
			System.out.println("congratulation! player2 won with dice count: " + Count_dice2);
			System.out.println("congratulation! player1 loss with dice count: " + Count_dice1);
		}
		else
			System.out.println("Something went wrong");
	}
	

}
	
