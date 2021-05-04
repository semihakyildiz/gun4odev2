package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService _customerCheckService;

	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	};

	@Override
	public void Save(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Not A Valid Person");
		}

	}

}
