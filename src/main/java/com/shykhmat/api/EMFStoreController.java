package com.shykhmat.api;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiResponseObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Api(name = "/emfstore", description = "Endpoints to work with the EMF Store server")
@Controller
@RequestMapping("/emfstore")
public class EMFStoreController {

	@ApiMethod(id = "", summary = "Endpoint to get EMF Store Server location")
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	@ApiResponseObject
	public String getEMFStoreLocation() {
		return "http://localhost:8080";
	}
}
	