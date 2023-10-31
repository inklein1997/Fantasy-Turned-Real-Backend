package com.company.fantasyturnedreal.repository.season;

import com.company.fantasyturnedreal.model.season.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, Long> {

}