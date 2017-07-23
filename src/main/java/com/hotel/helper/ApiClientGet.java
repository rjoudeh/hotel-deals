package com.hotel.helper;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * 
 * @author rania
 *
 */
public class ApiClientGet extends ApiClientService {

	private Map<String, String> params;

	public ApiClientGet(String hostName, String serviceName, Map<String, String> headers, Map<String, String> params) {
		super(hostName, serviceName, headers);
		this.setParams(params);
	}

	@Override
	protected ApiRequest buildRequest() throws Exception {
		ApiRequest request = new ApiRequest();

		// prepare params
		MultiValueMap<String, String> multiValueParams = new LinkedMultiValueMap<String, String>();
		if (getParams() != null)
			for (String key : getParams().keySet()) {
				multiValueParams.add(key, getParams().get(key));
			}

		UriComponentsBuilder builder = buildHttpUrl();
		builder.queryParams(multiValueParams);

		HttpEntity<?> entity = new HttpEntity<>(this.buildHttpHeaders());
		request.setHttpMethod(HttpMethod.GET);

		request.setUri(builder.build().toUri());
		request.setEntity(entity);

		return request;
	}

	/**
	 * @return the params
	 */
	public Map<String, String> getParams() {
		return params;
	}

	/**
	 * @param params
	 *            the params to set
	 */
	public void setParams(Map<String, String> params) {
		this.params = params;
	}

}
