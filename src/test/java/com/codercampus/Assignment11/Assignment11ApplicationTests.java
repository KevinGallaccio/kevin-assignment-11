package com.codercampus.Assignment11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

class Assignment11ApplicationTests {
	
	@Test
	@SuppressWarnings("unchecked")
	void testFilePathForValidRead ()  {
		TransactionRepository transactionRepository = new TransactionRepository();
		transactionRepository.populateData();
		try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/doNotTouch/transactions.doNotTouch");
			 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
			Object transactions = (List<Transaction>) objectInputStream.readObject();
			System.out.println(transactions.getClass());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}
