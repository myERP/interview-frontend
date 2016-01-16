package com.oneup.addressbook.client;

import com.oneup.addressbook.shared.Contact;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.List;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("contact")
public interface ContactService extends RemoteService {

  List<Contact> getContactList();

}
