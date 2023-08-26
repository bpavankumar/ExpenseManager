package com.expense.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expense.manager.entity.Expense;
import com.expense.manager.repository.ExpenseRepository;

@RestController
@RequestMapping("/api")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses() {
        return expenseRepository.findByExpenseCategoryId(null); // Assuming top-level managers have null managerId
    }

    @GetMapping("/expenses/{id}")
    public List<Expense> getExpensesByCategory(@PathVariable Long id) {
        return expenseRepository.findByExpenseCategoryId(id);
    }
}