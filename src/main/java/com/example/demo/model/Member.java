package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String membId;      // Unique member ID
    private String name;
    private String address;
    private String membType;    // e.g., "Premium", "Regular"
    private LocalDate membDate;
    private LocalDate expiryDate;

    public Member() {}

    public Member(String membId, String name, String address, String membType, LocalDate membDate, LocalDate expiryDate) {
        this.membId = membId;
        this.name = name;
        this.address = address;
        this.membType = membType;
        this.membDate = membDate;
        this.expiryDate = expiryDate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMembId() { return membId; }
    public void setMembId(String membId) { this.membId = membId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getMembType() { return membType; }
    public void setMembType(String membType) { this.membType = membType; }

    public LocalDate getMembDate() { return membDate; }
    public void setMembDate(LocalDate membDate) { this.membDate = membDate; }

    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }
}
