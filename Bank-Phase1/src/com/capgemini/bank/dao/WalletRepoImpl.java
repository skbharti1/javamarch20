package com.capgemini.bank.dao;
 

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.capgemini.bank.bean.Customer;
import com.capgemini.bank.bean.Wallet;
import com.capgemini.bank.dbutil.ConnectionSQL;



public class WalletRepoImpl implements WalletRepo{

	private Map<String, Customer> data = new HashMap<String, Customer>(); 
	
	public WalletRepoImpl(Map<String, Customer> data) {
		super();
		
		this.data = data;
	}

	public WalletRepoImpl() {
		// TODO Auto-generated constructor stub
	}

	public boolean save(Customer customer) {
		return false;
	}

	public Customer findOne(String mobileNo) 
	{
		
		Customer customer = new Customer();
		String query = "select c.mobileNo , c.name , w.balance from customer c , wallet w where c.mobileNo = w.mobileNo AND c.mobileNo = ?";
		try 
		{
			PreparedStatement st = ConnectionSQL.con.prepareStatement(query);
			st.setString(1, mobileNo);
			ResultSet rs = st.executeQuery();
			
			while(rs.next())
			{
				customer.setMobileNo(rs.getString(1));
				customer.setName(rs.getString(2));
				Wallet wallet = new Wallet(rs.getBigDecimal(3));
				customer.setWallet(wallet);
				return customer;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Customer createAccount(String name, String mobileNo) 
	{
		
		Customer customer = new Customer(name, mobileNo, new Wallet(new BigDecimal(0)));
		String query = "insert into Customer values(?,?)";
		String query1 = "insert into Wallet values(?,0)";
		try {
			PreparedStatement st = ConnectionSQL.con.prepareStatement(query);
			PreparedStatement st1 = ConnectionSQL.con.prepareStatement(query1);
			st.setString(2, customer.getName());
			st.setString(1, customer.getMobileNo());
			st1.setString(1, customer.getMobileNo());
			st.execute();
			st1.execute();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return customer;
	}

	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount)
	{
	
		Customer customer = new Customer();
		Wallet wallet = new Wallet();
		String query = "select c.mobileNo , c.name , w.balance from customer c , wallet w where c.mobileNo = w.mobileNo AND c.mobileNo = ?";
		String query1 = "update wallet set balance = ? where mobileNo = ?";
		BigDecimal balance = null;
		try 
		{
			PreparedStatement st = ConnectionSQL.con.prepareStatement(query);
			PreparedStatement st1 = ConnectionSQL.con.prepareStatement(query1);
			st.setString(1, mobileNo);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				customer.setMobileNo(rs.getString(1));
				customer.setName(rs.getString(2));
				balance = rs.getBigDecimal(3);
				
			}
			BigDecimal newBalance = balance.add(amount);
			st1.setBigDecimal(1, newBalance);
			st1.setString(2, mobileNo);
			st1.executeUpdate();
			wallet.setBalance(newBalance);
			customer.setWallet(wallet);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public Customer withdrawlAmount(String mobileNo, BigDecimal amount) 
	{
	
		Customer customer = new Customer();
		Wallet wallet = new Wallet();
		String query = "select c.mobileNo , c.name , w.balance from customer c , wallet w where c.mobileNo = w.mobileNo AND w.mobileNo = ?";
		String query1 = "update wallet set balance = ? where mobileNo = ?";
		BigDecimal balance = null;
		try 
		{
			PreparedStatement st = ConnectionSQL.con.prepareStatement(query);
			PreparedStatement st1 = ConnectionSQL.con.prepareStatement(query1);
			st.setString(1, mobileNo);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				customer.setMobileNo(rs.getString(1));
				customer.setName(rs.getString(2));
				balance = rs.getBigDecimal(3);
			}
			BigDecimal newBalance = balance.subtract(amount);
			int check = Integer.parseInt(newBalance.toString());
			if(check<=0)
			{
				return null;
			}
			st1.setBigDecimal(1, newBalance);
			st1.setString(2, mobileNo);
			st1.executeUpdate();
			wallet.setBalance(newBalance);
			customer.setWallet(wallet);
			return customer;
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return null;
			
	}
}
