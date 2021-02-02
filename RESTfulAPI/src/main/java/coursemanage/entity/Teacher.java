package coursemanage.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "teachers")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Teacher extends User{
    private String phone;

    private String experiences;
}
