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

public class Series
{
	public static final String refname = "Series";
	public static final String shortname = "series";

	public List34 textformat;
	public List14 textcase;
	public List74 language;
	public List138 transliteration;
	public String datestamp; // DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public SeriesISSN seriesISSN; // Optional
	public PublisherSeriesCode publisherSeriesCode; // Optional
	public List<SeriesIdentifier> seriesIdentifiers; // ZeroOrMore
	public TitleOfSeries titleOfSeries; // Required
	public List<Title> titles; // ZeroOrMore
	public List<Contributor> contributors; // ZeroOrMore
	public NumberWithinSeries numberWithinSeries; // Optional
	public YearOfAnnual yearOfAnnual; // Optional

	public static Series fromDoc(org.w3c.dom.Element element)
	{
		final Series x = new Series();

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
				if (name.equalsIgnoreCase(SeriesISSN.refname) || name.equalsIgnoreCase(SeriesISSN.shortname))
					x.seriesISSN = SeriesISSN.fromDoc(element);
				else if (name.equalsIgnoreCase(PublisherSeriesCode.refname) || name.equalsIgnoreCase(PublisherSeriesCode.shortname))
					x.publisherSeriesCode = PublisherSeriesCode.fromDoc(element);
				else if (name.equalsIgnoreCase(SeriesIdentifier.refname) || name.equalsIgnoreCase(SeriesIdentifier.shortname))
					x.seriesIdentifiers = DU.addToList(x.seriesIdentifiers, SeriesIdentifier.fromDoc(element));
				else if (name.equalsIgnoreCase(TitleOfSeries.refname) || name.equalsIgnoreCase(TitleOfSeries.shortname))
					x.titleOfSeries = TitleOfSeries.fromDoc(element);
				else if (name.equalsIgnoreCase(Title.refname) || name.equalsIgnoreCase(Title.shortname))
					x.titles = DU.addToList(x.titles, Title.fromDoc(element));
				else if (name.equalsIgnoreCase(Contributor.refname) || name.equalsIgnoreCase(Contributor.shortname))
					x.contributors = DU.addToList(x.contributors, Contributor.fromDoc(element));
				else if (name.equalsIgnoreCase(NumberWithinSeries.refname) || name.equalsIgnoreCase(NumberWithinSeries.shortname))
					x.numberWithinSeries = NumberWithinSeries.fromDoc(element);
				else if (name.equalsIgnoreCase(YearOfAnnual.refname) || name.equalsIgnoreCase(YearOfAnnual.shortname))
					x.yearOfAnnual = YearOfAnnual.fromDoc(element);
			}
		});

		return x;
	}
}