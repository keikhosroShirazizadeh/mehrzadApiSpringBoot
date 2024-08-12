package org.reservation.mehrzadapi.repository;
import java.util.List;

import org.reservation.mehrzadapi.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer>{

    // public List<Project> findByList<Project> findByTitle(String title);
//    @Query(value="From Project p where p.title=?1")
//    public List<Project> findByTitle(String title);
    @Query(value="select * From Project p where p.title=:title",nativeQuery = true)
    public List<Project> findByTitle(@Param("title") String title);
}