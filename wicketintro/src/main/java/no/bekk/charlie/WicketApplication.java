package no.bekk.charlie;

import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication
{    
	public WicketApplication()
	{
	}
	
	public Class<HelloWorld> getHomePage()
	{
		return HelloWorld.class;
	}

}
