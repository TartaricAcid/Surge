package net.epoxide.surge.features.hideplayers;

import net.epoxide.surge.command.SurgeCommand;
import net.minecraft.client.resources.I18n;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.text.TextComponentString;

public class CommandHide implements SurgeCommand {
    
    @Override
    public String getSubName () {
        
        return "hideplayers";
    }
    
    @Override
    public void execute (ICommandSender sender, String[] args) {
        
        FeatureHidePlayer.toggleHiding();
        sender.addChatMessage(new TextComponentString(I18n.format("message.surge.hideplayers." + FeatureHidePlayer.isHiding())));
    }
    
    @Override
    public String getUsage () {
        
        return "hideplayers";
    }
}