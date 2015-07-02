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
package com.microsoft.services.outlook;


/**
 * The type Event.
*/
public class Event extends Item {

    public Event(){
        setODataType("#Microsoft.OutlookServices.Event");
    }
            
    private String Subject;
     
    /**
    * Gets the Subject.
    *
    * @return the String
    */
    public String getSubject() {
        return this.Subject; 
    }

    /**
    * Sets the Subject.
    *
    * @param value the String
    */
    public void setSubject(String value) { 
        this.Subject = value; 
        valueChanged("Subject", value);

    }
            
    private ItemBody Body;
     
    /**
    * Gets the Body.
    *
    * @return the ItemBody
    */
    public ItemBody getBody() {
        return this.Body; 
    }

    /**
    * Sets the Body.
    *
    * @param value the ItemBody
    */
    public void setBody(ItemBody value) { 
        this.Body = value; 
        valueChanged("Body", value);

    }
            
    private String BodyPreview;
     
    /**
    * Gets the Body Preview.
    *
    * @return the String
    */
    public String getBodyPreview() {
        return this.BodyPreview; 
    }

    /**
    * Sets the Body Preview.
    *
    * @param value the String
    */
    public void setBodyPreview(String value) { 
        this.BodyPreview = value; 
        valueChanged("BodyPreview", value);

    }
            
    private com.microsoft.services.outlook.Importance Importance;
     
    /**
    * Gets the Importance.
    *
    * @return the Importance
    */
    public Importance getImportance() {
        return this.Importance; 
    }

    /**
    * Sets the Importance.
    *
    * @param value the Importance
    */
    public void setImportance(Importance value) { 
        this.Importance = value; 
        valueChanged("Importance", value);

    }
            
    private Boolean HasAttachments;
     
    /**
    * Gets the Has Attachments.
    *
    * @return the Boolean
    */
    public Boolean getHasAttachments() {
        return this.HasAttachments; 
    }

    /**
    * Sets the Has Attachments.
    *
    * @param value the Boolean
    */
    public void setHasAttachments(Boolean value) { 
        this.HasAttachments = value; 
        valueChanged("HasAttachments", value);

    }
            
    private java.util.Calendar Start;
     
    /**
    * Gets the Start.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getStart() {
        return this.Start; 
    }

    /**
    * Sets the Start.
    *
    * @param value the java.util.Calendar
    */
    public void setStart(java.util.Calendar value) { 
        this.Start = value; 
        valueChanged("Start", value);

    }
            
    private String StartTimeZone;
     
    /**
    * Gets the Start Time Zone.
    *
    * @return the String
    */
    public String getStartTimeZone() {
        return this.StartTimeZone; 
    }

    /**
    * Sets the Start Time Zone.
    *
    * @param value the String
    */
    public void setStartTimeZone(String value) { 
        this.StartTimeZone = value; 
        valueChanged("StartTimeZone", value);

    }
            
    private java.util.Calendar End;
     
    /**
    * Gets the End.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getEnd() {
        return this.End; 
    }

    /**
    * Sets the End.
    *
    * @param value the java.util.Calendar
    */
    public void setEnd(java.util.Calendar value) { 
        this.End = value; 
        valueChanged("End", value);

    }
            
    private String EndTimeZone;
     
    /**
    * Gets the End Time Zone.
    *
    * @return the String
    */
    public String getEndTimeZone() {
        return this.EndTimeZone; 
    }

    /**
    * Sets the End Time Zone.
    *
    * @param value the String
    */
    public void setEndTimeZone(String value) { 
        this.EndTimeZone = value; 
        valueChanged("EndTimeZone", value);

    }
            
    private Integer Reminder;
     
    /**
    * Gets the Reminder.
    *
    * @return the Integer
    */
    public Integer getReminder() {
        return this.Reminder; 
    }

    /**
    * Sets the Reminder.
    *
    * @param value the Integer
    */
    public void setReminder(Integer value) { 
        this.Reminder = value; 
        valueChanged("Reminder", value);

    }
            
    private com.microsoft.services.outlook.Location Location;
     
    /**
    * Gets the Location.
    *
    * @return the Location
    */
    public Location getLocation() {
        return this.Location; 
    }

    /**
    * Sets the Location.
    *
    * @param value the Location
    */
    public void setLocation(Location value) { 
        this.Location = value; 
        valueChanged("Location", value);

    }
            
    private FreeBusyStatus ShowAs;
     
    /**
    * Gets the Show As.
    *
    * @return the FreeBusyStatus
    */
    public FreeBusyStatus getShowAs() {
        return this.ShowAs; 
    }

    /**
    * Sets the Show As.
    *
    * @param value the FreeBusyStatus
    */
    public void setShowAs(FreeBusyStatus value) { 
        this.ShowAs = value; 
        valueChanged("ShowAs", value);

    }
            
    private com.microsoft.services.outlook.ResponseStatus ResponseStatus;
     
    /**
    * Gets the Response Status.
    *
    * @return the ResponseStatus
    */
    public ResponseStatus getResponseStatus() {
        return this.ResponseStatus; 
    }

    /**
    * Sets the Response Status.
    *
    * @param value the ResponseStatus
    */
    public void setResponseStatus(ResponseStatus value) { 
        this.ResponseStatus = value; 
        valueChanged("ResponseStatus", value);

    }
            
    private Boolean IsAllDay;
     
    /**
    * Gets the Is All Day.
    *
    * @return the Boolean
    */
    public Boolean getIsAllDay() {
        return this.IsAllDay; 
    }

