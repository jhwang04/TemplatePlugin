package com.justinhwang.templateplugin;

import com.justinhwang.templateplugin.commands.TemplatePluginCommand;
import com.justinhwang.templateplugin.events.TemplatePluginEvent;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class TemplatePlugin extends JavaPlugin {

    public boolean isEnabled = true;
    public FileConfiguration config;

    @Override
    public void onEnable() {
        isEnabled = true;

        this.saveDefaultConfig();

        config = this.getConfig();

        getCommand("templateplugin").setExecutor(new TemplatePluginCommand(this));

        getServer().getPluginManager().registerEvents(new TemplatePluginEvent(this), this);

        getLogger().info(ChatColor.GREEN + "templateplugin has been enabled");
    }

}
