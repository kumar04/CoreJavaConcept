package com.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			EmployeeModel emp = new EmployeeModel();
			emp.setId(1000);
			emp.setName("AB");
			emp.setAddress("Bangaloee");
			EmployeeModel empModel = new EmployeeModel();
			empModel.setId(1001);
			empModel.setName("BC");
			empModel.setAddress("Delhi");
			CompanyBean company = new CompanyBean();
			company.setName("Capgemini");
			company.setEstablishYear(2006);
			company.setModel(emp);
			CompanyBean companyBean = new CompanyBean();
			companyBean.setName("IBM");
			companyBean.setEstablishYear(1880);
			companyBean.setModel(empModel);
			FileOutputStream stream = new FileOutputStream(
					"F:/Kumar/code/core-java-app/src/com/core/serialization/output.txt");
			ObjectOutputStream outputStream = new ObjectOutputStream(stream);
			outputStream.writeObject(companyBean);
			outputStream.flush();
			System.out.println("successfully write");
			System.out.println("Deserialization........");
			ObjectInputStream inputStream = new ObjectInputStream(
					new FileInputStream("F:/Kumar/code/core-java-app/src/com/core/serialization/output.txt"));
			CompanyBean bean = (CompanyBean) inputStream.readObject();
			System.out.println(
					"After Deserialization:" + "Company Name:"+bean.getName() + ",Company Estalish Year: " + bean.getEstablishYear() + " " + bean.getModel());

		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
