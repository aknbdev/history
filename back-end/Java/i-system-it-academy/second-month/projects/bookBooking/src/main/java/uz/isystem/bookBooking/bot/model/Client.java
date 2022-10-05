package uz.isystem.bookBooking.bot.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity(name = "client")
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @ManyToOne()
    @JoinColumn(name = "user_location_id", updatable = false, insertable = false)
    private ClientLocation userLocation;

    @Column(name = "user_location_id")
    private Long userLocationId;

    @Column(name = "status")
    private boolean status;

    @Column(name = "created_date")
    private Date created_date;

    @Column(name = "updated_date")
    private Date updated_date;

    @Column(name = "deleted_date")
    private Date deleted_date;
}
