package com.digitalspace.loginauthapi.domain.medicalrecord;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "activity_histories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActivityHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "medical_record_id", referencedColumnName = "id")
    private MedicalRecord medicalRecord;

    private LocalDate date;
    private String activity;
    private String observations;
}
