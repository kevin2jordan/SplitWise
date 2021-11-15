package com.lld.model.expenses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ExpenseMetadata {

    private String name;
    private String imgUrl;
    private String notes;
}
