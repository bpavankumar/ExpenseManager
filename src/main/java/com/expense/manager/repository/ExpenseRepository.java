package com.expense.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.manager.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

	List<Expense> findByExpenseCategoryId(Long expenseCategoryId);
}