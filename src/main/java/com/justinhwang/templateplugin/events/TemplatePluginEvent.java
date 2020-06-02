package com.justinhwang.templateplugin.events;

import com.justinhwang.templateplugin.TemplatePlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TemplatePluginEvent implements Listener {
    public TemplatePlugin plugin;

    public TemplatePluginEvent(TemplatePlugin plugin) {this.plugin = plugin;}
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        if(plugin.config.getBoolean("enabled") == true) {
            //do something
        }
    }
}
