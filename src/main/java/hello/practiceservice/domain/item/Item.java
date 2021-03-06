package hello.practiceservice.domain.item;

import lombok.Data;

@Data
public class Item {

    //상품 도메인
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    //생성자
    public Item(){}

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
