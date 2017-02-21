package com.assl.rest.java.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.assl.rest.java.model.Student;

@Path("/jsonsample")
public class _SampleJsonApi {

  // Send JSON Object to client
  // HTTP header "Content-Type" needed
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Student sendJSON() {
    return new Student();
  }

  // Send JSON Object to client
  // (filled with information from client)
  @GET
  @Path("/id/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public Student sendJSONWithInfo(@PathParam("id") int id, @QueryParam("name") String name,
      @QueryParam("score") double score) {
    return new Student(name, id, score);
  }

  // Receive JSON Object from client
  // HTTP header "Accept" needed
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public String receiveJSON(Student student) {

    if (student == null) {
      return "Incomplete Information";
    }

    return "Student info received : " + student.getId() + ", " + student.getName() + ", " + student.getScore();
  }

  // Send JSON Object to client
  // (filled with information from form in client)
  // The form data has to come in "x-www-form-urlencoded" format
  @POST
  @Path("/formdata")
  public String sendJSONWithFormInfo(@FormParam("id") int id, @FormParam("name") String name,
      @FormParam("score") double score) {

    Student student = new Student(name, id, score);
    return "Student info received : " + student.getId() + ", " + student.getName() + ", " + student.getScore();
  }
}
