/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.cdi.extension.spi.test.constructor.exception;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ExtensionRegisteredBean {

    @Override
    public String toString() {
        return "extension registered bean was injected";
    }
}
