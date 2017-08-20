package com.munchicken.multidonutsmod.items;

import com.munchicken.multidonutsmod.creativetabs.ModCreativeTabs;
import com.munchicken.multidonutsmod.help.Reference;
import net.minecraft.item.ItemFood;

/**
 * Created by Munchicken on 8/19/2017.
 */
public class RedSprinkles extends ItemFood {

    public RedSprinkles() {
        super(2, 0.1f, true);
        setUnlocalizedName("RedSprinkles");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5).toLowerCase());
        setCreativeTab(ModCreativeTabs.tabDonut);
    }
}
