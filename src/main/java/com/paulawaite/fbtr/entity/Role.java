package com.paulawaite.fbtr.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@EqualsAndHashCode
@ToString
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "roleId", nullable = false)
    @Getter @Setter private int roleId;

    @Getter @Setter private String role;
    @Getter @Setter private Timestamp updateDate;
    @Getter @Setter private Timestamp createDate;

    @ManyToOne
    @JoinColumn(name="userName", referencedColumnName = "username", nullable = false)    // referenceColumnName if not primary key
    @Getter @Setter private User user;

}
