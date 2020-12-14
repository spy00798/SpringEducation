package com.kimjh.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(length = 40, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 12)
    private String phone;

    @Builder
    public User(String email, String name, String phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format(
                "User[user_id, email = '%s', name='%s', phone='%s']",
                this.user_id, this.email, this.name, this.phone

        );
    }
}
