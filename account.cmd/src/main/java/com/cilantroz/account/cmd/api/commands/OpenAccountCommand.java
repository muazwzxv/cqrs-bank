package com.cilantroz.account.cmd.api.commands;

import com.cilantroz.account.common.dto.AccountType;
import com.cilantroz.cqrscore.commands.BaseCommand;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
