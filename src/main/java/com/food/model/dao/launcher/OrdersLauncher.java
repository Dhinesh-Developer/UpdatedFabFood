package com.food.model.dao.launcher;

import com.food.model.dao.impl.OrdersDAOImpl;
import com.food.model.dao.model.Order;

public class OrdersLauncher {

	public static void main(String[] args) {
		
		OrdersDAOImpl daoImpl = new OrdersDAOImpl();
		for ( Order oList : daoImpl.fetchAll() ) {
			System.out.println(oList);
		}

	}

}
