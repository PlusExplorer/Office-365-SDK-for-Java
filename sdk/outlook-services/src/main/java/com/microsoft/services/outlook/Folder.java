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
 * The type Folder.
*/
public class Folder extends Entity {

    public Folder(){
        setODataType("#Microsoft.OutlookServices.Folder");
    }
            
    private String ParentFolderId;
     
    /**
    * Gets the Parent Folder Id.
    *
    * @return the String
    */
    public String getParentFolderId() {
        return this.ParentFolderId; 
    }

    /**
    * Sets the Parent Folder Id.
    *
    * @param value the String
    */
    public void setParentFolderId(String value) { 
        this.ParentFolderId = value; 
        valueChanged("ParentFolderId", value);

    }
            
    private String DisplayName;
     
    /**
    * Gets the Display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.DisplayName; 
    }

    /**
    * Sets the Display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.DisplayName = value; 
        valueChanged("DisplayName", value);

    }
            
    private Integer ChildFolderCount;
     
    /**
    * Gets the Child Folder Count.
    *
    * @return the Integer
    */
    public Integer getChildFolderCount() {
        return this.ChildFolderCount; 
    }

    /**
    * Sets the Child Folder Count.
    *
    * @param value the Integer
    */
    public void setChildFolderCount(Integer value) { 
        this.ChildFolderCount = value; 
        valueChanged("ChildFolderCount", value);

    }
    
        
    private java.util.List<Folder> ChildFolders = null;
    
    
     
    /**
    * Gets the Child Folders.
    *
    * @return the java.util.List<Folder>
    */
    public java.util.List<Folder> getChildFolders() {
        return this.ChildFolders; 
    }

    /**
    * Sets the Child Folders.
    *
    * @param value the java.util.List<Folder>
    */
    public void setChildFolders(java.util.List<Folder> value) { 
        this.ChildFolders = value; 
        valueChanged("ChildFolders", value);

    }
    
        
    private java.util.List<Message> Messages = null;
    
    
     
    /**
    * Gets the Messages.
    *
    * @return the java.util.List<Message>
    */
    public java.util.List<Message> getMessages() {
        return this.Messages; 
    }

    /**
    * Sets the Messages.
    *
    * @param value the java.util.List<Message>
    */
    public void setMessages(java.util.List<Message> value) { 
        this.Messages = value; 
        valueChanged("Messages", value);

    }
}

