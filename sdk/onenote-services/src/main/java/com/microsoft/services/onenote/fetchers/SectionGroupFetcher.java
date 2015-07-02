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
package com.microsoft.services.onenote.fetchers;

import com.microsoft.services.onenote.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  SectionGroupFetcher.
 */
public class SectionGroupFetcher extends OrcEntityFetcher<SectionGroup,SectionGroupOperations> 
                                     implements Readable<SectionGroup> {

     /**
     * Instantiates a new SectionGroupFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public SectionGroupFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, SectionGroup.class, SectionGroupOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public SectionGroupFetcher addParameter(String name, Object value) {
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
    public SectionGroupFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

             /**
     * Gets parentnotebook.
     *
     * @return the parent notebook
     */
    public NotebookFetcher getParentNotebook() {
        return new NotebookFetcher("parentNotebook", this);
    }
     /**
     * Gets parentsectiongroup.
     *
     * @return the parent section group
     */
    public SectionGroupFetcher getParentSectionGroup() {
        return new SectionGroupFetcher("parentSectionGroup", this);
    }

     /**
     * Gets sections.
     *
     * @return the sections
     */
    public OrcCollectionFetcher<Section, SectionFetcher, SectionCollectionOperations> getSections() {
        return new OrcCollectionFetcher<Section, SectionFetcher, SectionCollectionOperations>("sections", this, Section.class, SectionCollectionOperations.class);
    }

    /**
     * Gets section.
     *
     * @return the section
     */
    public SectionFetcher getSection(String id){
         return new OrcCollectionFetcher<Section, SectionFetcher, SectionCollectionOperations>("sections", this, Section.class, SectionCollectionOperations.class).getById(id);
    }

     /**
     * Gets section groups.
     *
     * @return the section groups
     */
    public OrcCollectionFetcher<SectionGroup, SectionGroupFetcher, SectionGroupCollectionOperations> getSectionGroups() {
        return new OrcCollectionFetcher<SectionGroup, SectionGroupFetcher, SectionGroupCollectionOperations>("sectionGroups", this, SectionGroup.class, SectionGroupCollectionOperations.class);
    }

    /**
     * Gets section group.
     *
     * @return the section group
     */
    public SectionGroupFetcher getSectionGroup(String id){
         return new OrcCollectionFetcher<SectionGroup, SectionGroupFetcher, SectionGroupCollectionOperations>("sectionGroups", this, SectionGroup.class, SectionGroupCollectionOperations.class).getById(id);
    }

}
