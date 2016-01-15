package com.oneup.addressbook.server;

import com.oneup.addressbook.client.ContactService;
import com.oneup.addressbook.shared.Contact;
import com.oneup.addressbook.shared.ContactGroup;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("deprecation")
public class ContactServiceImpl extends RemoteServiceServlet implements ContactService {

  private static final List<Contact> contacts = new ArrayList<>();

  static {
    contacts.add(new Contact("John Nadal", "john.nadal@oneup.com", "(415) 555-6789", new Date(60, 1, 8),
        ContactGroup.EXECUTIVE));
    contacts.add(new Contact("Jane Nadal", "jane.nadal@oneup.com", "(415) 555-1234", new Date(78, 12, 18),
        ContactGroup.EXECUTIVE));
    contacts.add(new Contact("Travis One", "travis.one@oneup.com", "(415) 555-4567", new Date(80, 2, 6),
        ContactGroup.PRODUCT));
    contacts.add(new Contact("Mike Andersson", "mike@oneup.com", "(415) 555-6773", new Date(88, 9, 23),
        ContactGroup.DEVELOPPERS));
    contacts.add(new Contact("Jason Doe", "jason@oneup.com", "+1232421412", new Date(86, 8, 1),
        ContactGroup.DEVELOPPERS));
    contacts.add(new Contact("Kelly Doe", "kelly@oneup.com", "(415) 555-9873", new Date(87, 2, 8),
        ContactGroup.DEVELOPPERS));
    contacts.add(new Contact("David Middlemame Withalonglastname", "david.middlename.withalonglastname@oneup.com",
        "(415) 555-1384", new Date(1984, 1, 12), ContactGroup.DEVELOPPERS));
    contacts.add(new Contact("Support One", "support-one@oneup.com", "+323321332192", new Date(86, 1, 12),
        ContactGroup.SUPPORT));
    contacts.add(new Contact("Support Two", "support-two@oneup.com", "+534523513213213", new Date(75, 8, 11),
        ContactGroup.SUPPORT));
  }

  @Override
  public List<Contact> getContactList() {
    return contacts;
  }
}
