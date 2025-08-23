package com.example.demo.domain.complaint.repository;

import com.example.demo.domain.complaint.entity.Complaint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("test")
@SpringBootTest
@Transactional
class ComplaintRepositoryTest {

    @Autowired
    ComplaintRepository complaintRepository;

    @DisplayName("complaint 데이터를 모두 조회합니다.")
    @Test
    void findAll() {
        // given
        Complaint complaint1 = new Complaint("제목", "내용");
        Complaint complaint2 = new Complaint("제목", "내용");
        complaintRepository.saveAll(List.of(complaint1, complaint2));

        // when
        List<Complaint> complaints = complaintRepository.findAll();

        // then
        assertThat(complaints).hasSize(2);
    }
}