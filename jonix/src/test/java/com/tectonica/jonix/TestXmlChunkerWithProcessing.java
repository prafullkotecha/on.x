package com.tectonica.jonix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Element;

import com.tectonica.jonix.onix2.codelist.List15;
import com.tectonica.jonix.onix2.model.Product;
import com.tectonica.jonix.onix2.model.Title;
import com.tectonica.xmlchunk.XmlChunker;

public class TestXmlChunkerWithProcessing
{
	@Before
	public void setUp() throws Exception
	{}

	@After
	public void tearDown() throws Exception
	{}

	@Test
	@Ignore
	public void test() throws FileNotFoundException
	{
		final File file = new File("../onix_samples/SB_Ref.xml"); // SB_short.xml
		if (!file.exists())
			throw new RuntimeException("couldn't found " + file.getAbsolutePath());

		XmlChunker.parse(new FileInputStream(file), 2, new XmlChunker.Listener()
		{
			@Override
			public void onTarget(Element element)
			{
				final String nodeName = element.getNodeName();
				if (nodeName.equals(Product.refname) || nodeName.equals(Product.shortname))
				{
					final Product product = Product.fromDoc(element);
					if (product.titles != null)
					{
						final Title title = findTitle(product.titles, List15.Distinctive_title_book);
						if (title != null && title.titleText != null)
							System.out.println(title.titleText.value);
						else
							System.err.println("NO-TITLE");
					}
				}
			}

			@Override
			public void onPreTargetStart(int depth, StartElement element)
			{
				final Attribute release = element.getAttributeByName(new QName("release"));
				boolean isOnix2 = (release == null || release.getValue().startsWith("2"));
				if (!isOnix2)
					throw new RuntimeException("this test is suitable for Onix2 only at this time");
			}
		});

		System.err.println("** DONE");
	}

	private static Title findTitle(List<Title> titles, List15 requestedType)
	{
		for (Title title : titles)
		{
			if (title.titleType != null && title.titleType.value == requestedType)
				return title;
		}
		return null;
	}

}
