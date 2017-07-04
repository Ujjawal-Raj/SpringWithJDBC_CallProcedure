package com.cbit;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class DemoBean extends StoredProcedure {

	public DemoBean(DataSource ds) {
		super(ds, "Proc1");
		declareParameter(new SqlParameter("eno", Types.INTEGER)); // In
																	// parameter
		declareParameter(new SqlOutParameter("name", Types.VARCHAR)); // Out
																		// parameter
		declareParameter(new SqlOutParameter("exp", Types.INTEGER)); // Out
																		// parameter
	}

	public void callProcedure(int empno) {
		Map<String, Integer> imp = new HashMap<String, Integer>();
		imp.put("eno", empno);
		Map omp = execute(imp);
		Object obj1 = omp.get("name");
		Object obj2 = omp.get("exp");
		System.out.println("Name : " + obj1.toString());
		System.out.println("Experience : " + ((Integer) obj2).intValue());
	}
}
