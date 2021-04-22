/**
 * 
 */
package com.christian.merchantgalaxys;

/**
 *
 * @author Christian
 */
public class ErrorMessage {

	
	public ErrorMessage(){
		
	}
	/**
	 * Función para errores particulares
	 */
	public void printMessage(ErrorCodes error)
	{
		String message= getMessage(error);
		
		if(message !=null)
		Utility.println(message);
		
	}
	
	public String getMessage(ErrorCodes error)
	{
		String message= null;
		
		switch(error)
		{
			case NO_INPUT : message = "No input was specified, Program ended";
							break;
			case INVALID : message = "Input format is wrong ! input error";break;
			
			case INVALID_ROMAN_CHARACTER : message = "Illegal character has been detected in roman number ! input error";break;
			
			case INVALID_ROMAN_STRING : message =  "wrong roman number format";break;
			
			case INCORRECT_LINE_TYPE : message =  "Exception caused during processing due to incorrect line type supplied";break;
			
			case NO_IDEA : message = "I have no idea what you are talking about";break;
			
			default : break;
		}
		return message;
	}
}
