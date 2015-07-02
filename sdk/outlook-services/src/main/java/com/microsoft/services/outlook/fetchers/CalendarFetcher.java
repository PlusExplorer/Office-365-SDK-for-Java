/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.services.outlook.fetchers;

import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;
import com.microsoft.services.outlook.Calendar;
import com.microsoft.services.outlook.Event;

/**
 * The type  CalendarFetcher.
 */
public class CalendarFetcher extends OrcEntityFetcher<Calendar,CalendarOperations>
                                     implements Readable<Calendar> {

     /**
     * Instantiates a new CalendarFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public CalendarFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, Calendar.class, CalendarOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public CalendarFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public CalendarFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }


     /**
     * Gets calendar view.
     *
     * @return the calendar view
     */
    public OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations> getCalendarView() {
        return new OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("CalendarView", this, Event.class, EventCollectionOperations.class);
    }

    /**
     * Gets calendar view.
     *
     * @return the calendar view
     */
    public EventFetcher getCalendarView(String id){
         return new OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("CalendarView", this, Event.class, EventCollectionOperations.class).getById(id);
    }

     /**
     * Gets events.
     *
     * @return the events
     */
    public OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations> getEvents() {
        return new OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("Events", this, Event.class, EventCollectionOperations.class);
    }

    /**
     * Gets event.
     *
     * @return the event
     */
    public EventFetcher getEvent(String id){
         return new OrcCollectionFetcher<Event, EventFetcher, EventCollectionOperations>("Events", this, Event.class, EventCollectionOperations.class).getById(id);
    }

}
