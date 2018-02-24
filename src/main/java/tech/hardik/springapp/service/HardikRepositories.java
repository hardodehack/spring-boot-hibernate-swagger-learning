package tech.hardik.springapp.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import tech.hardik.springapp.entity.HardikEntity;

@Component
public interface HardikRepositories extends JpaRepository<HardikEntity, Integer> {

}
