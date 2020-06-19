package com.Prasenjit.Spring.Session6.Repositories;

import com.Prasenjit.Spring.Session6.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Integer>
{


}
