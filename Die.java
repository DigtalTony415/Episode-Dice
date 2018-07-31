/*
  Die.java

      This file contains the Die() object that computers the numbers in the
      program.
**/


  public class Die
  {
  	  
  	  private int MAX;
  	  private int faceValue;
  	  
  	  public Die(int dieSides)
  	  {
  	  	 MAX = dieSides;
  	  	 faceValue = 1;
  	  }
  	  
  	  public int roll()
  	  {
  	  	faceValue = (int)(Math.random() * MAX) + 1;
  	  	
  	  	return faceValue;
  	  }
 
      public String toString()
      {
      	  String result = Integer.toString(faceValue);
      	  
      	  return result;
      }
      
 }
