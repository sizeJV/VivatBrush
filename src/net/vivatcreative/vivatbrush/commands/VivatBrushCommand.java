package net.vivatcreative.vivatbrush.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class VivatBrushCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        private Fawe


        if(!(commandSender instanceof Player)) {
            return false;
        }

        switch (strings[0]) {
            case "save":

                return true;
            case "load":

                return true;
        }
        return false;
    }
}
