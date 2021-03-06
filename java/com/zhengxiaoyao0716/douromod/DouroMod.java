package com.zhengxiaoyao0716.douromod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(
        modid = DouroMod.MODID,
        version = DouroMod.VERSION
)
public class DouroMod
{
    /**ModInfo*/
    public static final String MODID = "douromod";
    public static final String VERSION = "0.0.0";

    /**CreativeTabs*/
    public static CreativeTabs hiddenWeapons;   //暗器标签

    /**Block*/
    public static Block ironEssenceOre;         //铁母矿

    /**Item*/
    public static Item ironEssence;             //铁母
    public static Item sleeveBow;               //袖箭（发射器部分）

    /**Entity*/
    public static Entity blueShineGrass;        //蓝银草

    /**Proxy*/
    @SidedProxy(
            clientSide = "com.zhengxiaoyao0716.douromod.ClientProxy",
            serverSide = "com.zhengxiaoyao0716.douromod.CommonProxy"
    )
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    /**
     * 服务端开始中.
     * @param event Do stuff you need to do to set up the server. register commands, tweak the server.
     */
    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.registerCommend(event);
    }
}
