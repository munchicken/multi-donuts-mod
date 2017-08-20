package com.munchicken.multidonutsmod.handlers;

import com.munchicken.multidonutsmod.items.ItemDonuts;
import com.munchicken.multidonutsmod.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

    public static void addRecipes(){

        GameRegistry.addRecipe(new ItemStack(ModItems.strawberryYellowBrownieDonut), new Object[] {
                " Y ",
                "X Z",
                " W ",
                'W', Items.milk_bucket, 'X', Items.sugar, 'Y', Items.wheat, 'Z', Items.egg
        });

        GameRegistry.addRecipe(new ItemStack(ModItems.dough), new Object[] {
                " W ",
                "X Z",
                " Y ",
                'W', Items.milk_bucket, 'X', Items.sugar, 'Y', Items.wheat, 'Z', Items.egg
        });

        GameRegistry.addRecipe(new ItemStack(ModItems.rollingPin), new Object[] {
                "   ",
                "XYX",
                "   ",
                'X', Items.stick, 'Y', Blocks.planks
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flatDough), new Object[]{
                ModItems.dough, ModItems.rollingPin
        });

        GameRegistry.addRecipe(new ItemStack(ModItems.cutter), new Object[]{
                " X ",
                "X X",
                " X ",
                'X', Items.iron_ingot
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rawDonut), new Object[]{
                ModItems.flatDough, ModItems.cutter
        });

        GameRegistry.addSmelting(new ItemStack(ModItems.rawDonut), new ItemStack(ModItems.cookedDonut), 0.1F);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pastryBag), new Object[]{
                Blocks.chest, Blocks.hopper
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.shaker), new Object[]{
                Blocks.iron_bars, Items.bucket
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.strawberryIcing), new Object[]{
                Items.sugar, ModItems.strawberry
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.chocolateIcing), new Object[]{
                Items.sugar, new ItemStack(Items.dye,1,3)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blueberryIcing), new Object[]{
                Items.sugar, ModItems.blueberry
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.vanillaIcing), new Object[]{
                Items.sugar, ModItems.vanillaBean
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.greenSprinkles), new Object[]{
                Items.sugar, new ItemStack(Items.dye,1,2)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blueSprinkles), new Object[]{
                Items.sugar, new ItemStack(Items.dye,1,4)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.redSprinkles), new Object[]{
                Items.sugar, new ItemStack(Items.dye,1,1)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.yellowSprinkles), new Object[]{
                Items.sugar, new ItemStack(Items.dye,1,11)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.orangeSprinkles), new Object[]{
                Items.sugar, new ItemStack(Items.dye,1,14)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rainbowSprinkles), new Object[]{
                Items.sugar, new ItemStack(Items.dye,1,14), new ItemStack(Items.dye,1,11), new ItemStack(Items.dye,1,1), new ItemStack(Items.dye,1,4), new ItemStack(Items.dye,1,2)
        });
    }
}
