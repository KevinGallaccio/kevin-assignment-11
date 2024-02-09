package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepo;

    public List<Transaction> findAllTransactions (){
        return transactionRepo.findAll();
    }


    public Transaction findById(Long transactionId) {
        return transactionRepo.findById(transactionId);
    }
}
