package com.oneup.addressbook.client;

import com.oneup.addressbook.shared.Contact;

import com.google.gwt.user.client.rpc.AsyncCallback;

import java.util.List;

public interface ContactServiceAsync {

  void getContactList(AsyncCallback<List<Contact>> callback);

}
