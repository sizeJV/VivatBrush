package net.vivatcreative.vivatbrush.util;

import com.boydti.fawe.bukkit.listener.BrushListener;
import com.sk89q.worldedit.command.BrushCommands;
import com.sk89q.worldedit.command.BrushProcessor;
import com.sk89q.worldedit.command.tool.BrushHolder;
import com.sk89q.worldedit.command.tool.BrushTool;
import org.bukkit.inventory.ItemStack;


public class BrushManager {

    private BrushHolder brushHolder;


    public ItemStack getBrushTool() {
        return (ItemStack) brushHolder.getTool();
    }
}
