package com.mandacarubroker.Users;

import com.mandacarubroker.domain.stock.RequestStockDTO;
import jakarta.persistence.*;
import lombok.*;


import java.util.Date;

@Table(name = "users")
@Entity(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private double balance;


    public Users(RequestUserDTO requestUserDTO) {
        this.username = requestUserDTO.username();
        this.password = requestUserDTO.password();
        this.email = requestUserDTO.email();
        this.firstName = requestUserDTO.firstName();
        this.lastName = requestUserDTO.lastName();
        this.birthDate = requestUserDTO.birthDate();
        this.balance = requestUserDTO.balance();
    }

}
