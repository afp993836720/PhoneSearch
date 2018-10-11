package com.offcn.service;

import com.offcn.pojo.Mobile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author afp
 * @date 2018/10/11--20:59
 */
public interface MService {
    @GET
    @Path("/find/{number}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Mobile find(@PathParam("number") String number);
}
