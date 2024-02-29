package com.example.adp.Repository;

import com.example.adp.Model.BookEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookEventRepository extends JpaRepository<BookEvent, Long> {
}
