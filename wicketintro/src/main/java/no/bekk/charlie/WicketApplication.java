package no.bekk.charlie;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see no.bekk.charlie.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{    
    /**
     * Constructor
     */
	
	public static List<Comment> allComments = new ArrayList<Comment>();
	public WicketApplication()
	{
	}
	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<Guestbook> getHomePage()
	{
		return Guestbook.class;
	}
	
}
