package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.helper.HotelDealsHelper;
import com.hotel.model.HotelDeals;
import com.hotel.model.HotelSearch;

/**
 * 
 * @author rania
 *
 */
@Controller
public class DealsController {

	@Autowired
	HotelDealsHelper hotelDealsHelper;

	@RequestMapping(value = "/seacrh-hotels")
	public String search(@ModelAttribute("hotelSearch") HotelSearch hotelSearch, Model model)
			throws Exception {

		if (hotelSearch == null)
			hotelSearch = new HotelSearch();

		HotelDeals deals = this.hotelDealsHelper.findHotelDeals(hotelSearch);
		model.addAttribute("deals", deals);
		model.addAttribute("hotelSearch", hotelSearch);
		return "home";
	}
}
