package com.expense.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * https://www.tutorialspoint.com/googlecharts/googlecharts_organization_chart.htm
 * */
@Controller
public class OrgChartController {
	@GetMapping("/org-chart")
	public String showOrgChart(Model model) {
		String orgChartData = getOrgChartData();
		model.addAttribute("orgChartData", orgChartData);
		return "orgchart";
	}

	private String getOrgChartData() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("['Name', 'Manager', 'ToolTip'],");
		sb.append("['John', '', 'CEO'],");
		sb.append("['Jane', 'John', 'CTO'],");
		sb.append("['Alice', 'Jane', 'Developer'],");
		sb.append("['Bob', 'Jane', 'Designer']");
		sb.append("]");

		return sb.toString();
	}
}