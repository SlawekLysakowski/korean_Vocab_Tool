package io.slaweksapp.korean_Vocab_Tool.dao;

import io.slaweksapp.korean_Vocab_Tool.model.Vocab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabDao extends JpaRepository<Vocab, Long> {


}
