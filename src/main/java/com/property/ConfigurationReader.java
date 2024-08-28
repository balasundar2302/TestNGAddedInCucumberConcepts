package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public Properties p;

	public ConfigurationReader() throws IOException {
		File f = new File(
				"C:\\Users\\lenovo\\TrendsWorkspace\\MavenProject2\\src\\main\\java\\com\\property\\propertyFile");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getUserName() {
		String user = p.getProperty("username");
		return user;
	}

	public String getPassword() {
		String pass = p.getProperty("password");
		return pass;
	}

}
