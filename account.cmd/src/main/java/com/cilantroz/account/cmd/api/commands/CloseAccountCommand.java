package com.cilantroz.account.cmd.api.commands;

import com.cilantroz.cqrscore.commands.BaseCommand;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
