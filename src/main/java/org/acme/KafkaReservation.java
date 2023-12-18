package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.DTO.ReservationCreateDTO;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class KafkaReservation {

    @Incoming("reservation-topic")
    public void consumeJsonMessage(ReservationCreateDTO reservationCreateDTO) {
        System.out.println("Reservation created successfully!  \n" +  reservationCreateDTO);
    }
}
