package com.von.api.user;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Entity(name = "users")
public class User {

    @Id
    @Column(name = "userId",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;

    @Column
    private String username;
    @Column
    private String passwordConfirm;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private Long addressId;
    @Column
    private String job;
    @Column
    private double height;
    @Column
    private double weight;

    @Builder(builderMethodName = "builder")
    public User(String username, String password, String passwordConfirm, String name, String phone, String job, double height, double weight) {
        this.username = username;
        this.passwordConfirm = passwordConfirm;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}