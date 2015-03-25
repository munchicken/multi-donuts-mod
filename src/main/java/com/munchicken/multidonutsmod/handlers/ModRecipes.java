package com.munchicken.multidonutsmod.handlers;

import com.munchicken.multidonutsmod.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

    public static void addRecipes(){

        GameRegistry.addRecipe(new ItemStack(ModItems.donut), new Object[] {
                " W ",
                "X Z",
                " Y ",
                'W', Items.milk_bucket, 'X', Items.sugar, 'Y', Items.wheat, 'Z', Items.egg
        });
    }
}
