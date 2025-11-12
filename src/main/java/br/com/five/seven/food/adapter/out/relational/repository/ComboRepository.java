package br.com.five.seven.food.adapter.out.relational.repository;

import br.com.five.seven.food.adapter.out.relational.entity.ComboEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComboRepository extends JpaRepository<ComboEntity, Long> {
}

