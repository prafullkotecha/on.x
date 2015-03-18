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

package com.tectonica.jonix.onix2.model;

import java.util.List;

import com.tectonica.jonix.onix2.DU;
import com.tectonica.jonix.onix2.codelist.List138;
import com.tectonica.jonix.onix2.codelist.List14;
import com.tectonica.jonix.onix2.codelist.List3;
import com.tectonica.jonix.onix2.codelist.List34;
import com.tectonica.jonix.onix2.codelist.List74;

public class Price
{
	public static final String refname = "Price";
	public static final String shortname = "price";

	public List34 textformat;
	public List14 textcase;
	public List74 language;
	public List138 transliteration;
	public String datestamp; // DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public PriceTypeCode priceTypeCode; // Optional
	public PriceQualifier priceQualifier; // Optional
	public PriceTypeDescription priceTypeDescription; // Optional
	public PricePer pricePer; // Optional
	public MinimumOrderQuantity minimumOrderQuantity; // Optional
	public List<BatchBonus> batchBonuss; // ZeroOrMore
	public ClassOfTrade classOfTrade; // Optional
	public BICDiscountGroupCode bicDiscountGroupCode; // Optional
	public List<DiscountCoded> discountCodeds; // ZeroOrMore
	public DiscountPercent discountPercent; // Optional
	public PriceStatus priceStatus; // Optional
	public PriceAmount priceAmount; // Required
	public CurrencyCode currencyCode; // Optional
	public List<CountryCode> countryCodes; // OneOrMore
	public Territory territory; // Optional
	public CountryExcluded countryExcluded; // Optional
	public TerritoryExcluded territoryExcluded; // Optional
	public TaxRateCode1 taxRateCode1; // Optional
	public TaxRatePercent1 taxRatePercent1; // Optional
	public TaxableAmount1 taxableAmount1; // Optional
	public TaxAmount1 taxAmount1; // Optional
	public TaxRateCode2 taxRateCode2; // Optional
	public TaxRatePercent2 taxRatePercent2; // Optional
	public TaxableAmount2 taxableAmount2; // Optional
	public TaxAmount2 taxAmount2; // Optional
	public PriceEffectiveFrom priceEffectiveFrom; // Optional
	public PriceEffectiveUntil priceEffectiveUntil; // Optional

