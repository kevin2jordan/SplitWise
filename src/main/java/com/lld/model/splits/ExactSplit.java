package com.lld.model.splits;

import com.lld.model.users.User;

public class ExactSplit extends Split{
    public ExactSplit(User user, double amount) {

        super(user);
        this.amount = amount;
    }
}
