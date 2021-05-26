package io.github.tinyking.scaffold;

import lombok.Data;

import javax.persistence.*;

/**
 * --
 *
 * @author Wang Jianchao(tinyking)
 * @since 2021/5/26
 */
@Data
@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
