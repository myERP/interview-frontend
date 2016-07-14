package com.oneup.addressbook.client;

import com.oneup.addressbook.shared.Contact;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import java.util.List;

public class Book extends Composite {

  public static final ContactServiceAsync contactService = GWT.create(ContactService.class);

  private static BookUiBinder uiBinder = GWT.create(BookUiBinder.class);

  interface BookUiBinder extends UiBinder<Widget, Book> {
  }

  @UiField
  HTMLPanel cardsPanel;
  @UiField
  HTMLPanel detailPanel;

  public Book() {
    initWidget(uiBinder.createAndBindUi(this));
    contactService.getContactList(new AsyncCallback<List<Contact>>() {
      @Override
      public void onSuccess(List<Contact> contacts) {
        // TODO Display the contact list in the UI
      }

      @Override
      public void onFailure(Throwable caught) {
        // Nothing to be done here 
      }
    });
  }
}
