package com.example.spaceship;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Path("/space")
public class SpaceShipResource {
    private static List<SpaceShip> ships = new ArrayList(List.of(new SpaceShip("Mike", 50)));

    @GET()
    @Path("/ship")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SpaceShip> ships(){
        return ships;
    }

    @POST
    @Path("/ship")
    public List<SpaceShip> ships(SpaceShip ship){
        ships.add(ship);
        return ships;
    }

    @DELETE
    @Path("/ship/{captain}")
    public List<SpaceShip> deleteships(@PathParam("captain") String captain){
        List<SpaceShip> collect = ships.stream().filter((s) -> s.getCaptain().equalsIgnoreCase(captain))
                .collect(Collectors.toList());
        ships.removeAll(collect);
        return ships;
    }

}
