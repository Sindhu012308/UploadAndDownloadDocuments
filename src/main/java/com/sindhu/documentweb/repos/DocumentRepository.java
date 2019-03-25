package com.sindhu.documentweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sindhu.documentweb.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
