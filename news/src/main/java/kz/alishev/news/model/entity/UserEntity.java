package kz.alishev.news.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "iin")
    private String iin;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "isactive")
    private Boolean isActive = true;
}
