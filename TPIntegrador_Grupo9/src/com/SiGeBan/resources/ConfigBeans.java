package com.SiGeBan.resources;

import java.util.ArrayList;

import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;

import com.SiGeBan.models.dao.ConfigHibernate;
import com.SiGeBan.models.entity.Usuarios;
import com.mysql.cj.xdevapi.SessionFactory;

@Configuration
public class ConfigBeans {

//	@Bean
//	public ArrayList<Usuarios> obtenerUsuarioss(){
//		
//	}
	
	
//	@Bean
//	public HibernateTransactionManager transactionManager() {
//		set.dataAccess(dataAccesBean);
//	}
//	@Autowired
//	private ConfigHibernate configHibernate;
//	
//	<!-- CREO EL SERVICIO PARA USUARIO -->
//	<bean id="serviceBean" class="frgp.utn.edu.ar.servicioImpl.UsuarioServicioImpl">
//		<property name="dataAccess" ref="dataAccessBean"></property>
//	</bean>	
//		class="org.springframework.orm.hibernate4.HibernateTransactionManager">
//		<property name="sessionFactory" ref="sessionFactoryBean"></property>
//	</bean>
//
//	<!-- Para que lea los metodos anotados con @Transactional -->
//	<tx:annotation-driven transaction-manager="transactionManager" />
//	
//	


	

//	<!-- EL SERVICIO NECESITA EL DAO  -->
//	<bean id="dataAccessBean" class="frgp.utn.edu.ar.daoImpl.UsuarioDaoImpl" 
//		scope="singleton"> 
//		<property name="sessionFactory" ref="sessionFactoryBean"></property> 
//	</bean>


}
