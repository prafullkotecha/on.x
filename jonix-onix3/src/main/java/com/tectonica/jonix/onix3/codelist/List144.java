/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix.onix3.codelist;

/**
 * E-publication technical protection
 */
public enum List144
{
	/**
	 * Has no technical protection.
	 */
	None("00"), //

	/**
	 * Has DRM protection.
	 */
	DRM("01"), //

	/**
	 * Has digital watermarking.
	 */
	Digital_watermarking("02"), //

	/**
	 * Has DRM protection applied by the Adobe CS4 Content Server Package or by the Adobe ADEPT hosted service.
	 */
	Adobe_DRM("03"), //

	/**
	 * FairPlay’ DRM protection applied via Apple proprietary online store.
	 */
	Apple_DRM("04"), //

	/**
	 * Has OMA v2 DRM protection applied, as used to protect some mobile phone content.
	 */
	OMA_DRM("05");

	public final String value;

	private List144(String value)
	{
		this.value = value;
	}

	public static List144 byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		for (List144 e : values())
			if (e.value.equals(value))
				return e;
		return null;
	}
}