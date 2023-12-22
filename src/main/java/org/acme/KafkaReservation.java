package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.DTO.ReservationCreateDTO;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;

import java.util.concurrent.CompletionStage;

@ApplicationScoped
public class KafkaReservation {

    @Incoming("reservation-channel")
    public CompletionStage<Void> reservationConsumer(Message<ReservationCreateDTO> reservationCreateDTOMessage){
        ReservationCreateDTO reservationCreateDTO = reservationCreateDTOMessage.getPayload();
        System.out.println(reservationCreateDTO);

        return reservationCreateDTOMessage.ack();
    }
}
