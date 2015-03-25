package com.munchicken.multidonutsmod.creativetabs;

import com.munchicken.multidonutsmod.items.Donut;
import com.munchicken.multidonutsmod.items.ItemDonuts;
import com.munchicken.multidonutsmod.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabsMultiDonutsMod extends CreativeTabs {

    public CreativeTabsMultiDonutsMod(String tabLabel){

        super(tabLabel);
    }

    @Override
    public Item getTabIconItem(){

        return ModItems.donut;
    }
}
