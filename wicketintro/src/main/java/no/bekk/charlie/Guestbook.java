package no.bekk.charlie;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

public class Guestbook extends WebPage {
	private static List<Comment> commentsList = new ArrayList<Comment>();
	private CommentsPanel commentsPanel = new CommentsPanel("comments", commentsList);
	private Comment comment = new Comment();

	public Guestbook() {
		//Må ha en spesifikk markup-id for å refreshes
		commentsPanel.setOutputMarkupPlaceholderTag(true);

		add(
			new Form<Comment>("guestbookform", new CompoundPropertyModel<Comment>(comment)).add(
			
				new Label("header", "Skriv inn i min gjestebok!"), 
				
				new TextField("name"), 
				new TextArea("text"), 
				
				new AjaxButton("submit") {
					@Override
					protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
						commentsList.add(0,(Comment) form.getModelObject());
						
						//Nullstille objektet, tømme formet og oppdatere innleggene
						target.addComponent(commentsPanel);
						form.setDefaultModelObject(new Comment());
						form.clearInput();
						target.addComponent(form);
					}
				}
		));

		add(commentsPanel);

	}
}
