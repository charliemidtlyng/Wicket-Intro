package no.bekk.charlie;

import java.io.Serializable;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.basic.MultiLineLabel;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

public class CommentsPanel extends Panel {

	public CommentsPanel(String id, final List<Comment> comments) {
		super(id);
		
        add(new ListView<Comment>("comments", comments) {
			@Override
			protected void populateItem(ListItem<Comment> item) {
				Comment c = item.getModelObject();
				item.add(new Label("name", c.name));
                item.add(new MultiLineLabel("text", c.text));
			}
        });

	}

}