    /**
    * Sets the Is All Day.
    *
    * @param value the Boolean
    */
    public void setIsAllDay(Boolean value) { 
        this.IsAllDay = value; 
        valueChanged("IsAllDay", value);

    }
            
    private Boolean IsCancelled;
     
    /**
    * Gets the Is Cancelled.
    *
    * @return the Boolean
    */
    public Boolean getIsCancelled() {
        return this.IsCancelled; 
    }

    /**
    * Sets the Is Cancelled.
    *
    * @param value the Boolean
    */
    public void setIsCancelled(Boolean value) { 
        this.IsCancelled = value; 
        valueChanged("IsCancelled", value);

    }
            
    private Boolean IsOrganizer;
     
    /**
    * Gets the Is Organizer.
    *
    * @return the Boolean
    */
    public Boolean getIsOrganizer() {
        return this.IsOrganizer; 
    }

    /**
    * Sets the Is Organizer.
    *
    * @param value the Boolean
    */
    public void setIsOrganizer(Boolean value) { 
        this.IsOrganizer = value; 
        valueChanged("IsOrganizer", value);

    }
            
    private Boolean ResponseRequested;
     
    /**
    * Gets the Response Requested.
    *
    * @return the Boolean
    */
    public Boolean getResponseRequested() {
        return this.ResponseRequested; 
    }

    /**
    * Sets the Response Requested.
    *
    * @param value the Boolean
    */
    public void setResponseRequested(Boolean value) { 
        this.ResponseRequested = value; 
        valueChanged("ResponseRequested", value);

    }
            
    private EventType Type;
     
    /**
    * Gets the Type.
    *
    * @return the EventType
    */
    public EventType getType() {
        return this.Type; 
    }

    /**
    * Sets the Type.
    *
    * @param value the EventType
    */
    public void setType(EventType value) { 
        this.Type = value; 
        valueChanged("Type", value);

    }
            
    private String SeriesMasterId;
     
    /**
    * Gets the Series Master Id.
    *
    * @return the String
    */
    public String getSeriesMasterId() {
        return this.SeriesMasterId; 
    }

    /**
    * Sets the Series Master Id.
    *
    * @param value the String
    */
    public void setSeriesMasterId(String value) { 
        this.SeriesMasterId = value; 
        valueChanged("SeriesMasterId", value);

    }
    
        
    private java.util.List<Attendee> Attendees = null;
    
    
     
    /**
    * Gets the Attendees.
    *
    * @return the java.util.List<Attendee>
    */
    public java.util.List<Attendee> getAttendees() {
        return this.Attendees; 
    }

    /**
    * Sets the Attendees.
    *
    * @param value the java.util.List<Attendee>
    */
    public void setAttendees(java.util.List<Attendee> value) { 
        this.Attendees = value; 
        valueChanged("Attendees", value);

    }
            
    private PatternedRecurrence Recurrence;
     
    /**
    * Gets the Recurrence.
    *
    * @return the PatternedRecurrence
    */
    public PatternedRecurrence getRecurrence() {
        return this.Recurrence; 
    }

    /**
    * Sets the Recurrence.
    *
    * @param value the PatternedRecurrence
    */
    public void setRecurrence(PatternedRecurrence value) { 
        this.Recurrence = value; 
        valueChanged("Recurrence", value);

    }
            
    private Recipient Organizer;
     
    /**
    * Gets the Organizer.
    *
    * @return the Recipient
    */
    public Recipient getOrganizer() {
        return this.Organizer; 
    }

    /**
    * Sets the Organizer.
    *
    * @param value the Recipient
    */
    public void setOrganizer(Recipient value) { 
        this.Organizer = value; 
        valueChanged("Organizer", value);

    }
            
    private String iCalUId;
     
    /**
    * Gets the i Cal UId.
    *
    * @return the String
    */
    public String getICalUId() {
        return this.iCalUId; 
    }

    /**
    * Sets the i Cal UId.
    *
    * @param value the String
    */
    public void setICalUId(String value) { 
        this.iCalUId = value; 
        valueChanged("iCalUId", value);

    }
            
    private String WebLink;
     
    /**
    * Gets the Web Link.
    *
    * @return the String
    */
    public String getWebLink() {
        return this.WebLink; 
    }

    /**
    * Sets the Web Link.
    *
    * @param value the String
    */
    public void setWebLink(String value) { 
        this.WebLink = value; 
        valueChanged("WebLink", value);

    }
    
        
    private java.util.List<Attachment> Attachments = null;
    
    
     
    /**
    * Gets the Attachments.
    *
    * @return the java.util.List<Attachment>
    */
    public java.util.List<Attachment> getAttachments() {
        return this.Attachments; 
    }

    /**
    * Sets the Attachments.
    *
    * @param value the java.util.List<Attachment>
    */
    public void setAttachments(java.util.List<Attachment> value) { 
        this.Attachments = value; 
        valueChanged("Attachments", value);

    }
            
    private Calendar Calendar;
     
    /**
    * Gets the Calendar.
    *
    * @return the Calendar
    */
    public Calendar getCalendar() {
        return this.Calendar; 
    }

    /**
    * Sets the Calendar.
    *
    * @param value the Calendar
    */
    public void setCalendar(Calendar value) { 
        this.Calendar = value; 
        valueChanged("Calendar", value);

    }
    
        
    private java.util.List<Event> Instances = null;
    
    
     
    /**
    * Gets the Instances.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getInstances() {
        return this.Instances; 
    }

    /**
    * Sets the Instances.
    *
    * @param value the java.util.List<Event>
    */
    public void setInstances(java.util.List<Event> value) { 
        this.Instances = value; 
        valueChanged("Instances", value);

    }
}

