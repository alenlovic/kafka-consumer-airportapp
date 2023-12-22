package org.acme;

import io.quarkus.kafka.client.serialization.JsonbDeserializer;
import org.acme.DTO.ReservationCreateDTO;

public class ReservationDeserializer extends JsonbDeserializer<ReservationCreateDTO> {

    public ReservationDeserializer(){
        super(ReservationCreateDTO.class);
    }
}
