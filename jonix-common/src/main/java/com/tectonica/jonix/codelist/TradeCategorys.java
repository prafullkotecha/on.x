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
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 12</b>
 * <p>
 * Description: Trade category code
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">About ONIX Codelists</a>
 * @see <a
 *      href="http://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_32.html#codelist12">ONIX
 *      Codelist 12 in Reference Guide</a>
 */
public enum TradeCategorys
{
	/**
	 * An edition from a UK publisher sold only in territories where exclusive rights are not held. Rights details
	 * should be carried in PR.21 (ONIX 2.1) OR P.21 (ONIX 3.0) as usual
	 */
	UK_open_market_edition("01", "UK open market edition"), //

	/**
	 * In UK, an edition intended primarily for airside sales in UK airports, though it may be available for sale in
	 * other territories where exclusive rights are not held. Rights details should be carried in PR.21 (ONIX 2.1) OR
	 * P.21 (ONIX 3.0) as usual
	 */
	Airport_edition("02", "Airport edition"), //

	/**
	 * In Germany, a special printing sold at a lower price than the regular hardback
	 */
	Sonderausgabe("03", "Sonderausgabe"), //

	/**
	 * In countries where recognised as a distinct trade category, eg France &#8216;livre de poche&#8217;, Germany
	 * &#8216;Taschenbuch&#8217;, Italy &#8216;tascabile&#8217;, Spain &#8216;libro de bolsillo&#8217;
	 */
	Pocket_paperback("04", "Pocket paperback"), //

	/**
	 * Edition produced solely for sale in designated export markets
	 */
	International_edition_US("05", "International edition (US)"), //

	/**
	 * Audio product sold in special durable packaging and with a replacement guarantee for the contained cassettes or
	 * CDs for a specified shelf-life
	 */
	Library_audio_edition("06", "Library audio edition"), //

	/**
	 * An edition from a US publisher sold only in territories where exclusive rights are not held. Rights details
	 * should be carried in PR.21 (ONIX 2.1) OR P.21 (ONIX 3.0) as usual
	 */
	US_open_market_edition("07", "US open market edition"), //

	/**
	 * In France, a category of book that has a particular legal status, claimed by the publisher
	 */
	Livre_scolaire_d_clar_par_l_diteur("08", "Livre scolaire, déclaré par l’éditeur"), //

	/**
	 * In France, a category of book that has a particular legal status, designated independently of the publisher
	 */
	Livre_scolaire_non_sp_cifi_("09", "Livre scolaire (non spécifié)"), //

	/**
	 * Edition published for sale only with a newspaper or periodical
	 */
	Supplement_to_newspaper("10", "Supplement to newspaper"), //

	/**
	 * In Spain, a school textbook for which there is no fixed or suggested retail price and which is supplied by the
	 * publisher on terms individually agreed with the bookseller
	 */
	Precio_libre_textbook("11", "Precio libre textbook"), //

	/**
	 * For editions sold only through newsstands/newsagents
	 */
	News_outlet_edition("12", "News outlet edition"), //

	/**
	 * In the US and Canada, a book that is published primarily for use by students in school or college education as a
	 * basis for study. Textbooks published for the elementary and secondary school markets are generally purchased by
	 * school districts for the use of students. Textbooks published for the higher education market are generally
	 * adopted for use in particular classes by the instructors of those classes. Textbooks are usually not marketed to
	 * the general public, which distinguishes them from trade books. Note that trade books adopted for course use are
	 * not considered to be textbooks (though a specific education edition of a trade title may be)
	 */
	US_textbook("13", "US textbook"), //

	/**
	 * &#8216;Short&#8217; e-book (sometimes also called a &#8216;single&#8217;), typically containing a single short
	 * story, an essay or piece of long-form journalism
	 */
	E_book_short("14", "E-book short");

	public final String value;
	public final String label;

	private TradeCategorys(String value, String label)
	{
		this.value = value;
		this.label = label;
	}

	private static Map<String, TradeCategorys> map;

	private static Map<String, TradeCategorys> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (TradeCategorys e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static TradeCategorys byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
