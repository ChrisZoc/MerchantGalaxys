package com.christian.merchantgalaxys;

import com.christian.merchantgalaxys.Paragraph;
import com.christian.merchantgalaxys.Utility;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Christian
 */
public class Application {

	/**
	 * Entry point of the application
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Utility.println("Welcome to the GalaxyMerchant APP ! \n please give a input paragraph and when want a blank new line to finish the paragraph and start the analysis:");
		Paragraph paragraph = new Paragraph();
		List<String> inputs = paragraph.read();

		Application application = new Application();
		List<String> result = application.run(inputs);

		for (String item: result) {
			Utility.println(item);
		}
	}

	public List<String> run(List<String> inputs) {
		// Read the input from console, validate and process
		Paragraph paragraph = new Paragraph();
		List<String> output = paragraph.validate(inputs);

		return output;

	}

}
