package io.ReportarEnLinea.client.api;

import io.ReportarEnLinea.client.ApiClient;
import io.ReportarEnLinea.client.ApiException;
import io.ReportarEnLinea.client.ApiResponse;
import io.ReportarEnLinea.client.Configuration;
import io.ReportarEnLinea.client.Pair;
import io.ReportarEnLinea.client.ProgressRequestBody;
import io.ReportarEnLinea.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.ReportarEnLinea.client.model.CargasPFRegistrarRequest;
import io.ReportarEnLinea.client.model.CargasResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CargaDeCuentasDePersonasFsicasApi {
	private ApiClient apiClient;

	public CargaDeCuentasDePersonasFsicasApi() {
		this(Configuration.getDefaultApiClient());
	}

	public CargaDeCuentasDePersonasFsicasApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public okhttp3.Call registrarCall(String xApiKey, String username, String password,
			CargasPFRegistrarRequest request, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = request;
		String localVarPath = "/";
		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		if (xApiKey != null)
			localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
		if (username != null)
			localVarHeaderParams.put("username", apiClient.parameterToString(username));
		if (password != null)
			localVarHeaderParams.put("password", apiClient.parameterToString(password));
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = { "application/json" };
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);
		final String[] localVarContentTypes = { "application/json" };
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);
		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
				@Override
				public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
					okhttp3.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	private okhttp3.Call registrarValidateBeforeCall(String xApiKey, String username, String password,
			CargasPFRegistrarRequest request, final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		if (xApiKey == null) {
			throw new ApiException("Missing the required parameter 'xApiKey' when calling registrar(Async)");
		}
		if (username == null) {
			throw new ApiException("Missing the required parameter 'username' when calling registrar(Async)");
		}
		if (password == null) {
			throw new ApiException("Missing the required parameter 'password' when calling registrar(Async)");
		}
		if (request == null) {
			throw new ApiException("Missing the required parameter 'request' when calling registrar(Async)");
		}

		okhttp3.Call call = registrarCall(xApiKey, username, password, request, progressListener,
				progressRequestListener);
		return call;
	}

	public CargasResponse registrar(String xApiKey, String username, String password, CargasPFRegistrarRequest request)
			throws ApiException {
		ApiResponse<CargasResponse> resp = registrarWithHttpInfo(xApiKey, username, password, request);
		return resp.getData();
	}

	public ApiResponse<CargasResponse> registrarWithHttpInfo(String xApiKey, String username, String password,
			CargasPFRegistrarRequest request) throws ApiException {
		okhttp3.Call call = registrarValidateBeforeCall(xApiKey, username, password, request, null, null);
		Type localVarReturnType = new TypeToken<CargasResponse>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}
}
