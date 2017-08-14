package com.munchicken.multidonutsmod.handlers;

import com.munchicken.multidonutsmod.items.ItemDonuts;
import com.munchicken.multidonutsmod.items.ModItems;
import com.munchicken.multidonutsmod.items.Strawberry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Munchicken on 8/13/2017.
 */
public class ModHooks {
    public static void grabHooks() {
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.strawberry),10);
    }
}
