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

package com.tectonica.jonix.onix3.model;

import java.util.List;

import com.tectonica.jonix.onix3.DU;
import com.tectonica.jonix.onix3.codelist.List3;

public class TextContent
{
	public static final String refname = "TextContent";
	public static final String shortname = "textcontent";

	public String datestamp; // dt.DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public TextType textType; // Required
	public List<ContentAudience> contentAudiences; // OneOrMore
	public List<Text> texts; // OneOrMore
	public List<TextAuthor> textAuthors; // ZeroOrMore
	public TextSourceCorporate textSourceCorporate; // Optional
	public List<SourceTitle> sourceTitles; // ZeroOrMore
	public List<ContentDate> contentDates; // ZeroOrMore

	public static TextContent fromDoc(org.w3c.dom.Element element)
	{
		final TextContent x = new TextContent();

		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = List3.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equalsIgnoreCase(TextType.refname) || name.equalsIgnoreCase(TextType.shortname))
					x.textType = TextType.fromDoc(element);
				else if (name.equalsIgnoreCase(ContentAudience.refname) || name.equalsIgnoreCase(ContentAudience.shortname))
					x.contentAudiences = DU.addToList(x.contentAudiences, ContentAudience.fromDoc(element));
				else if (name.equalsIgnoreCase(Text.refname) || name.equalsIgnoreCase(Text.shortname))
					x.texts = DU.addToList(x.texts, Text.fromDoc(element));
				else if (name.equalsIgnoreCase(TextAuthor.refname) || name.equalsIgnoreCase(TextAuthor.shortname))
					x.textAuthors = DU.addToList(x.textAuthors, TextAuthor.fromDoc(element));
				else if (name.equalsIgnoreCase(TextSourceCorporate.refname) || name.equalsIgnoreCase(TextSourceCorporate.shortname))
					x.textSourceCorporate = TextSourceCorporate.fromDoc(element);
				else if (name.equalsIgnoreCase(SourceTitle.refname) || name.equalsIgnoreCase(SourceTitle.shortname))
					x.sourceTitles = DU.addToList(x.sourceTitles, SourceTitle.fromDoc(element));
				else if (name.equalsIgnoreCase(ContentDate.refname) || name.equalsIgnoreCase(ContentDate.shortname))
					x.contentDates = DU.addToList(x.contentDates, ContentDate.fromDoc(element));
			}
		});

		return x;
	}
}