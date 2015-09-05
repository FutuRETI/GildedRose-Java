package it.reti.futureti.GildedRose;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ApprovalTest {
	private static final String goldenMasterOutputFile = "goldenMasterTestOutput.txt";

	@Test
    public void GoldenMasterTest() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ByteArrayInputStream bais = new ByteArrayInputStream("a\n".getBytes());
    	
        System.setOut(new PrintStream(baos));
        System.setIn(bais);

        TextTestFixture.main(new String[] { });
        String output = baos.toString();
		
		File file = new File(goldenMasterOutputFile);
		if (file.exists()) {
	        Assert.assertEquals(readFile(file), output);
		}
		else {
			writeFile(file, new ByteArrayInputStream(baos.toByteArray()));
			Assert.assertTrue("File for goldMaster test non present, created with current output.", false);
		}
    }
    
	@Ignore
	public void writeFile(File file, InputStream stream) throws FileNotFoundException, IOException {
		OutputStream out = new FileOutputStream(file);
		
		byte[] buf = new byte[1024];
		int len;
		while ((len = stream.read(buf)) > 0) {
		    out.write(buf, 0, len);
		}
		out.close();
	}
	
	@Ignore
	public String readFile(File file) throws IOException {
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				baos.write(buf, 0, len);
			}
			return baos.toString();
		}
		finally {
			in.close();
		}
	}
}
