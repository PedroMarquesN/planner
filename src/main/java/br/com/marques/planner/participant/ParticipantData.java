package br.com.marques.planner.participant;

import java.util.UUID;

public record ParticipantData(UUID id, String email,String name, Boolean isConfirmed) {
}
