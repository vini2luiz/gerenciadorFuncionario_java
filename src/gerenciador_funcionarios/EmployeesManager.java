package gerenciador_funcionarios;

import java.util.List;

public class EmployeesManager {
	public void addEmployee(Employee employee, Database_Mock database) {
		database.add(employee);
	}
	
	public void printEmployees(Database_Mock database) {
		List<Employee> employees = database.findAll();
		for(int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);
			System.out.println("ID: " + employee.id + ", Funcionario: " + employee.name + ", Salário: " + employee.salary);
		}
	}
	
	public void updateSalary(int id, Double salary, Database_Mock database) {
		Employee employee = database.findById(id);
		
		if  (employee != null) {
			employee.salary = salary;
			database.update(employee);
		}
	}
}
