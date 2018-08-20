/*******************************************************************************
 * Copyright 2012 Technology Blueprint Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.docusign.client.credential;

import java.util.List;

import org.apache.http.Header;
import org.jboss.resteasy.client.jaxrs.internal.ClientInvocation;

/**
 * The Interface DocuSignCredentials.
 * 
 * @author <a href="mailto:maltieri@exari.com">Marco Altieri</a>
 */
public interface DocuSignCredentials {

    /**
     * Sets the header.
     * 
     * @param request the new header
     */
    public void setHeader(ClientInvocation request);

    /**
     * Gets the username.
     * 
     * @return the username
     */
    public String getUsername();

    /**
     * Gets the header.
     * 
     * @param request the new header
     */
    public List<Header> getHeader();
}
