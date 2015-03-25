package com.munchicken.multidonutsmod.help;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class RegisterHelper {

    public static void registerItem(Item item){

        GameRegistry.registerItem(item, Reference.MODID + "_" + item.getUnlocalizedName().substring(5));
    }
}
