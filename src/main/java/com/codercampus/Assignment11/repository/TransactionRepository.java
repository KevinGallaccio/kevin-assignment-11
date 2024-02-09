package com.codercampus.Assignment11.repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.codercampus.Assignment11.domain.Transaction;

@Repository
public class TransactionRepository {
	private List<Transaction> transactions = new ArrayList<>(100);
	
	public TransactionRepository () {
		super();
		populateData();
	}
	
	public List<Transaction> findAll () {
		return transactions;
	}

	/*
	 * To populate the transactions list with previously "serialized" data from the transactions.txt file
	 * 
	 * Want to learn more about serialization, deserialization, and ObjectInputStream and how and why you would want to use it?
	 * 
	 * You can google or chatGPT "ObjectInputStream" and read up on it from the search results
	 * 
	 * Or, try the following links: 
	 * https://www.geeksforgeeks.org/serialization-in-java/ 
	 * or https://www.tutorialspoint.com/java/java_serialization.htm 
	 * or https://docs.oracle.com/javase/tutorial/essential/io/objectstreams.html
	 * 
	 * The use case is easier to understand if you think about it as taking the contents of your java program
	 *  and writing it out to a file, and or going from that file back into the a java program.
	 */
	@SuppressWarnings("unchecked")
	public void populateData() {
		try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/doNotTouch/transactions.doNotTouch");
			 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
			this.transactions = (List<Transaction>) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
}
