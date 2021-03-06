package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.creativetabs.ModCreativeTabs;
import com.munchicken.multidonutsmod.help.Reference;
import net.minecraft.item.Item;

/**
 * Created by Munchicken on 6/22/2015.
 */
public abstract class ItemDonuts extends Item {
    public  ItemDonuts(String name) {

        super();
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5).toLowerCase());
        setCreativeTab(ModCreativeTabs.tabDonut);
    }
}
