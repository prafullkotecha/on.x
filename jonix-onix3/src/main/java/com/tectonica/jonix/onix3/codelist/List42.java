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

import java.util.HashMap;
import java.util.Map;

/**
 * Text item type code
 */
public enum List42
{
	/**
	 * A complete work which is published as a content item in a product which carries two or more such works, eg when two or three novels
	 * are published in a single omnibus volume.
	 */
	Textual_work("01"), //

	/**
	 * Text components such as Preface, Introduction etc which appear as preliminaries to the main body of text content in a product.
	 */
	Front_matter("02"), //

	/**
	 * Text components such as Part, Chapter, Section etc which appear as part of the main body of text content in a product.
	 */
	Body_matter("03"), //

	/**
	 * Text components such as Index which appear after the main body of text in a product.
	 */
	Back_matter("04"), //

	/**
	 * For journals.
	 */
	Serial_item__miscellaneous_or_unspecified("10"), //

	/**
	 * For journals.
	 */
	Research_article("11"), //

	/**
	 * For journals.
	 */
	Review_article("12"), //

	/**
	 * For journals.
	 */
	Letter("13"), //

	/**
	 * For journals.
	 */
	Short_communication("14"), //

	/**
	 * For journals.
	 */
	Erratum("15"), //

	/**
	 * For journals.
	 */
	Abstract("16"), //

	/**
	 * For journals.
	 */
	Book_review__or_review_of_other_publication_("17"), //

	/**
	 * For journals.
	 */
	Editorial("18"), //

	/**
	 * For journals.
	 */
	Product_review("19"), //

	Index("20"), //

	/**
	 * For journals.
	 */
	Obituary("21");

	public final String value;

	private List42(String value)
	{
		this.value = value;
	}

	private static Map<String, List42> map;

	private static Map<String, List42> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (List42 e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static List42 byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}