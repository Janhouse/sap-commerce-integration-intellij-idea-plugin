/*
 * Copyright 2015 Alexander Bartash <AlexanderBartash@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.idea.plugin.hybris.project.settings.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Configures an hmc module for the extension. Required directory: /hmc.
 * <p/>
 * <p>Java class for hmcmoduleType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="hmcmoduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="additionalclasspath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="extensionclassname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceavailable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hmcmoduleType")
public class HmcModuleType {

    @XmlAttribute
    protected String additionalclasspath;
    @XmlAttribute
    protected String extensionclassname;
    @XmlAttribute
    protected Boolean sourceavailable;

    /**
     * Gets the value of the additionalclasspath property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAdditionalclasspath() {
        return additionalclasspath;
    }

    /**
     * Sets the value of the additionalclasspath property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAdditionalclasspath(String value) {
        this.additionalclasspath = value;
    }

    /**
     * Gets the value of the extensionclassname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtensionclassname() {
        return extensionclassname;
    }

    /**
     * Sets the value of the extensionclassname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtensionclassname(String value) {
        this.extensionclassname = value;
    }

    /**
     * Gets the value of the sourceavailable property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSourceavailable() {
        return sourceavailable;
    }

    /**
     * Sets the value of the sourceavailable property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSourceavailable(Boolean value) {
        this.sourceavailable = value;
    }

}