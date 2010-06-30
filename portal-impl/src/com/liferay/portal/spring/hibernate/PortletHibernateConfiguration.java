/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.spring.hibernate;

import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;

import java.util.Properties;
import java.util.Set;

import org.hibernate.cfg.Configuration;

/**
 * <a href="PortletHibernateConfiguration.java.html"><b><i>View Source</i></b>
 * </a>
 *
 * @author Brian Wing Shun Chan
 * @author Ganesh Ram
 * @author Marcellus Tavares
 */
public class PortletHibernateConfiguration
	extends PortalHibernateConfiguration {

	public void setHibernateProperties(Properties hibernateProperties) {
		_hibernateProperties = hibernateProperties;
	}

	protected ClassLoader getConfigurationClassLoader() {
		return PortletClassLoaderUtil.getClassLoader();
	}

	protected String[] getConfigurationResources() {
		return new String[] {"META-INF/portlet-hbm.xml"};
	}

	protected Configuration newConfiguration() {
		Configuration configuration = super.newConfiguration();

		if (_hibernateProperties != null) {
			Set<String> propertyNames =
				_hibernateProperties.stringPropertyNames();

			for (String propertyName : propertyNames) {
				String propertyValue =
					_hibernateProperties.getProperty(propertyName);

				configuration.setProperty(propertyName, propertyValue);
			}
		}

		return configuration;
	}

	private Properties _hibernateProperties;

}