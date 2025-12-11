package br.com.five.seven.food.adapter.in.mappers.impl;

import br.com.five.seven.food.adapter.in.mappers.ComboMapper;
import br.com.five.seven.food.adapter.in.mappers.ItemMapper;
import br.com.five.seven.food.adapter.in.payload.combo.ComboRequest;
import br.com.five.seven.food.adapter.in.payload.combo.ComboResponse;
import br.com.five.seven.food.adapter.out.relational.entity.ComboEntity;
import br.com.five.seven.food.application.domain.Combo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ComboMapperImpl implements ComboMapper {

    private final ItemMapper itemMapper;

    @Override
    public Combo requestToDomain(ComboRequest comboRequest) {
        return new Combo(
                null,
                itemMapper.requestListToDomainList(comboRequest.getItems())
        );
    }

    @Override
    public ComboEntity domainToEntity(Combo combo) {
        return new ComboEntity(
                combo.getId(),
                itemMapper.domainListToEntityList(combo.getItems())
        );
    }

    @Override
    public Combo entityToDomain(ComboEntity combo) {
        return new Combo(
                combo.getId(),
                itemMapper.entityListToDomainList(combo.getItems())
        );
    }

    @Override
    public ComboResponse domainToResponse(Combo combo) {
        return new ComboResponse(
                combo.getId(),
                itemMapper.domainListToResponseList(combo.getItems())
        );
    }
}
