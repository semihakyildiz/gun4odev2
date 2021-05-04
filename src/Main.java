import java.util.Date;

import Adapters.MernisServiceAdapter;
import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Ahmet", "Mehmetoglu", new Date(1999,1,1),"11111111111"));

	}

}
 