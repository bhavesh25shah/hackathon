package org.fluttercode.datafactory.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Writer out = new OutputStreamWriter(
					new FileOutputStream(new File("/Users/bhaveshshah/Desktop/customdata.csv")));

			BufferedWriter bw = new BufferedWriter(out);
			bw.write("customerid,firstnmae,lastname,street,address,city,country,birthdate\n");
			DataFactory d = new DataFactory();
			int cnt = 10001;
			for (int i = 0; i < 10000; i++) {
				cnt += 1;
				StringBuilder sb = new StringBuilder();
				sb.append(cnt + ",");
				sb.append(d.getFirstName() + ",");
				sb.append(d.getLastName() + ",");
				sb.append(d.getStreetName() + ",");
				sb.append(d.getAddress() + ",");
				sb.append(d.getCity() + ",");
				sb.append("USA,");
				sb.append(d.getBirthDate() + "\n");

				bw.write(sb.toString());
				bw.flush();

			}

		} catch (Exception e) {
		}

	}

}
