package org.anupam.userService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import org.anupam.pojo.UserInfo;


@Path("userService")
public class UserService {
	
	UserInfo userInfo = new UserInfo("Anupam", "31");
	
	@GET
	@Path("getAge")
	public String getUserAge(){
		return this.userInfo.getAge();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UserInfo getUserInfo(){
		return userInfo;
	}

	
	@POST
	public String getName(){
		return "Welcome sir "+ this.userInfo.getName();
	}
	
	@GET
	@Path("verifyPassword/")
	public String verifyPassword(@Context UriInfo uriInfo){
		
		MultivaluedMap< String, String> parameters= uriInfo.getQueryParameters();
		String userName = parameters.getFirst("userName");
		String password =  parameters.getFirst("password");
		
		return "User "+ userName +" has password "+password +" And it is verified";
	}
}
