/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the LayoutSetPrototype service. Represents a row in the &quot;LayoutSetPrototype&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.LayoutSetPrototypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LayoutSetPrototype
 * @see com.liferay.portal.model.impl.LayoutSetPrototypeImpl
 * @see com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl
 * @generated
 */
@ProviderType
public interface LayoutSetPrototypeModel extends BaseModel<LayoutSetPrototype>,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a layout set prototype model instance should use the {@link LayoutSetPrototype} interface instead.
	 */

	/**
	 * Returns the primary key of this layout set prototype.
	 *
	 * @return the primary key of this layout set prototype
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this layout set prototype.
	 *
	 * @param primaryKey the primary key of this layout set prototype
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this layout set prototype.
	 *
	 * @return the uuid of this layout set prototype
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this layout set prototype.
	 *
	 * @param uuid the uuid of this layout set prototype
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the layout set prototype ID of this layout set prototype.
	 *
	 * @return the layout set prototype ID of this layout set prototype
	 */
	public long getLayoutSetPrototypeId();

	/**
	 * Sets the layout set prototype ID of this layout set prototype.
	 *
	 * @param layoutSetPrototypeId the layout set prototype ID of this layout set prototype
	 */
	public void setLayoutSetPrototypeId(long layoutSetPrototypeId);

	/**
	 * Returns the company ID of this layout set prototype.
	 *
	 * @return the company ID of this layout set prototype
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this layout set prototype.
	 *
	 * @param companyId the company ID of this layout set prototype
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this layout set prototype.
	 *
	 * @return the user ID of this layout set prototype
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this layout set prototype.
	 *
	 * @param userId the user ID of this layout set prototype
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this layout set prototype.
	 *
	 * @return the user uuid of this layout set prototype
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this layout set prototype.
	 *
	 * @param userUuid the user uuid of this layout set prototype
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this layout set prototype.
	 *
	 * @return the user name of this layout set prototype
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this layout set prototype.
	 *
	 * @param userName the user name of this layout set prototype
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this layout set prototype.
	 *
	 * @return the create date of this layout set prototype
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this layout set prototype.
	 *
	 * @param createDate the create date of this layout set prototype
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this layout set prototype.
	 *
	 * @return the modified date of this layout set prototype
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this layout set prototype.
	 *
	 * @param modifiedDate the modified date of this layout set prototype
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this layout set prototype.
	 *
	 * @return the name of this layout set prototype
	 */
	public String getName();

	/**
	 * Returns the localized name of this layout set prototype in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized name of this layout set prototype
	 */
	@AutoEscape
	public String getName(Locale locale);

	/**
	 * Returns the localized name of this layout set prototype in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this layout set prototype. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized name of this layout set prototype in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized name of this layout set prototype
	 */
	@AutoEscape
	public String getName(String languageId);

	/**
	 * Returns the localized name of this layout set prototype in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this layout set prototype
	 */
	@AutoEscape
	public String getName(String languageId, boolean useDefault);

	@AutoEscape
	public String getNameCurrentLanguageId();

	@AutoEscape
	public String getNameCurrentValue();

	/**
	 * Returns a map of the locales and localized names of this layout set prototype.
	 *
	 * @return the locales and localized names of this layout set prototype
	 */
	public Map<Locale, String> getNameMap();

	/**
	 * Sets the name of this layout set prototype.
	 *
	 * @param name the name of this layout set prototype
	 */
	public void setName(String name);

	/**
	 * Sets the localized name of this layout set prototype in the language.
	 *
	 * @param name the localized name of this layout set prototype
	 * @param locale the locale of the language
	 */
	public void setName(String name, Locale locale);

	/**
	 * Sets the localized name of this layout set prototype in the language, and sets the default locale.
	 *
	 * @param name the localized name of this layout set prototype
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setName(String name, Locale locale, Locale defaultLocale);

	public void setNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized names of this layout set prototype from the map of locales and localized names.
	 *
	 * @param nameMap the locales and localized names of this layout set prototype
	 */
	public void setNameMap(Map<Locale, String> nameMap);

	/**
	 * Sets the localized names of this layout set prototype from the map of locales and localized names, and sets the default locale.
	 *
	 * @param nameMap the locales and localized names of this layout set prototype
	 * @param defaultLocale the default locale
	 */
	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale);

	/**
	 * Returns the description of this layout set prototype.
	 *
	 * @return the description of this layout set prototype
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this layout set prototype.
	 *
	 * @param description the description of this layout set prototype
	 */
	public void setDescription(String description);

	/**
	 * Returns the settings of this layout set prototype.
	 *
	 * @return the settings of this layout set prototype
	 */
	@AutoEscape
	public String getSettings();

	/**
	 * Sets the settings of this layout set prototype.
	 *
	 * @param settings the settings of this layout set prototype
	 */
	public void setSettings(String settings);

	/**
	 * Returns the active of this layout set prototype.
	 *
	 * @return the active of this layout set prototype
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this layout set prototype is active.
	 *
	 * @return <code>true</code> if this layout set prototype is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this layout set prototype is active.
	 *
	 * @param active the active of this layout set prototype
	 */
	public void setActive(boolean active);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public String[] getAvailableLanguageIds();

	public String getDefaultLanguageId();

	public void prepareLocalizedFieldsForImport() throws LocaleException;

	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	@Override
	public Object clone();

	@Override
	public int compareTo(LayoutSetPrototype layoutSetPrototype);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LayoutSetPrototype> toCacheModel();

	@Override
	public LayoutSetPrototype toEscapedModel();

	@Override
	public LayoutSetPrototype toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}