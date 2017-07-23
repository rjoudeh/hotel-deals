package com.hotel.helper;

import java.net.URI;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Api client service class
 * 
 * @author rjoudeh
 *
 */
public abstract class ApiClientService {
	protected String hostName;
	protected String serviceName;
	protected Map<String, String> headers;

	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * @param hostName
	 *            the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName
	 *            the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the headers
	 */
	public Map<String, String> getHeaders() {
		return headers;
	}

	/**
	 * @param headers
	 *            the headers to set
	 */
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public ApiClientService(String hostName, String serviceName, Map<String, String> headers) {
		this.hostName = hostName;
		this.serviceName = serviceName;
		this.headers = headers;
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public String callApiService() throws Exception {
		RestTemplate restTemplate = new RestTemplate();

		ApiRequest request = buildRequest();
		ResponseEntity<String> response = null;
		switch (request.httpMethod) {
		case GET:
			response = restTemplate.exchange(request.getUri(), request.getHttpMethod(), request.getEntity(),
					String.class);
			break;
		case POST:
			response = restTemplate.exchange(getHttpUrl(), request.getHttpMethod(), request.getEntity(), String.class);
			break;
		default:
			break;
		}

		return response.getBody();
	}

	protected abstract ApiRequest buildRequest() throws Exception;

	/**
	 * 
	 * @return
	 */
	protected String getHttpUrl() {
		return hostName + "/" + serviceName;
	}

	/**
	 * 
	 * @return
	 */
	protected UriComponentsBuilder buildHttpUrl() {
		String url = getHttpUrl();
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
		return builder;
	}

	/**
	 * 
	 * @return
	 */
	protected HttpHeaders buildHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		if (this.getHeaders() != null) {
			for (Entry<String, String> header : this.getHeaders().entrySet()) {
				headers.set(header.getKey(), header.getValue());
			}
		}

		return headers;
	}

	enum ApiHttpMethod {
		GET, POST;
	}

	enum ApiResponseType {
		JSON, XML;
	}

	class ApiRequest {
		private HttpEntity<?> entity;
		private HttpMethod httpMethod;
		private URI uri;
		/**
		 * @return the entity
		 */
		public HttpEntity<?> getEntity() {
			return entity;
		}
		/**
		 * @param entity the entity to set
		 */
		public void setEntity(HttpEntity<?> entity) {
			this.entity = entity;
		}
		/**
		 * @return the httpMethod
		 */
		public HttpMethod getHttpMethod() {
			return httpMethod;
		}
		/**
		 * @param httpMethod the httpMethod to set
		 */
		public void setHttpMethod(HttpMethod httpMethod) {
			this.httpMethod = httpMethod;
		}
		/**
		 * @return the uri
		 */
		public URI getUri() {
			return uri;
		}
		/**
		 * @param uri the uri to set
		 */
		public void setUri(URI uri) {
			this.uri = uri;
		}
		
		
	}
}
