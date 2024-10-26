package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.pojo.Address;
import com.nit.pojo.Colleagues;
import com.nit.pojo.Emp;
// here no one calling like setter Methods ,Constructor , it's calling Automatically
@Configuration
public class Config {
	@Bean("AddressId1")
	public Address createObject()
	{
		Address ad=new Address();
		ad.setStreet("palamaner");
		ad.setState("ap");
		ad.setPincode(517408);
		return ad;
	}
	@Bean("AddressId2")
	public Address createObject1()
	{
		Address ad=new Address();
		ad.setStreet("Bangolore");
		ad.setState("karnataka");
		ad.setPincode(751022);
		return ad;
	}
	@Bean("ColleaguesId1")
	public Colleagues createObject12()
	{
		Colleagues c=new Colleagues();
		c.setName1("surya");
		c.setName2("vikram");
		c.setName3("karthik");
		return c;
	}
	@Bean("EmpId1")
	public Emp createObject2()
	{
		Emp e=new Emp();
		e.setEid(102);
		e.setEname("tim");
		e.setSal(800000);
		return e;
	}
}
