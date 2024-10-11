package com.facens.emprestimo.model.notebook;


import com.facens.emprestimo.model.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notebook")
public class Notebook {

    @Id
    @NotBlank
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patrimonio;
    private String serviceTag;
    @NotBlank
    private Status status = Status.DISPONIVEL;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


    @OneToOne(cascade = {CascadeType.PERSIST})
    private User users;

}
