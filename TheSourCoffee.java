package oopDay3;

import java.util.Scanner;

public class TheSourCoffee {
	public static void main(String[] args) {
		// Define Brands
		Brand brandStarbucks = new Brand();
		brandStarbucks.name = "Starbucks";

		Brand brandCibo = new Brand();
		brandCibo.name = "Cibo";

		Brand brandNespresso = new Brand();
		brandNespresso.name = "Nespresso";

		Brand[] arrayBrands = { brandStarbucks, brandCibo, brandNespresso };

		// Define Customers
		Customer customerA = new Customer();
		customerA.name = "A";
		customerA.customerId = 123456;
		customerA.dob = "12.02.1990";
		customerA.emailAdress = "aaa@gmail.com";
		customerA.phoneNumber = "0123456789";

		Customer customerB = new Customer();
		customerB.name = "B";
		customerB.customerId = 123457;
		customerB.dob = "12.02.1990";
		customerB.emailAdress = "bb@gmail.com";
		customerB.phoneNumber = "0123456789";

		Customer customerC = new Customer();
		customerC.name = "C";
		customerC.customerId = 123458;
		customerC.dob = "12.02.1990";
		customerC.emailAdress = "aaa@gmail.com";
		customerC.phoneNumber = "0123456789";

		Customer customerD = new Customer();
		customerD.name = "D";
		customerD.customerId = 123456;
		customerD.dob = "12.02.1990";
		customerD.emailAdress = "aaa@gmail.com";
		customerD.phoneNumber = "0123456489";

		Customer[] arrayCustomers = { customerA, customerB, customerC, customerD };

		// Define Accounts
		Account accountCustomerA = new Account();
		accountCustomerA.customer = customerA;
		accountCustomerA.loginId = "A12";
		accountCustomerA.password = "125*MY";
		accountCustomerA.lastLoginTime = "12.06.2022 08:12:06";
		accountCustomerA.isActive = true;

		Account accountCustomerB = new Account();
		accountCustomerB.customer = customerB;
		accountCustomerB.loginId = "B16";
		accountCustomerB.password = "passwordofMINE";
		accountCustomerB.lastLoginTime = "22.03.2023 15:00:21";
		accountCustomerB.isActive = true;

		Account accountCustomerC = new Account();
		accountCustomerC.customer = customerC;
		accountCustomerC.loginId = "A12";
		accountCustomerC.password = "125*MY";
		accountCustomerC.lastLoginTime = "12.04.2023 16:22:37";
		accountCustomerC.isActive = true;

		Account accountCustomerD = new Account();
		accountCustomerD.customer = customerD;
		accountCustomerD.loginId = "A12";
		accountCustomerD.password = "125*MY";
		accountCustomerD.lastLoginTime = "02.04.2023 09:56:37";
		accountCustomerD.isActive = true;

		Account[] arrayAccounts = { accountCustomerA, accountCustomerB, accountCustomerC, accountCustomerD };

		// Define Products
		// Products of Starbucks
		Product blackCoffee = new Product();
		blackCoffee.brand = brandStarbucks;
		blackCoffee.name = "Real Black";
		blackCoffee.productId = 111;
		blackCoffee.price = 4.5;

		Product brownCoffee = new Product();
		brownCoffee.brand = brandStarbucks;
		brownCoffee.name = "Brown Best";
		brownCoffee.price = 6.2;
		brownCoffee.productId = 112;

		Product whiteCoffee = new Product();
		whiteCoffee.brand = brandStarbucks;
		whiteCoffee.name = "Whity Mighty";
		whiteCoffee.price = 7.0;
		whiteCoffee.productId = 113;

		// Products of Cibo
		Product mocha = new Product();
		mocha.brand = brandCibo;
		mocha.name = "Mocha";
		mocha.price = 4.5;
		mocha.productId = 211;

		Product latte = new Product();
		latte.brand = brandCibo;
		latte.name = "Latte";
		latte.price = 4.0;
		latte.productId = 212;

		Product espresso = new Product();
		espresso.brand = brandCibo;
		espresso.name = "Espresso";
		espresso.price = 3.0;
		espresso.productId = 213;

		// Products of Nespresso
		Product peru = new Product();
		peru.brand = brandNespresso;
		peru.name = "Peru";
		peru.price = 10.2;
		peru.productId = 311;

		Product indo = new Product();
		indo.brand = brandNespresso;
		indo.name = "Indonesia";
		indo.price = 8.5;
		indo.productId = 312;

		Product colombia = new Product();
		colombia.brand = brandNespresso;
		colombia.name = "Colombia";
		colombia.price = 12.0;
		colombia.productId = 313;

		Product[] arrayProducts = { blackCoffee, brownCoffee, whiteCoffee, mocha, latte, espresso, peru, indo,
				colombia };

		// Define Locations
		Location sydney = new Location();
		sydney.name = "Sydney";
		sydney.locationId = 2000;
		sydney.address = "12 Murray Street, Sydney, NSW 2000";

		Location melbourne = new Location();
		melbourne.name = "Melbourne";
		melbourne.locationId = 3000;
		melbourne.address = "50 May Terrace, Melbourne, VIC 3000";

		Location adelaide = new Location();
		adelaide.name = "Adelaide";
		adelaide.locationId = 5000;
		adelaide.address = "18 City Drive, Adelaide, SA 5000";

		Location brisbane = new Location();
		brisbane.name = "Brisbane";
		brisbane.locationId = 4000;
		brisbane.address = "96 Ottoway Street, Brisbane, QLD 4000";

		Location[] arrayLocations = { sydney, melbourne, adelaide, brisbane };

		// Define stocks in each location
		// Stocks in Sydney
		Stock sydneyBlackCoffee = new Stock();
		sydneyBlackCoffee.location = sydney;
		sydneyBlackCoffee.product = blackCoffee;
		sydneyBlackCoffee.stock = 2000;

		Stock sydneyBrownCoffee = new Stock();
		sydneyBrownCoffee.location = sydney;
		sydneyBrownCoffee.product = brownCoffee;
		sydneyBrownCoffee.stock = 1500;

		Stock sydneyWhiteCoffee = new Stock();
		sydneyWhiteCoffee.location = sydney;
		sydneyWhiteCoffee.product = whiteCoffee;
		sydneyWhiteCoffee.stock = 1800;

		Stock sydneyWhiteMocha = new Stock();
		sydneyWhiteMocha.location = sydney;
		sydneyWhiteMocha.product = mocha;
		sydneyWhiteMocha.stock = 1100;

		// Stocks in Melbourne
		Stock melbournePeru = new Stock();
		melbournePeru.location = melbourne;
		melbournePeru.product = peru;
		melbournePeru.stock = 2000;

		Stock melbourneIndo = new Stock();
		melbourneIndo.location = melbourne;
		melbourneIndo.product = indo;
		melbourneIndo.stock = 2300;

		Stock melbourneColombia = new Stock();
		melbourneColombia.location = melbourne;
		melbournePeru.product = colombia;
		melbournePeru.stock = 3000;

		Stock melbourneLatte = new Stock();
		melbourneLatte.location = melbourne;
		melbourneLatte.product = latte;
		melbourneLatte.stock = 2500;

		// Stocks in Adelaide
		Stock adelaidePeru = new Stock();
		adelaidePeru.location = adelaide;
		adelaidePeru.product = peru;
		adelaidePeru.stock = 1000;

		Stock adelaideEspresso = new Stock();
		adelaideEspresso.location = adelaide;
		adelaideEspresso.product = espresso;
		adelaideEspresso.stock = 1000;

		Stock adelaideMocha = new Stock();
		adelaideMocha.location = adelaide;
		adelaideMocha.product = mocha;
		adelaideMocha.stock = 3000;

		Stock adelaideLatte = new Stock();
		adelaideLatte.location = adelaide;
		adelaideLatte.product = latte;
		adelaideLatte.stock = 2200;

		// Stocks in Brisbane
		Stock brisbaneWhiteCoffee = new Stock();
		brisbaneWhiteCoffee.location = brisbane;
		brisbaneWhiteCoffee.product = whiteCoffee;
		brisbaneWhiteCoffee.stock = 1800;

		Stock brisbaneBrownCoffee = new Stock();
		brisbaneBrownCoffee.location = brisbane;
		brisbaneBrownCoffee.product = brownCoffee;
		brisbaneBrownCoffee.stock = 1500;

		Stock brisbaneIndo = new Stock();
		brisbaneIndo.location = brisbane;
		brisbaneIndo.product = indo;
		brisbaneIndo.stock = 2800;

		Stock brisbaneMocha = new Stock();
		brisbaneMocha.location = brisbane;
		brisbaneMocha.product = mocha;
		brisbaneMocha.stock = 300;

		Stock[] arrayStocks = { sydneyBlackCoffee, sydneyBrownCoffee, sydneyWhiteCoffee, melbournePeru, melbourneIndo,
				melbourneColombia, melbourneLatte, adelaidePeru, adelaideEspresso, adelaideMocha, adelaideLatte,
				brisbaneWhiteCoffee, brisbaneBrownCoffee, brisbaneIndo, brisbaneMocha };

		// Define Orders
		Order order1 = new Order();
		order1.orderId = 1;
		order1.dateTime = "20.03.2023 15:00:07";
		order1.customer = customerA;

		Order order2 = new Order();
		order2.orderId = 2;
		order2.dateTime = "21.03.2023 13:03:47";
		order2.customer = customerA;

		Order order3 = new Order();
		order3.orderId = 3;
		order3.dateTime = "06.04.2023 17:00:56";
		order3.customer = customerB;

		Order order4 = new Order();
		order4.orderId = 4;
		order4.dateTime = "15.04.2023 08:35:12";
		order4.customer = customerD;

		Order order5 = new Order();
		order5.orderId = 5;
		order5.dateTime = "19.04.2023 26:00:26";
		order5.customer = customerC;

		Order[] arrayOrders = { order1, order2, order3, order4, order5 };

		// Define order details of each product in each order
		// Define order details of each product in Order1 and total of Order1
		OrderOfEachProduct blackCoffeeOrder1 = new OrderOfEachProduct();
		blackCoffeeOrder1.order = order1;
		blackCoffeeOrder1.product = blackCoffee;
		blackCoffeeOrder1.priceAtOrderTime = blackCoffee.price;
		blackCoffeeOrder1.quantityPurchasedEachProduct = 2;
		blackCoffeeOrder1.totalPurchasedEachProduct = blackCoffeeOrder1.priceAtOrderTime
				* blackCoffeeOrder1.quantityPurchasedEachProduct;

		OrderOfEachProduct mochaCoffeeOrder1 = new OrderOfEachProduct();
		mochaCoffeeOrder1.order = order1;
		mochaCoffeeOrder1.product = mocha;
		mochaCoffeeOrder1.priceAtOrderTime = mocha.price;
		mochaCoffeeOrder1.quantityPurchasedEachProduct = 5;
		mochaCoffeeOrder1.totalPurchasedEachProduct = mochaCoffeeOrder1.priceAtOrderTime
				* mochaCoffeeOrder1.quantityPurchasedEachProduct;

		// Define order details of each product in Order2
		OrderOfEachProduct indoOrder2 = new OrderOfEachProduct();
		indoOrder2.order = order2;
		indoOrder2.product = indo;
		indoOrder2.priceAtOrderTime = indo.price - 0.1;
		indoOrder2.quantityPurchasedEachProduct = 10;
		indoOrder2.totalPurchasedEachProduct = indoOrder2.priceAtOrderTime * indoOrder2.quantityPurchasedEachProduct;

		OrderOfEachProduct latteOrder2 = new OrderOfEachProduct();
		latteOrder2.order = order2;
		latteOrder2.product = latte;
		latteOrder2.priceAtOrderTime = latte.price + 0.15;
		latteOrder2.quantityPurchasedEachProduct = 2;
		latteOrder2.totalPurchasedEachProduct = latteOrder2.priceAtOrderTime * latteOrder2.quantityPurchasedEachProduct;

		// Define order details of each product in Order3
		OrderOfEachProduct peruOrder3 = new OrderOfEachProduct();
		peruOrder3.order = order3;
		peruOrder3.product = peru;
		peruOrder3.priceAtOrderTime = peru.price;
		peruOrder3.quantityPurchasedEachProduct = 10;
		peruOrder3.totalPurchasedEachProduct = peruOrder3.priceAtOrderTime * peruOrder3.quantityPurchasedEachProduct;

		OrderOfEachProduct whiteCoffeeOrder3 = new OrderOfEachProduct();
		whiteCoffeeOrder3.order = order3;
		whiteCoffeeOrder3.product = whiteCoffee;
		whiteCoffeeOrder3.priceAtOrderTime = whiteCoffee.price + 0.25;
		whiteCoffeeOrder3.quantityPurchasedEachProduct = 1;
		whiteCoffeeOrder3.totalPurchasedEachProduct = whiteCoffeeOrder3.priceAtOrderTime
				* whiteCoffeeOrder3.quantityPurchasedEachProduct;

		OrderOfEachProduct espressoOrder3 = new OrderOfEachProduct();
		espressoOrder3.order = order3;
		espressoOrder3.product = espresso;
		espressoOrder3.priceAtOrderTime = espresso.price + 0.5;
		espressoOrder3.quantityPurchasedEachProduct = 5;
		espressoOrder3.totalPurchasedEachProduct = espressoOrder3.priceAtOrderTime
				* espressoOrder3.quantityPurchasedEachProduct;

		// Define order details of each product in Order4
		OrderOfEachProduct colombiaOrder4 = new OrderOfEachProduct();
		colombiaOrder4.order = order4;
		colombiaOrder4.product = colombia;
		colombiaOrder4.priceAtOrderTime = colombia.price + 0.05;
		colombiaOrder4.quantityPurchasedEachProduct = 100;
		colombiaOrder4.totalPurchasedEachProduct = colombiaOrder4.priceAtOrderTime
				* colombiaOrder4.quantityPurchasedEachProduct;

		// Define order details of each product in Order5
		OrderOfEachProduct indoOrder5 = new OrderOfEachProduct();
		indoOrder5.order = order5;
		indoOrder5.product = indo;
		indoOrder5.priceAtOrderTime = indo.price + 0.5;
		indoOrder5.quantityPurchasedEachProduct = 25;
		indoOrder5.totalPurchasedEachProduct = indoOrder5.priceAtOrderTime * indoOrder5.quantityPurchasedEachProduct;

		OrderOfEachProduct brownCoffeeOrder5 = new OrderOfEachProduct();
		brownCoffeeOrder5.order = order5;
		brownCoffeeOrder5.product = brownCoffee;
		brownCoffeeOrder5.priceAtOrderTime = brownCoffee.price;
		brownCoffeeOrder5.quantityPurchasedEachProduct = 8;
		brownCoffeeOrder5.totalPurchasedEachProduct = brownCoffeeOrder5.priceAtOrderTime
				* brownCoffeeOrder5.quantityPurchasedEachProduct;

		OrderOfEachProduct[] arrayOrderOfEachProducts = { blackCoffeeOrder1, mochaCoffeeOrder1, indoOrder2, latteOrder2,
				peruOrder3, whiteCoffeeOrder3, espressoOrder3, colombiaOrder4, indoOrder5, brownCoffeeOrder5 };

		// Input order ID to see order details
		System.out.println("Please enter order ID to see order details: ");

		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();

		printOrderDetails(arrayOrders, code, arrayOrderOfEachProducts); // Call function to print order details

		printAllOrders(arrayOrders, arrayOrderOfEachProducts); // Call function to print all order details

	}

