package com.youtube.javapuzzle.repository;
import com.youtube.javapuzzle.entity.Cab;
import common.dtos.enums.CommonStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CabRepository extends JpaRepository<Cab, UUID> {
    boolean existsByRegistrationNumberAndCabStatus(String registrationNumber, CommonStatus cabStatus);
}

