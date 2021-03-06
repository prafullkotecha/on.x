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

package com.tectonica.jonix.basic;

import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.basic.BasicText;
import com.tectonica.jonix.basic.BasicTexts;
import com.tectonica.jonix.onix3.Product;
import com.tectonica.jonix.onix3.TextContent;

/**
 * ONIX3 concrete implementation for {@link BasicTexts}
 * 
 * @author Zach Melamed
 */
public class BasicTexts3 extends BasicTexts
{
	private static final long serialVersionUID = 1L;

	private transient final Product product;

	public BasicTexts3(Product product)
	{
		this.product = product;
	}

	@Override
	protected List<BasicText> initialize()
	{
		List<BasicText> list = new ArrayList<>();
		if (product.collateralDetail.textContents != null)
		{
			for (TextContent textContent : product.collateralDetail.textContents)
				list.add(new BasicText3(textContent));
		}
		return list;
	}
}
