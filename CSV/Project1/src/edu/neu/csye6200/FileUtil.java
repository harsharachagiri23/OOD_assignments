package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileUtil {
	
public void writeCSVFile(String[] items) {
	try {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("students.txt"));
		for(String item : items) {
			bufferedWriter.write(item);
			bufferedWriter.newLine();
		}
		bufferedWriter.flush();
		bufferedWriter.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}

public void readStudentsCSVFile(List<String> items){
	try {
		Scanner inLine = new Scanner(new BufferedReader(new FileReader("students.txt")));
		while(inLine.hasNextLine()) {
			String inputLine = inLine.nextLine();
			items.add(inputLine);
		}
		inLine.close();
	}
	catch(FileNotFoundException e){
		e.printStackTrace();
	}	
}
}
