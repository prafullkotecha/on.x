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
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 158</b>
 * <p>
 * Description: Resource content type
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">ONIX Codelists</a>
 */
public enum ResourceContentTypes
{
	/**
	 * 2D
	 */
	Front_cover("01"), //

	/**
	 * 2D
	 */
	Back_cover("02"), //

	/**
	 * Not limited to front or back, including 3D perspective.
	 */
	Cover_pack("03"), //

	/**
	 * Photograph or portrait of contributor(s).
	 */
	Contributor_picture("04"), //

	Series_image_artwork("05"), //

	Series_logo("06"), //

	Product_image_artwork("07"), //

	Product_logo("08"), //

	Publisher_logo("09"), //

	Imprint_logo("10"), //

	Contributor_interview("11"), //

	/**
	 * Contributor presentation and/or commentary.
	 */
	Contributor_presentation("12"), //

	Contributor_reading("13"), //

	/**
	 * Link to a schedule in iCalendar format.
	 */
	Contributor_event_schedule("14"), //

	/**
	 * For example: sample chapter text, page images, screenshots.
	 */
	Sample_content("15"), //

	/**
	 * A &#8216;look inside&#8217; feature presented as a small embeddable application.
	 */
	Widget("16"), //

	/**
	 * Review text held in a separate downloadable file, not in the ONIX record. Equivalent of code 06 in List 153. Use
	 * the &lt;TextContent&gt; composite for review quotes carried in the ONIX record. Use the &lt;CitedContent&gt;
	 * composite for a third-party review which is referenced from the ONIX record. Use &lt;SupportingResource&gt; for
	 * review text offered as a separate file resource for reproduction as part of promotional material for the product.
	 */
	Review("17"), //

	Other_commentary_discussion("18"), //

	Reading_group_guide("19"), //

	Teacher_s_guide("20"), //

	/**
	 * Feature article provided by publisher.
	 */
	Feature_article("21"), //

	/**
	 * Fictional character &#8216;interview&#8217;.
	 */
	Character_interview_("22"), //

	Wallpaper_screensaver("23"), //

	Press_release("24"), //

	/**
	 * A table of contents held in a separate downloadable file, not in the ONIX record. Equivalent of code 04 in List
	 * 153. Use the &lt;TextContent&gt; composite for a table of contents carried in the ONIX record. Use &lt;Supporting
	 * Resource&gt; for text offered as a separate file resource.
	 */
	Table_of_contents("25"), //

	/**
	 * A promotional video, similar to a movie trailer (sometimes referred to as a &#8216;book trailer&#8217;).
	 */
	Trailer("26"), //

	/**
	 * Intended ONLY for transitional use, where ONIX 2.1 records referencing existing thumbnail assets of unknown pixel
	 * size are being re-expressed in ONIX 3.0. Use code 01 for all new cover assets, and where the pixel size of older
	 * assets is known.
	 */
	Cover_thumbnail("27"), //

	/**
	 * The full content of the product (or the product itself), supplied for example to support full-text search or
	 * indexing.
	 */
	Full_content("28"), //

	/**
	 * Includes cover, back cover, spine and &#8211; where appropriate &#8211; any flaps.
	 */
	Full_cover("29"), //

	Master_brand_logo("30"), //

	/**
	 * Descriptive text in a separate downloadable file, not in the ONIX record. Equivalent of code 03 in List 153. Use
	 * the &lt;TextContent&gt; composite for descriptions carried in the ONIX record. Use &lt;Supporting Resource&gt;
	 * for text offered as a separate file resource for reproduction as part of promotional material for the product.
	 */
	Description("31"), //

	/**
	 * Index text held in a separate downloadable file, not in the ONIX record. Equivalent of code 15 in List 153. Use
	 * the &lt;TextContent&gt; composite for index text carried in the ONIX record. Use &lt;Supporting Resource&gt; for
	 * an index offered as a separate file resource.
	 */
	Index("32"), //

	/**
	 * Link to a license covering permitted usage of the product content. Deprecated in favor of &lt;EpubLicense&gt;.
	 * This was a temporary workaround in ONIX 3.0, and use of &lt;EpubLicense&gt; is strongly preferred.
	 */
	License("99");

	public final String value;

	private ResourceContentTypes(String value)
	{
		this.value = value;
	}

	private static Map<String, ResourceContentTypes> map;

	private static Map<String, ResourceContentTypes> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (ResourceContentTypes e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static ResourceContentTypes byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
