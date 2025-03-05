package gerenciador_funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Database_Mock {
	List<Employee> tableEmployee;
	
	public Database_Mock() {
		this.tableEmployee = new ArrayList<Employee>();
	}
	
	public Employee findById(int id) {

		
		return null;
	}
	
	public Employee deleteById(int id) {
		for (int i = 0; i < this.tableEmployee.size(); i++) {
			Employee employee = this.tableEmployee.get(i);
			if (employee.id == id) {
				this.tableEmployee.remove(i);
				return employee;
			}
		}
		
		return null;
	}
	
	public void add(Employee employee) {
		if (!this.tableEmployee.isEmpty()) {
			Employee lastEmployee = this.tableEmployee.get(this.tableEmployee.size()-1);
			employee.id = lastEmployee.id+1;
			this.tableEmployee.add(employee);
			return;
		}
		
		employee.id = 1;
		this.tableEmployee.add(employee);
	}
	
	public void update(Employee providedEmployee) {
		for (int i = 0; i < this.tableEmployee.size(); i++) {
			Employee employee = this.tableEmployee.get(providedEmployee.id);
			if (employee.id == providedEmployee.id) {
				this.tableEmployee.set(i, providedEmployee);
				return;
			}
		}
	}
	
	public List<Employee> findAll() {
		return this.tableEmployee;
	}
}
