package com.example.demo.domain.complaint.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, unique = true, nullable = false)
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    private String complaintNo;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "text")
    private String content;

    public Complaint(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
