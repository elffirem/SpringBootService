package com.bites.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "properties")
@Getter
@Setter
public class AppInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "version")
    private int version;

    @Column(name = "app_name")
    private String appName;

    @Column(name = "background_color")
    private String backgroundColor;
}
