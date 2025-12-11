package br.com.five.seven.food.adapter.in.payload.combo;

import br.com.five.seven.food.adapter.in.payload.combo.item.ItemResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComboResponse {
    private Long id;
    private List<ItemResponse> items = new ArrayList<>();
}
