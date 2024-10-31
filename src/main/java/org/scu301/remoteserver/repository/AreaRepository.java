package org.scu301.remoteserver.repository;

import org.scu301.remoteserver.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AreaRepository extends JpaRepository<Area, Integer> {
    boolean existsByAreaName(String name);
    List<Area> findAreasByHouseId(Integer houseId);
}
