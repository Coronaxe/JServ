package at.coro.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import at.coro.run.MainClass;

public class ConfigManager {
	
	public static Properties initializeConfig(){
		Properties initialConfig = new Properties();
		initialConfig.setProperty("Port", "5050");
		initialConfig.setProperty("IPAddress", "127.0.0.1");
		initialConfig.setProperty("MOTD","Java is not C");
		return initialConfig;
	}
	
	public static Properties loadConfig(String configPath) throws IOException{
		FileInputStream configStream = new FileInputStream(new File(configPath));
		Properties config = new Properties();
		config.load(configStream);
		return config;
	}
	
	public static void saveConfig(Properties config, String configPath) throws IOException{
		FileOutputStream configStream = new FileOutputStream(new File(configPath));
		config.store(configStream, "Config File for JServ Version " + MainClass.version);
		return;
	}

}
