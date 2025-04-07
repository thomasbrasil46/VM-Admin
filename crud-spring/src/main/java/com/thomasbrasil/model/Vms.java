package main.java.com.thomasbrasil.model;

@Data
@Entity
public class Vms {
    
    @id
    @GeneratedValue(strategy = GenerationType.Auto)
    private Long id;

    @Column(name = "name", nullable = false)
    private String displayName;

    @Column(name = "name", nullable = false)
    private String cpu;

    private Integer memory;

    private String status;
}
