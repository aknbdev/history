package uz.isystem.security.model;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity(name = "role")
public class Role {
    @Id
    @NotNull
    private String name;

}
