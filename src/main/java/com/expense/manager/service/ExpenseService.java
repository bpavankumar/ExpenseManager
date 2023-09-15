package com.expense.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.expense.manager.entity.Expense;
import com.expense.manager.repository.ExpenseRepository;

public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	public List<Expense> getAllExpenses() {
		return null;
	}

	public List<Expense> getAllTopLevelExpenses() {
		// Assuming top-level expenses have null expenseCategoryId
		return expenseRepository.findByExpenseCategoryId(null);
	}

	public List<Expense> getExpensesByCategory(@PathVariable Long id) {
		return expenseRepository.findByExpenseCategoryId(id);
	}
}