The intercepting filter design pattern is used when we want to do some
**pre-processing / post-processing** with request or response of the
application. Filters are defined and applied on the request before
passing the request to actual target application. Filters can do the
authorization/ logging or tracking of request and then
pass the requests to corresponding handlers. Following are the entities
of this type of design pattern.