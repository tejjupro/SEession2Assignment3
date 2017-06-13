package patternX;

import java.util.*;
import java.util.Scanner;

//starting class here
public class XPattern {

	public static void main(String []args) //main method
	{

        char firstChar;            //Declaring char variable firstChar.
        int rowNum;                //Declaring int variable for number of rows.
        int colNum;                //Declaring int variable for number of columns.
        
                
        firstChar='*';    
        rowNum=5;     
        colNum=5;      
        
        for(int row = 0 ; row < rowNum; row++)       
        {
        	int numOfChar=0;                         
        	for(int col=0;col < colNum; col++)     //condition to for loop
        	{
        	    if(row==col || col==colNum-row-1)     //if else to satisfy condition 
        	    {   
        	    	System.out.print(firstChar);     
        	    	numOfChar++;
        	    }	
        	    else
        	    	System.out.print("__");           
        	    if((numOfChar==2 && row!=2) || (numOfChar==1 && row==2))
        	    	break; // condition stops here
        	}
        	System.out.print("\n");        
        }                                 
	}    //main method end  
} //class end