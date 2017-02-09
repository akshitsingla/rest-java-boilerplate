package com.assl.rest.java.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/sample")
public class _SampleAPI {

  // request for text
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String plainTextApi() {
    return "Hello World!";
  }

  // request for XML
  @GET
  @Produces(MediaType.TEXT_XML)
  public String xmlApi() {
    String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + "<text>" + "<para>hello world</para>" + "</text>";
    return xml;
  }

  // request for html
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String htmlApi() {
    String html = "<html> " +
                      "<head><title>" + "Hello World" + "</title></head>" +
                      "<body><h1>" + "Welcome to the world or REST" + "</h1></body>" +
                  "</html>";
    return html;
  }

  // invoke specific method
  @GET
  @Path("/remotemethodapi")
  @Produces(MediaType.TEXT_PLAIN)
  public String remoteMethodGetApi() {
    return "remoteMethodGetApi() invoked";
  }

  // invoke specific method with params
  @GET
  @Path("/methodwithqueryparams")
  @Produces(MediaType.TEXT_PLAIN)
  public String methodWithQueryParams(@QueryParam("name") String name) {
    return "Hello " + name + "!";
  }

  // invoke POST method
  @POST
  @Path("/remotemethodapi")
  @Produces(MediaType.TEXT_PLAIN)
  public String remoteMethodPostApi() {
    return "remoteMethodPostApi() invoked";
  }
}
