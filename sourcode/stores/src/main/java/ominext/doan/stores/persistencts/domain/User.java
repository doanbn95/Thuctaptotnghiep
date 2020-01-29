package ominext.doan.stores.persistencts.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private int role;
    @Column(name = "status")
    private int status;
    @Column(name = "create_day")
    private Date createDay;
    @Column(name = "create_person")
    private String createPerson;
    @Column(name = "deleted")
    private int deleted;
}
