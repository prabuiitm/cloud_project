//package com.deneebo.paas.util;
package complete;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFiles 
{
	Properties properties = new Properties();
	public Properties cassandra() throws IOException
	{
		InputStream in = this.getClass().getResourceAsStream("/home/boss/Cloud_Proj/complete/cassandra.properties");
		properties.load(in);
		return properties;
	}
	
	public Properties socket() throws IOException
	{
		
		InputStream in = this.getClass().getResourceAsStream("/home/boss/Cloud_Proj/complete/socket.properties");
		properties.load(in);
		return properties;
	}
	
	public Properties kafka() throws IOException
	{
		
		InputStream in = this.getClass().getResourceAsStream("/home/boss/Cloud_Proj/complete/kafka.properties");
		properties.load(in);
		return properties;
	}
	
	public Properties zookeeper() throws IOException
	{
		InputStream in = this.getClass().getResourceAsStream("/home/boss/Cloud_Proj/complete/zookeeper.properties");
		properties.load(in);
		return properties;
	}
}
