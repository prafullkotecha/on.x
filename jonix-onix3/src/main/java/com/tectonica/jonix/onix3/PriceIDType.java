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
import com.tectonica.jonix.codelist.PriceIdentifierTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Price identifier type code</h1>
 * <p>
 * An ONIX code identifying the scheme from which the identifier in the &lt;IDValue&gt; element is taken. Mandatory in
 * each occurrence of the &lt;PriceIdentifier&gt; composite, and non-repeating.
 * </p>
 * <p>
 * There is no particular public ‘standard’ for price identifiers, so at present only proprietary identifiers may be
 * specified.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Fixed-length text, two digits</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>List 217</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;PriceIDType&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;x506&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;x506&gt;01&lt;x506&gt; (Proprietary)</td>
 * </tr>
 * </table>
 */
public class PriceIDType implements OnixElement, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "PriceIDType";
	public static final String shortname = "x506";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	// ///////////////////////////////////////////////////////////////////////////////
	// VALUE MEMBER
	// ///////////////////////////////////////////////////////////////////////////////

	public PriceIdentifierTypes value;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public PriceIDType()
	{}

	public PriceIDType(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		value = PriceIdentifierTypes.byCode(JPU.getContentAsString(element));
	}
}
