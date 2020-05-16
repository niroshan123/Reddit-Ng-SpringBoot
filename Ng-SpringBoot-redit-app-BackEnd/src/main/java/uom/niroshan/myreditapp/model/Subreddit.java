package uom.niroshan.myreditapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.time.Instant;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Builder
@AllArgsConstructor

public class Subreddit {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @NotBlank(message = "Community Name is requered")
    private String name;
    @NotBlank(message = "Desription is required")
    private String description;
    @OneToMany(fetch = LAZY)
    private List<Post> post;
    private Instant createdDate;
    @ManyToOne(fetch = LAZY)
    private User user;









}
