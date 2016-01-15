package com.oneup.addressbook.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.RootPanel;

public class AddressBook implements EntryPoint {

  public static final DateTimeFormat DATE_FORMAT = DateTimeFormat.getFormat("EEE, d MMM yyyy");

  private final static EventBus eventBus = new SimpleEventBus();

  @Override
  public void onModuleLoad() {
    RootPanel.get("rootPanel").add(new Book());
  }

  public static EventBus getEventBus() {
    return eventBus;
  }
}
