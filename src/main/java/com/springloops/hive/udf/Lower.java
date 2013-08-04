package com.springloops.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class Lower extends UDF {
	
	private Text text = new Text();
	
	public Text evaluate(final Text s) {
		if (s == null) { return null; }
		return text.set(s.toString().toLowerCase());
	}
}
