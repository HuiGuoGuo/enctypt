package com.encryption.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JqGrid {

	@RequestMapping(value = { "/jqGrid" }, method = { RequestMethod.GET })
	public String jqGrid() {
		return "jqgrid";
	}

	@RequestMapping(value = { "/getData" }, method = { RequestMethod.POST })
	public @ResponseBody String data() {
		String xml = "<?xml version='1.0' encoding='utf-8'?>" + "<rows>" + "  <page>1</page>" + "  <total>2</total>"
				+ "  <records>13</records>" + "  <userdata name='tamount'>3820.00</userdata>"
				+ "  <userdata name='ttax'>462.00</userdata>" + "  <userdata name='ttotal'>4284.00</userdata>"
				+ "  <row id='13'>" + "    <cell>13</cell>" + "    <cell>2007-10-06</cell>"
				+ "    <cell><![CDATA[Client 3]]>" + "    </cell><cell>1000.00</cell>" + "    <cell>0.00</cell>"
				+ "    <cell>1000.00</cell>" + "    <cell><![CDATA[]]></cell>" + "  </row>" + "  <row id='12'>"
				+ "    <cell>12</cell>" + "    <cell>2007-10-06</cell>" + "    <cell><![CDATA[Client 2]]></cell>"
				+ "    <cell>700.00</cell>" + "    <cell>140.00</cell>" + "    <cell>840.00</cell>"
				+ "    <cell><![CDATA[]]></cell>" + "  </row>" + "  <row id='11'>" + "    <cell>11</cell>"
				+ "    <cell>2007-10-06</cell>" + "    <cell><![CDATA[Client 1]]></cell>" + "    <cell>600.00</cell>"
				+ "    <cell>120.00</cell>" + "    <cell>720.00</cell>" + "    <cell><![CDATA[]]></cell>" + "  </row>"
				+ "  <row id='10'>" + "    <cell>10</cell>" + "    <cell>2007-10-06</cell>"
				+ "    <cell><![CDATA[Client 2]]></cell>" + "    <cell>100.00</cell>" + "    <cell>20.00</cell>"
				+ "    <cell>120.00</cell>" + "    <cell><![CDATA[]]></cell>" + "  </row>" + "  <row id='9'>"
				+ "    <cell>9</cell>" + "    <cell>2007-10-06</cell>" + "    <cell><![CDATA[Client 1]]></cell>"
				+ "    <cell>200.00</cell>" + "    <cell>40.00</cell>" + "    <cell>240.00</cell>"
				+ "    <cell><![CDATA[]]></cell>" + "  </row>" + "  <row id='8'>" + "    <cell>8</cell>"
				+ "    <cell>2007-10-06</cell>" + "    <cell><![CDATA[Client 3]]></cell>" + "    <cell>200.00</cell>"
				+ "    <cell>0.00</cell>" + "    <cell>200.00</cell>" + "    <cell><![CDATA[]]></cell>" + "  </row>"
				+ "  <row id='7'>" + "    <cell>7</cell>" + "    <cell>2007-10-05</cell>"
				+ "    <cell><![CDATA[Client 2]]></cell>" + "    <cell>120.00</cell>" + "    <cell>12.00</cell>"
				+ "    <cell>134.00</cell>" + "    <cell><![CDATA[]]></cell>" + "  </row>" + "  <row id='6'>"
				+ "    <cell>6</cell>" + "    <cell>2007-10-05</cell>" + "    <cell><![CDATA[Client 1]]></cell>"
				+ "    <cell>50.00</cell>" + "    <cell>10.00</cell>" + "    <cell>60.00</cell>"
				+ "    <cell><![CDATA[]]></cell>" + "  </row>" + "  <row id='5'>" + "    <cell>5</cell>"
				+ "    <cell>2007-10-05</cell>" + "    <cell><![CDATA[Client 3]]></cell>" + "    <cell>100.00</cell>"
				+ "    <cell>0.00</cell>" + "    <cell>100.00</cell>" + "    <cell><![CDATA[no tax at all]]></cell>"
				+ "  </row>" + "  <row id='4'>" + "    <cell>4</cell>" + "    <cell>2007-10-04</cell>"
				+ "    <cell><![CDATA[Client 3]]></cell>" + "    <cell>150.00</cell>" + "    <cell>0.00</cell>"
				+ "    <cell>150.00</cell>" + "    <cell><![CDATA[no tax]]></cell>" + "  </row>" + "</rows>";
		return xml;
	}

}
