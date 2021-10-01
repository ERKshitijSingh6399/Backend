package com.app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Admins;
import com.app.model.Information;
import com.app.repository.AdminRepository;
import com.app.repository.InformationRepository;
import com.app.service.AdminCrudServices;
import com.app.service.InformationCrudServices;


@RunWith(SpringRunner.class)
@SpringBootTest
class AgrotechcApplicationTests {

	@Autowired
	private AdminCrudServices aservice;
	@MockBean
	private AdminRepository repository;
	@Test
	public void getAllAdminsTest() {
		when(repository.findAll()).thenReturn(Stream.of(
	new Admins(1,"rishi@gmail.com","ert252"),
	new Admins(2,"roy@gmail.com","roy1234")).collect(Collectors.toList()));
		assertEquals(2,aservice.getAllAdmins().size());
	}
	
	@Autowired
	private InformationCrudServices iservice;
	@MockBean
	private InformationRepository irepository;
	@Test
	public void getAllInformationTest() {
		when(irepository.findAll()).thenReturn(Stream.of(
	new Information(1,"Growing Mango","Methods to grow grain is water","imageurl1","reference-link1"),
	new Information(2,"Cultivating Grains","Secret for growing healthy grains","imageurl2","reference-link2")).collect(Collectors.toList()));
		assertEquals(2,iservice.getAllInformation().size());
	}

}
