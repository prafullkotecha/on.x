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

package com.tectonica.jonix.onix3;

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextScriptCodes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Part number</h1>
 * <p>
 * When a title element includes a part designation within a larger whole (<i>eg</i> Part I, or Volume 3), this field
 * should be used to carry the number and its ‘caption’ as text. Optional and non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Variable-length text, suggested maximum 20 characters</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;PartNumber&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;x410&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;1</td>
 * </tr>
 * <tr>
 * <td>Attributes</td>
 * <td>language, textscript</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;x410&gt;Volume 17&lt;/x410&gt;</td>
 * </tr>
 * </table>
 */
public class PartNumber implements OnixElement, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "PartNumber";
	public static final String shortname = "x410";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	public LanguageCodes language;

	public TextScriptCodes textscript;

	// ///////////////////////////////////////////////////////////////////////////////
	// VALUE MEMBER
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * Raw Format: Variable-length text, suggested maximum 20 characters
	 * <p>
	 * (type: dt.NonEmptyString)
	 */
	public String value;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public PartNumber()
	{}

	public PartNumber(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
		textscript = TextScriptCodes.byCode(JPU.getAttribute(element, "textscript"));

		value = JPU.getContentAsString(element);
	}
}
