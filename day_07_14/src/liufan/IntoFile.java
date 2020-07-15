package liufan;

import java.io.IOException;

public class IntoFile {
	IntoFile(String path) {
		try {
			Runtime.getRuntime().exec("explorer" + path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
