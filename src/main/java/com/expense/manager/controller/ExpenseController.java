package com.expense.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expense.manager.entity.Expense;
import com.expense.manager.service.ExpenseService;

@RestController
@RequestMapping("/api")
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;

    @GetMapping("/expenses")
    public String getAllExpenses(Model model) {
        List<Expense> topLevelExpenses = expenseService.getAllExpenses();
        model.addAttribute("expenses", topLevelExpenses);
        return "orgchart";
    }

    @GetMapping("/expenses/{id}")
    public List<Expense> getExpensesByCategory(@PathVariable Long id) {
        return expenseService.getExpensesByCategory(id);
    }
}