	public static Price fromDoc(org.w3c.dom.Element element)
	{
		final Price x = new Price();

		x.textformat = List34.byValue(DU.getAttribute(element, "textformat"));
		x.textcase = List14.byValue(DU.getAttribute(element, "textcase"));
		x.language = List74.byValue(DU.getAttribute(element, "language"));
		x.transliteration = List138.byValue(DU.getAttribute(element, "transliteration"));
		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = List3.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equalsIgnoreCase(PriceTypeCode.refname) || name.equalsIgnoreCase(PriceTypeCode.shortname))
					x.priceTypeCode = PriceTypeCode.fromDoc(element);
				else if (name.equalsIgnoreCase(PriceQualifier.refname) || name.equalsIgnoreCase(PriceQualifier.shortname))
					x.priceQualifier = PriceQualifier.fromDoc(element);
				else if (name.equalsIgnoreCase(PriceTypeDescription.refname) || name.equalsIgnoreCase(PriceTypeDescription.shortname))
					x.priceTypeDescription = PriceTypeDescription.fromDoc(element);
				else if (name.equalsIgnoreCase(PricePer.refname) || name.equalsIgnoreCase(PricePer.shortname))
					x.pricePer = PricePer.fromDoc(element);
				else if (name.equalsIgnoreCase(MinimumOrderQuantity.refname) || name.equalsIgnoreCase(MinimumOrderQuantity.shortname))
					x.minimumOrderQuantity = MinimumOrderQuantity.fromDoc(element);
				else if (name.equalsIgnoreCase(BatchBonus.refname) || name.equalsIgnoreCase(BatchBonus.shortname))
					x.batchBonuss = DU.addToList(x.batchBonuss, BatchBonus.fromDoc(element));
				else if (name.equalsIgnoreCase(ClassOfTrade.refname) || name.equalsIgnoreCase(ClassOfTrade.shortname))
					x.classOfTrade = ClassOfTrade.fromDoc(element);
				else if (name.equalsIgnoreCase(BICDiscountGroupCode.refname) || name.equalsIgnoreCase(BICDiscountGroupCode.shortname))
					x.bicDiscountGroupCode = BICDiscountGroupCode.fromDoc(element);
				else if (name.equalsIgnoreCase(DiscountCoded.refname) || name.equalsIgnoreCase(DiscountCoded.shortname))
					x.discountCodeds = DU.addToList(x.discountCodeds, DiscountCoded.fromDoc(element));
				else if (name.equalsIgnoreCase(DiscountPercent.refname) || name.equalsIgnoreCase(DiscountPercent.shortname))
					x.discountPercent = DiscountPercent.fromDoc(element);
				else if (name.equalsIgnoreCase(PriceStatus.refname) || name.equalsIgnoreCase(PriceStatus.shortname))
					x.priceStatus = PriceStatus.fromDoc(element);
				else if (name.equalsIgnoreCase(PriceAmount.refname) || name.equalsIgnoreCase(PriceAmount.shortname))
					x.priceAmount = PriceAmount.fromDoc(element);
				else if (name.equalsIgnoreCase(CurrencyCode.refname) || name.equalsIgnoreCase(CurrencyCode.shortname))
					x.currencyCode = CurrencyCode.fromDoc(element);
				else if (name.equalsIgnoreCase(CountryCode.refname) || name.equalsIgnoreCase(CountryCode.shortname))
					x.countryCodes = DU.addToList(x.countryCodes, CountryCode.fromDoc(element));
				else if (name.equalsIgnoreCase(Territory.refname) || name.equalsIgnoreCase(Territory.shortname))
					x.territory = Territory.fromDoc(element);
				else if (name.equalsIgnoreCase(CountryExcluded.refname) || name.equalsIgnoreCase(CountryExcluded.shortname))
					x.countryExcluded = CountryExcluded.fromDoc(element);
				else if (name.equalsIgnoreCase(TerritoryExcluded.refname) || name.equalsIgnoreCase(TerritoryExcluded.shortname))
					x.territoryExcluded = TerritoryExcluded.fromDoc(element);
				else if (name.equalsIgnoreCase(TaxRateCode1.refname) || name.equalsIgnoreCase(TaxRateCode1.shortname))
					x.taxRateCode1 = TaxRateCode1.fromDoc(element);
				else if (name.equalsIgnoreCase(TaxRatePercent1.refname) || name.equalsIgnoreCase(TaxRatePercent1.shortname))
					x.taxRatePercent1 = TaxRatePercent1.fromDoc(element);
				else if (name.equalsIgnoreCase(TaxableAmount1.refname) || name.equalsIgnoreCase(TaxableAmount1.shortname))
					x.taxableAmount1 = TaxableAmount1.fromDoc(element);
				else if (name.equalsIgnoreCase(TaxAmount1.refname) || name.equalsIgnoreCase(TaxAmount1.shortname))
					x.taxAmount1 = TaxAmount1.fromDoc(element);
				else if (name.equalsIgnoreCase(TaxRateCode2.refname) || name.equalsIgnoreCase(TaxRateCode2.shortname))
					x.taxRateCode2 = TaxRateCode2.fromDoc(element);
				else if (name.equalsIgnoreCase(TaxRatePercent2.refname) || name.equalsIgnoreCase(TaxRatePercent2.shortname))
					x.taxRatePercent2 = TaxRatePercent2.fromDoc(element);
				else if (name.equalsIgnoreCase(TaxableAmount2.refname) || name.equalsIgnoreCase(TaxableAmount2.shortname))
					x.taxableAmount2 = TaxableAmount2.fromDoc(element);
				else if (name.equalsIgnoreCase(TaxAmount2.refname) || name.equalsIgnoreCase(TaxAmount2.shortname))
					x.taxAmount2 = TaxAmount2.fromDoc(element);
				else if (name.equalsIgnoreCase(PriceEffectiveFrom.refname) || name.equalsIgnoreCase(PriceEffectiveFrom.shortname))
					x.priceEffectiveFrom = PriceEffectiveFrom.fromDoc(element);
				else if (name.equalsIgnoreCase(PriceEffectiveUntil.refname) || name.equalsIgnoreCase(PriceEffectiveUntil.shortname))
					x.priceEffectiveUntil = PriceEffectiveUntil.fromDoc(element);
			}
		});

		return x;
	}
}