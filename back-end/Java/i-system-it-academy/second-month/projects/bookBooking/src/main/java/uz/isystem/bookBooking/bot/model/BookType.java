package uz.isystem.bookBooking.bot.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity(name = "book_type")
public class BookType {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private boolean status;

    @Column(name = "created_date")
    private Date created_date;

    @Column(name = "updated_date")
    private Date updated_date;

    @Column(name = "deleted_date")
    private Date deleted_date;
}