	// Function to print order details of a specific order
	public static void printOrderDetails(Order[] orders, int enteredOrderId, OrderOfEachProduct[] orderEachProducts) {
		for (Order order : orders) {
			if (enteredOrderId == order.orderId) {
				System.out.println("Order code: " + order.orderId);
				System.out.println("Date: " + order.dateTime);
				System.out.println("Customer " + order.customer.name);
				System.out.println("Products of the order: ");
				for (OrderOfEachProduct orderEachProduct : orderEachProducts) {
					if (order.orderId == orderEachProduct.order.orderId) {
						System.out.println(orderEachProduct.product.name + " - Quantity: "
								+ orderEachProduct.quantityPurchasedEachProduct + " - Price of product: "
								+ orderEachProduct.priceAtOrderTime + " - Sub total = $"
								+ orderEachProduct.totalPurchasedEachProduct);
						order.total += orderEachProduct.totalPurchasedEachProduct;
					}
				}
				System.out.println("Total: $" + order.total);
				System.out.println("                        ");
				System.out.println("                        ");
				System.out.println("                        ");

				break;
			}
		}

	}

	// Function to print details of all orders
	public static void printAllOrders(Order[] orders, OrderOfEachProduct[] orderEachProducts) {
		for (Order order : orders) {
			System.out.println("Order code: " + order.orderId);
			System.out.println("Date: " + order.dateTime);
			System.out.println("Customer " + order.customer.name);
			System.out.println("Products of the order: ");
			for (OrderOfEachProduct orderEachProduct : orderEachProducts) {
				if (order.orderId == orderEachProduct.order.orderId) {
					System.out.println(orderEachProduct.product.name + " - Quantity: "
							+ orderEachProduct.quantityPurchasedEachProduct + " - Price of product: "
							+ orderEachProduct.priceAtOrderTime + " - Sub total = $"
							+ orderEachProduct.totalPurchasedEachProduct);
					order.total += orderEachProduct.totalPurchasedEachProduct;
				}
			}
			System.out.println("Total: $" + order.total);
			System.out.println("-----------------------");
		}
	}

}
