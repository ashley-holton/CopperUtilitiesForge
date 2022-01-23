package dev.bmedina.rose;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("rose")
public class Rose {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "rose";

    public Rose() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.ITEMS.register(bus);

        ModLoadingContext.get().registerConfig(Type.COMMON, Config.R_CFG, "rose-common.toml");
        MinecraftForge.EVENT_BUS.register(this);
    }
}