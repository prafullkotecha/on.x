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

package com.tectonica.jonix.onix2;

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.CountryCodes;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.PrizeOrAwardAchievements;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixPrize;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Prize or award composite</h1>
 * <p>
 * A repeatable group of data elements which together describe a prize or award won by the product.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;Prize&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;prize&gt;</td>
 * </tr>
 * </table>
 */
public class Prize implements OnixDataComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "Prize";
	public static final String shortname = "prize";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	public TextFormats textformat;

	public TextCaseFlags textcase;

	public LanguageCodes language;

	public TransliterationSchemes transliteration;

	/**
	 * (type: DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	// ///////////////////////////////////////////////////////////////////////////////
	// MEMBERS
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (this field is required)
	 */
	public PrizeName prizeName;

	/**
	 * (this field is optional)
	 */
	public PrizeYear prizeYear;

	/**
	 * (this field is optional)
	 */
	public PrizeCountry prizeCountry;

	/**
	 * (this field is optional)
	 */
	public PrizeCode prizeCode;

	/**
	 * (this field is optional)
	 */
	public PrizeJury prizeJury;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public Prize()
	{}

	public Prize(org.w3c.dom.Element element)
	{
		textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(PrizeName.refname) || name.equals(PrizeName.shortname))
					prizeName = new PrizeName(element);
				else if (name.equals(PrizeYear.refname) || name.equals(PrizeYear.shortname))
					prizeYear = new PrizeYear(element);
				else if (name.equals(PrizeCountry.refname) || name.equals(PrizeCountry.shortname))
					prizeCountry = new PrizeCountry(element);
				else if (name.equals(PrizeCode.refname) || name.equals(PrizeCode.shortname))
					prizeCode = new PrizeCode(element);
				else if (name.equals(PrizeJury.refname) || name.equals(PrizeJury.shortname))
					prizeJury = new PrizeJury(element);
			}
		});
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getPrizeNameValue()
	{
		return (prizeName == null) ? null : prizeName.value;
	}

	/**
	 * Raw Format: Four digits, YYYY
	 */
	public String getPrizeYearValue()
	{
		return (prizeYear == null) ? null : prizeYear.value;
	}

	public CountryCodes getPrizeCountryValue()
	{
		return (prizeCountry == null) ? null : prizeCountry.value;
	}

	public PrizeOrAwardAchievements getPrizeCodeValue()
	{
		return (prizeCode == null) ? null : prizeCode.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 500 characters (XHTML is enabled in this element - see
	 * ONIX for Books - Product Information Message - XML Message Specification, Section 7)
	 */
	public String getPrizeJuryValue()
	{
		return (prizeJury == null) ? null : prizeJury.value;
	}

	public JonixPrize asJonixPrize()
	{
		JonixPrize x = new JonixPrize();
		x.prizeCode = getPrizeCodeValue();
		x.prizeCountry = getPrizeCountryValue();
		x.prizeJurys = java.util.Arrays.asList(getPrizeJuryValue());
		x.prizeNames = java.util.Arrays.asList(getPrizeNameValue());
		x.prizeYear = getPrizeYearValue();
		return x;
	}
}
