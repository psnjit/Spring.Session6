package com.Prasenjit.Spring.Session6.Repositories;

import com.Prasenjit.Spring.Session6.Models.BookGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookGenreRepository extends JpaRepository<BookGenre, Integer>
{
}
