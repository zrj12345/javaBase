package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//SequenceInputStream一次读取多个文件
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {

		Vector<FileInputStream> v = new Vector<FileInputStream>();

		v.add(new FileInputStream("1.txt"));
		v.add(new FileInputStream("2.txt"));

		Enumeration<FileInputStream> en = v.elements();

		SequenceInputStream sis = new SequenceInputStream(en);

		FileOutputStream fos = new FileOutputStream("3.txt");

		byte[] buf = new byte[1024];

		int len = 0;
		while ((len = sis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}

		fos.close();
		sis.close();
	}
}