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
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 9</b>
 * <p>
 * Description: Product classification type code
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">ONIX Codelists</a>
 */
public enum ProductClassificationTypes
{
	/**
	 * World Customs Organization Harmonized Commodity Coding and Description System.
	 */
	WCO_Harmonized_System("01"), //

	/**
	 * UN Standard Product and Service Classification.
	 */
	UNSPSC("02"), //

	/**
	 * UK Revenue and Customs classifications, based on the Harmonized System.
	 */
	HMRC("03"), //

	/**
	 * German export trade classification, based on the Harmonised System.
	 */
	Warenverzeichnis_f_r_die_Au_enhandelsstatistik("04"), //

	/**
	 * EU TARIC codes, an extended version of the Harmonized System.
	 */
	TARIC("05"), //

	/**
	 * Centraal Boekhuis free classification field for publishers.
	 */
	Fondsgroep("06"), //

	/**
	 * A product category (not a subject classification) assigned by the sender.
	 */
	Sender_s_product_category("07"), //

	/**
	 * Product classification maintained by the Chinese General Administration of Press and Publication
	 * (http://www.gapp.gov.cn).
	 */
	GAPP_Product_Class("08"), //

	/**
	 * Statistical Classification of Products by Activity in the European Economic Community, see
	 * http://ec.europa.eu/eurostat/ramon/nomenclatures/index.cfm?TargetUrl=LST_NOM_DTL&amp;StrNom=CPA_2008. Up to six
	 * digits, with one or two periods. For example, printed children&#8217;s books are &#8220;58.11.13&#8221;, but the
	 * periods are normally ommited in ONIX.
	 */
	CPA("09"), //

	/**
	 * Mercosur/Mercosul Common Nomenclature, based on the Harmonised System.
	 */
	NCM("10"), //

	/**
	 * Typologie de march&#233; g&#233;r&#233; par Electre (Market segment code maintained by Electre).
	 */
	Electre_genre("50");

	public final String value;

	private ProductClassificationTypes(String value)
	{
		this.value = value;
	}

	private static Map<String, ProductClassificationTypes> map;

	private static Map<String, ProductClassificationTypes> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (ProductClassificationTypes e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static ProductClassificationTypes byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
