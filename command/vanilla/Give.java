package org.diamondcore.command.vanilla;

import org.diamondcore.command.CommandExecutor;
import org.diamondcore.command.CommandSender;

public class Give implements CommandExecutor {

    public String getCommand() {
        return "give";
    }
    @Override
    public boolean onCommand(CommandSender sender, String label, String[] args) {
        if(args.length < 2) {
            return "commands.give.usage";
        } else if(args.length == 2){
            String func = args[0];
            String id = args[1];
            String result = null;
        }


    }
}
