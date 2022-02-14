package com.example.testermatching.repository;

import com.example.testermatching.entity.TesterDevice;
import com.example.testermatching.entity.TesterDeviceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesterDeviceRepository extends JpaRepository<TesterDevice, TesterDeviceId> {
}