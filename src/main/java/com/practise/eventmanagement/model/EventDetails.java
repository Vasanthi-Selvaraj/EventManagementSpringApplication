    package com.practise.eventmanagement.model;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
    public class EventDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventID;

    private String eventName;

    private LocalDate eventDate;

    private Integer ticketPrice;

}
