package InterceptingFilterPattern;

public class InterceptingFilterDemo {

	// The intercepting filter design pattern is used when we want to do some
	// pre-processing / post-processing with request or response of the
	// application. Filters are defined and applied on the request before
	// passing the request to actual target application. Filters can do the
	// authorization/ logging or tracking of request and then
	// pass the requests to corresponding handlers. Following are the entities
	// of this type of design pattern.

	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}
}
