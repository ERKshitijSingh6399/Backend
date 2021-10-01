package com.app.service.impl;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.app.model.Farmer;
import com.app.repository.FarmerRepository;
import com.app.service.FarmerSearchServices;

@Aspect
@Component
class MyAspect {
	@Before("execution(* com.app.service.impl.FarmerSearchServicesImpl.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.print("Before ");
		System.out.print(joinPoint.getSignature().getName() + " called with ");
		System.out.println(Arrays.toString(joinPoint.getArgs()));
	}

	@AfterReturning(pointcut = "execution(* com.app.service.impl.FarmerSearchServicesImpl.*(..))", returning = "result")
	public void after(JoinPoint joinPoint, Object result) {
		System.out.print("After: ");
		System.out.println(" result is " + result);
	}

}

@Service
@Transactional
public class FarmerSearchServicesImpl implements FarmerSearchServices{

	@Autowired
	private FarmerRepository repository;
	
	@Override
	public List<Farmer> filterByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByFarmerName(name);
	}
	
	@Override
	public List<Farmer> getAllFarmers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Farmer> filterByAge(int age) {
		// TODO Auto-generated method stub
		return repository.findByAge(age);
	}

	@Override
	public List<Farmer> filterByLandSize(String landsize) {
		// TODO Auto-generated method stub
		return repository.findByLandSize(landsize);
	}

	@Override
	public List<Farmer> filterByGender(String gender) {
		// TODO Auto-generated method stub
		return repository.findByGender(gender);
	}

}
