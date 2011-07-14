package no.bekk.charlie;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Homepage
 */
public class HelloWorld extends WebPage {

    public HelloWorld() {

        add(new Label("tekst", "Hello World"));
    }
}
