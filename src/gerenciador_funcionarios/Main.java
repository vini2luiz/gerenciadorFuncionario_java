package gerenciador_funcionarios;

public class Main {
	public static void main(String[] args) {
		Database_Mock database = new Database_Mock();
		
		EmployeesManager manager = new EmployeesManager();
		
		Employee felipe = new Employee("Felipe", 1550.87);
		Employee ana = new Employee("Ana", 1550.87);
		Employee leo = new Employee("Leonardo", 1550.87);
		Employee roberto = new Employee("Roberto", 1550.87);
		
		database.add(felipe);
		database.add(ana);
		database.add(leo);
		database.add(roberto);
		
		
		ana.salary = 1000.45;
		database.update(ana);
		
		manager.printEmployees(database);
		
		System.out.println(" ");
		
		database.deleteById(3);
		
		manager.printEmployees(database);
		
	}
}
