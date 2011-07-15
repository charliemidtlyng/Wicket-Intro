package no.bekk.charlie;

import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication
{    

	public WicketApplication()
	{
	}
	
	public Class<Guestbook> getHomePage()
	{
		return Guestbook.class;
	}
	
}
