package com.redhat.training.example.javaserverhost.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.net.InetAddress;

@Path("/")
public class ServerHostEndPoint {

  @GET
  @Produces("text/plain")
  public Response doGet() {
    String host = "";
    try {
      host = InetAddress.getLocalHost().getHostName();
    }
    catch (Exception e) {
       e.printStackTrace();
    }
<<<<<<< HEAD
    String msg = "I am running on server "+host+" Version 51.0 \n";
=======
    String msg = "I am running on server "+host+" Version 2.5  \n";
>>>>>>> 700e6c6e33de7dbad7f5e6d2f0469c00b3c5fcfc
    return Response.ok(msg).build();
  }
}

