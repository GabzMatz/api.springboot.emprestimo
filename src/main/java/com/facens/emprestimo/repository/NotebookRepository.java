package com.facens.emprestimo.repository;

import com.facens.emprestimo.model.notebook.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotebookRepository  extends JpaRepository<Notebook, Long> {
}
