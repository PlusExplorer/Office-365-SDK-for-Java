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
import com.microsoft.services.outlook.EventMessage;

/**
 * The type  EventMessageFetcher.
 */
public class EventMessageFetcher extends OrcEntityFetcher<EventMessage,EventMessageOperations>
                                     implements Readable<EventMessage> {

     /**
     * Instantiates a new EventMessageFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public EventMessageFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, EventMessage.class, EventMessageOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public EventMessageFetcher addParameter(String name, Object value) {
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
    public EventMessageFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

             /**
     * Gets event.
     *
     * @return the event
     */
    public EventFetcher getEvent() {
        return new EventFetcher("Event", this);
    }

}
