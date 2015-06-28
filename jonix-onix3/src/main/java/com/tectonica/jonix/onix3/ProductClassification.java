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
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.ProductClassificationTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixProductClassification;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

@SuppressWarnings("serial")
public class ProductClassification implements OnixDataComposite, Serializable
{
	public static final String refname = "ProductClassification";
	public static final String shortname = "productclassification";

	public String datestamp; // dt.DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	/**
	 * (this field is required)
	 */
	public ProductClassificationType productClassificationType;

	/**
	 * (this field is required)
	 */
	public ProductClassificationCode productClassificationCode;

	/**
	 * (this field is optional)
	 */
	public Percent percent;

	public ProductClassification()
	{}

	public ProductClassification(org.w3c.dom.Element element)
	{
		this.datestamp = JPU.getAttribute(element, "datestamp");
		this.sourcetype = RecordSourceTypes.byValue(JPU.getAttribute(element, "sourcetype"));
		this.sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(ProductClassificationType.refname) || name.equals(ProductClassificationType.shortname))
					productClassificationType = new ProductClassificationType(element);
				else if (name.equals(ProductClassificationCode.refname)
						|| name.equals(ProductClassificationCode.shortname))
					productClassificationCode = new ProductClassificationCode(element);
				else if (name.equals(Percent.refname) || name.equals(Percent.shortname))
					percent = new Percent(element);
			}
		});
	}

	public ProductClassificationTypes getProductClassificationTypeValue()
	{
		return (productClassificationType == null) ? null : productClassificationType.value;
	}

	public String getProductClassificationCodeValue()
	{
		return (productClassificationCode == null) ? null : productClassificationCode.value;
	}

	public Double getPercentValue()
	{
		return (percent == null) ? null : percent.value;
	}

	public JonixProductClassification asJonixProductClassification()
	{
		JonixProductClassification x = new JonixProductClassification();
		x.productClassificationType = getProductClassificationTypeValue();
		x.percent = getPercentValue();
		x.productClassificationCode = getProductClassificationCodeValue();
		return x;
	}
}
