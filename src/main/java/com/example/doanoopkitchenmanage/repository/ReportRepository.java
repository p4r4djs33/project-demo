package com.example.doanoopkitchenmanage.repository;

import com.example.doanoopkitchenmanage.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report,Long> {
}
