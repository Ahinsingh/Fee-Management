package com.feeprocess.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Payment {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Long studentId;
    private String paymentMode;
    private String transactionId;
    private String studentClass;
    private String courseCode;
    private long courseId;
    private double paidAmount;
    private double pendingAmount;
    private String status;
    private boolean isFullyPaid;
    @CreatedDate
    private LocalDateTime createdAt;
    
    

}
