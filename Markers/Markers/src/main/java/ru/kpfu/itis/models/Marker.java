package ru.kpfu.itis.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Marker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;

    private Integer condition;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "auditorium_id")
    @ToString.Exclude
    private Auditorium auditorium;
}
