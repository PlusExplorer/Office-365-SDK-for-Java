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
package com.microsoft.services.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Patterned Recurrence.
*/
public class PatternedRecurrence extends ODataBaseEntity {

    public PatternedRecurrence(){
        setODataType("#Microsoft.Graph.PatternedRecurrence");
    }

    private RecurrencePattern Pattern;

    /**
    * Gets the Pattern.
    *
    * @return the RecurrencePattern
    */
    public RecurrencePattern getPattern() {
        return this.Pattern; 
    }

    /**
    * Sets the Pattern.
    *
    * @param value the RecurrencePattern
    */
    public void setPattern(RecurrencePattern value) { 
        this.Pattern = value;
        valueChanged("Pattern", value);

    }

    private RecurrenceRange Range;

    /**
    * Gets the Range.
    *
    * @return the RecurrenceRange
    */
    public RecurrenceRange getRange() {
        return this.Range; 
    }

    /**
    * Sets the Range.
    *
    * @param value the RecurrenceRange
    */
    public void setRange(RecurrenceRange value) { 
        this.Range = value;
        valueChanged("Range", value);

    }
}
