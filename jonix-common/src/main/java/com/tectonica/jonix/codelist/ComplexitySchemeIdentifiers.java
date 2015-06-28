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

package com.tectonica.jonix.codelist;

import java.util.HashMap;
import java.util.Map;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 32</b>
 * <p>
 * Description: Complexity scheme identifier code
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">ONIX Codelists</a>
 */
public enum ComplexitySchemeIdentifiers
{
	/**
	 * For example AD or HL. DEPRECATED in ONIX 3 &#8211; use code 06 instead.
	 */
	Lexile_code("01"), //

	/**
	 * For example 880L. DEPRECATED in ONIX 3 &#8211; use code 06 instead.
	 */
	Lexile_number("02"), //

	/**
	 * Fry readability metric based on number of sentences and syllables per 100 words. Expressed as a number from 1 to
	 * 15 in &lt;ComplexityCode&gt;.
	 */
	Fry_Readability_score("03"), //

	/**
	 * UK Institute of Education Book Bands for Guided Reading scheme (see http://www.ioe.ac.uk/research/4664.html).
	 * &lt;ComplexityCode&gt; is a colour, eg &#8216;Pink A&#8217; or &#8216;Copper&#8217;.
	 */
	IoE_Book_Band("04"), //

	/**
	 * &lt;ComplexityCode&gt; is a code from &#8216;A&#8217; to Z+&#8217;.
	 */
	Fountas_and_Pinnell_Text_Level_Gradient("05"), //

	/**
	 * The Lexile measure in &lt;ComplexityCode&gt; combines the Lexile number (for example 620L or 880L) and optionally
	 * the Lexile code (for example AD or HL). Examples might be &#8216;880L&#8217;, &#8216;AD0L&#8217; or
	 * &#8216;HL600L&#8217;.
	 */
	Lexile_measure("06"), //

	/**
	 * Advantage-TASA Open Standard book readability score, used for example within the Accelerated Reader scheme.
	 * &lt;ComplexityCode&gt; is a real number between 0 and 17.
	 */
	ATOS_for_Books("07"), //

	/**
	 * Flesch-Kincaid Grade Level Formula, a standard readability measure based on the weighted number of syllables per
	 * word and words per sentence. &lt;ComplexityCode&gt; is a real number between about -1 and 20.
	 */
	Flesch_Kincaid_Grade_Level("08");

	public final String value;

	private ComplexitySchemeIdentifiers(String value)
	{
		this.value = value;
	}

	private static Map<String, ComplexitySchemeIdentifiers> map;

	private static Map<String, ComplexitySchemeIdentifiers> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (ComplexitySchemeIdentifiers e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static ComplexitySchemeIdentifiers byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
