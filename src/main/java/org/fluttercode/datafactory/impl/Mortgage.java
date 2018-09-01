package org.fluttercode.datafactory.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Writer out = new OutputStreamWriter(
					new FileOutputStream(new File("/Users/bhaveshshah/Desktop/mortgagedata.csv")));

			BufferedWriter bw = new BufferedWriter(out);
			bw.write(
					"loanid,borrowerid,mortgagerate,interesttype,sanctiondate,disbursementdate,term,valuation,principal,interestamount,status\n");
			DataFactory d = new DataFactory();
			int cnt = 123456;
			for (int i = 0; i < 2000; i++) {
				cnt += 1;
				StringBuilder sb = new StringBuilder();
				sb.append(cnt + ",");

				sb.append(d.getNumberBetween(10000, 20000) + ",");
				sb.append(d.getDecimalNumberBetween(new BigDecimal(4), new BigDecimal(9)) + ",");
				sb.append(d.getItem(Arrays.asList("Fixed", "Floating")) + ",");
				sb.append(d.getDateBetween(new Date(2000, 01, 01), new Date(2018, 06, 01)) + ",");
				sb.append(d.getDateBetween(new Date(2000, 01, 01), new Date(2018, 06, 01)) + ",");
				sb.append(d.getNumberBetween(60, 240) + ",");

				sb.append(d.getDecimalNumberBetween(new BigDecimal(1000000), new BigDecimal(4000000)) + ",");
				sb.append(d.getDecimalNumberBetween(new BigDecimal(1000000), new BigDecimal(4000000)) + ",");
				sb.append(d.getDecimalNumberBetween(new BigDecimal(100000), new BigDecimal(600000)) + ",");

				sb.append("Open\n");

				bw.write(sb.toString());
				bw.flush();

			}

		} catch (Exception e) {
		}

	}

}
