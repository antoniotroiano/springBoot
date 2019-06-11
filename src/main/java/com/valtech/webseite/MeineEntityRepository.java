package com.valtech.webseite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeineEntityRepository extends JpaRepository<MeineEntity, Long> {
    public MeineEntity findByText(String text);
}
