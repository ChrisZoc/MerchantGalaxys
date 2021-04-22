/**
 * 
 */
package com.christian.merchantgalaxys;


/**
 * <p>This enum defines the error codes that are produced during the application runtime.<br>
 * These code are used by the Error class to generate custom error messages.<br>
 * SUCCESS_OK is used in case if no error is generated
 * <br>
 * @author Saket kumar
 *
 */
public enum ErrorCodes {

	/**
	 * Sin errores
	 */
	SUCCESS_OK,
	
	/**
	 * la entrada está vacía
	 */
	NO_INPUT,
	
	
	/**
	 * entrada inválida
	 */
	INVALID,
	
	/**
	 * caracteres inválidos en romanos 
	 */
	INVALID_ROMAN_CHARACTER,
	
	/**
	 * numeros romanos tienen un formato incorrecto
	 */
	INVALID_ROMAN_STRING,
	
	/**
	 * linea mal identificada
	 */
	INCORRECT_LINE_TYPE,
	
	/**
	 * error desconocido
	 */
	NO_IDEA
}
